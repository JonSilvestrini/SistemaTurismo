/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import static java.awt.Frame.MAXIMIZED_BOTH;
import sistema.classes.frmMenu;

/**
 *
 * @author potato
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
                frmMenu menu = new frmMenu();
                menu.setExtendedState(MAXIMIZED_BOTH);
                menu.setVisible(true);
	}
	
}
