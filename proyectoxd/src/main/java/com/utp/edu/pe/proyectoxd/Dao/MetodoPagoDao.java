package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.MetodoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MetodoPagoDao implements IMetododePago{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MetodoPagoDao(JdbcTemplate jdbcTemplate){
        this. jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<MetodoPago> Listar() {
        String SQL = "SELECT * FROM MetodoPago Where bestado = 1";
        return jdbcTemplate.query(SQL, new  MetodoPagoRowMapper());
    }

    @Override
    public int Insertar(MetodoPago objeto) {
        String SQL = "INSERT INTO MetodoPago (nombre, descripcion) VALUES (? , ?)";
        return jdbcTemplate.update(SQL, objeto.getNombre(),objeto.getDescripcion());
    }

    @Override
    public int Actualizar(MetodoPago objeto) {
        String SQL = "UPDATE MetodoPago SET nombre = ?, descripcion = ? WHERE IdCategoria = ? AND bestado = 1 ";
        return jdbcTemplate.update(SQL, objeto.getNombre(), objeto.getDescripcion());
    }

    @Override
    public int Eliminar(long IdMetodopago) {
        String SQL = "UPDATE MetodoPago SET bestado = 0 WHERE IdMetodoPago = ? AND bestado = 1 ";
        return jdbcTemplate.update(SQL, IdMetodopago);
    }

    public static class  MetodoPagoRowMapper implements RowMapper<MetodoPago>{

        @Override
        public MetodoPago mapRow(ResultSet rs, int rowNum) throws SQLException {

            return new MetodoPago(
                    rs.getLong("IdMetodoPago"),
                    rs.getString("nombre"),
                    rs.getString("descripcion")
            );
        }
    }

}
