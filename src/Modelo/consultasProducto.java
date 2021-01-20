/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author facue
 */
public class consultasProducto extends Conexion {

    public boolean registrar(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO producto(codigo,nombre,precio) values(?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Modelo.consultasProducto.registrar()");
            return false;
        } 
    }
    public boolean modificar(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE producto SET codigo=?, nombre=?, precio=? WHERE id=? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setDouble(3, pro.getPrecio());
            ps.setInt(4, pro.getId());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } 
    }
    public boolean eliminar(Producto pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "delete from producto where id=?" ;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.execute();
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } 
    }
    public boolean buscar(Producto pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "select * from producto where codigo=?" ;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getCodigo());
            rs = ps.executeQuery();
            if (rs.next())
            {
                pro.setId(Integer.parseInt(rs.getString("id")));
                pro.setCodigo(rs.getString("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(Double.parseDouble(rs.getString("precio")));
            }
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        } 
       
    }
}
