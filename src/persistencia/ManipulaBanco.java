/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonatas
 */
public class ManipulaBanco {

    public void criarBancoNovo() throws FileNotFoundException, IOException, SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.104:3306", "jonatas", "");
        PreparedStatement stmt = null;
        URL fileUrl = getClass().getResource("/sistema/criarbanco.sql");
        File arquivo = new File(fileUrl.getFile());
        FileReader arq = new FileReader(arquivo);
        BufferedReader lerArq = new BufferedReader(arq);
        String sql = lerArq.readLine();
        while (sql != null) {
            stmt = conn.prepareStatement(sql);
            stmt.executeQuery();
            sql = lerArq.readLine();
        }
        arq.close();
        stmt.close();
        conn.close();
    }

}
