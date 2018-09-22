/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.sql.SQLException;
import sistema.classes.FrmLogin;

/**
 *
 * @author potato
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws SQLException {
		// TODO code application logic here
                FrmLogin login = new FrmLogin();
                login.setVisible(true);
                
	}
	
}
