package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClienteDao implements ICliente {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ClienteDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public List<Cliente> Listar() {
    String SQL = "SELECT * FROM  Cliente WHERE bestado = 1";
    return jdbcTemplate.query(SQL, new ClienteRowMapper());
    }

    @Override
    public int Insertar(Cliente objeto) {
    String SQL = "INSERT INTO Cliente (Nombre, Apellido, Dni, correoelectronico, telefono, direccion) VALUES (?, ?)"   ;
    return jdbcTemplate.update(SQL, objeto.getNombre(), objeto.getApellido(), objeto.getDni(), objeto.getCorreoelectronico(), objeto.getTelefono(), objeto.getDireccion());
    }

    @Override
    public int Actualizar(Cliente objeto){
        String SQL = "UPDATE Cliente SET nombre = ?, Apellido = ?, Dni = ?, correoelectronico = ? ,telefono = ? ,direccion = ? WHERE IdCliente = ? AND bestado = 1";
        return jdbcTemplate.update(SQL, objeto.getNombre(), objeto.getApellido(), objeto.getDni(), objeto.getCorreoelectronico(),objeto.getTelefono(), objeto.getDireccion());
    }

    @Override
    public int Eliminar(long IdCliente) {
        String SQL = "UPDATE Cliente SET Estado = 0 WHERE IdCliente = ? AND bestado = 1";
        return jdbcTemplate.update(SQL, IdCliente);


    }
    private static class ClienteRowMapper implements RowMapper<Cliente>{
    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Cliente(
         rs.getLong("IdCliente"),
         rs.getBoolean("bestado"),
         rs.getString("Nombre"),
         rs.getString("Apelliido"),
         rs.getInt("Dni"),
         rs.getString("Correoelectronico"),
         rs.getString("telefono"),
         rs.getString("direccion")
        );
    }

    }
}
