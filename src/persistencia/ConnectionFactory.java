/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author jonatas
 */
public final class ConnectionFactory {

    public static Connection conectar() throws SQLException, IOException {
        try {
            return DriverManager.getConnection("jdbc:mysql://192.168.0.104:3306:/banco", "jonatas", "");
        } catch (Exception e) {
            if (e.getLocalizedMessage().equals("Unknown database 'banco'")) {
                ManipulaBanco criabd = new ManipulaBanco();
                criabd.criarBancoNovo();
            }
            return DriverManager.getConnection("jdbc:mysql://192.168.0.104:3306:/banco", "jonatas", "");
        }

    }

}
