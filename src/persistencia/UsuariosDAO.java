/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JONATASWILLIAMSILVES
 */
public class UsuariosDAO {

	private Usuarios user;

	public List findAll() throws SQLException {
		String sql = "select * from usuarios;";
		Connection conn = ConnectionFactory.conectar();
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		List<Usuarios> users = new ArrayList();
		while (rs.next()) {
			user = new Usuarios();
			user.setCodigo(rs.getInt("codigo"));
			user.setNome(rs.getString("nome"));
			user.setSenha(rs.getString("senha"));
			users.add(user);
		}
		stmt.close();
		conn.close();
		return users;
	}

	public List select(String value, String column) throws SQLException {
		Connection conn = ConnectionFactory.conectar();
		String sql = "select * from usuarios where ?=?;";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, column);
		stmt.setString(2, value);
		ResultSet rs = stmt.executeQuery();
		List<Usuarios> users = new ArrayList();
		while (rs.next()) {
			user = new Usuarios();
			user.setCodigo(rs.getInt("codigo"));
			user.setNome(rs.getString("nome"));
			user.setSenha(rs.getString("senha"));
			users.add(user);
		}
		stmt.close();
		conn.close();
		return users;
	}
	
	public void insert(String nome, String senha) throws SQLException{
		Connection conn = ConnectionFactory.conectar();
		String sql = "insert into usuarios (nome, senha) values (?,?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setString(2, senha);
		stmt.executeQuery();
	}
}
