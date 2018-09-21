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

    public List findAll() throws SQLException{
        String sql = "select * from usuarios;";
        Connection conn = ConnectionFactory.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<Usuarios> users = new ArrayList();
        while (rs.next()){
            System.out.println(rs.getInt("codigo") + rs.getString("nome") + rs.getString("senha"));
            /*user.setCodigo(rs.getInt("codigo"));
            user.setNome(rs.getString("nome"));
            user.setSenha(rs.getString("senha"));
            users.add(user);*/
            user.setCodigo(rs.getInt("codigo"));
        }
        stmt.close();
        conn.close();
        return users;
    }
}
