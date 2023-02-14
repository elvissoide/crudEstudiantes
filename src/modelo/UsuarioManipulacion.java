package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioManipulacion {
    Conexionmysql enlace = new Conexionmysql(); //Instancia conexionmysql
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    private int r = 0;
    public Usuario buscar(int id){
        String sql = "SELECT * FROM usuarios WHERE idusuarios=" + String.valueOf(id);
        Usuario u = new Usuario();
        try {
            con = enlace.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println(rs);
            u.setId(rs.getInt(1));
            u.setNombre(rs.getString(2));
            u.setApellido(rs.getString(3));
            u.setCelular(rs.getString(4));
            u.setCorreo(rs.getString(5));
            con.close();
            ps.close();
            rs.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return u;
    }
}
