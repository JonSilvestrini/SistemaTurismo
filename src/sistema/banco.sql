drop database if exists banco;
create database banco;

use banco;

create table clientes(
	codigo int auto_increment,
	nome varchar(50),
	fone varchar(15),
	data_nasc date,
	primary key (codigo)
);

create table viagens(
	codigo int auto_increment,
	descricao varchar(50),
	preco float,
	foto varchar(50),
	primary key (codigo)
);

create table usuarios(
	codigo int auto_increment,
	nome varchar(50),
	senha varchar(15),
	primary key (codigo)
);

create table vendas(
	codtur int auto_increment,
	codcli int,
	codvi int,
	data_saida date,
	data_chegada date,
	n_pessoas int,
	valor float,
	primary key (codtur)
);

alter table vendas add foreign key (codcli) references clientes (codigo);

alter table vendas add foreign key (codvi) references viagens (codigo);