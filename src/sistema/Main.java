/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistema.classes.FrmLogin;
import persistencia.ManipulaBanco;

/**
 *
 * @author Jonatas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
        try {
            DriverManager.getConnection("jdbc:mysql://192.168.0.104:3306:/banco", "jonatas", "");
        } catch (Exception e) {
            ManipulaBanco manabd = new ManipulaBanco();
            if (e.getLocalizedMessage().equals("Unknown database 'banco'")) {
                manabd.criarBancoNovo();
            }
        }
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }
}
