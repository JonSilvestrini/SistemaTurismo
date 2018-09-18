/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jonatas
 */
public final class ConnectionFactory {
    
    public ConnectionFactory() throws SQLException{
        DriverManager.getConnection("jdbc:mysql://localhost/banco?user=jonatas");
    }
    
}
