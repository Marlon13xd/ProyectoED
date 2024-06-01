package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.CarritoCompra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CarritoCompraDao implements ICarritoCompra {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CarritoCompraDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public List<CarritoCompra> Listar() {
        String SQL = "SELECT * FROM  CarritoCompra WHERE bestado = 1";
        return jdbcTemplate.query(SQL, new CarritoCompraDao.CarritoCompraRowMapper());
    }

    @Override
    public int Insertar(CarritoCompra objeto) {
        String SQL = "INSERT INTO CarritoCompra (IdProducto,Cantidad ) VALUES (?, ?)"   ;
        return jdbcTemplate.update(SQL, objeto.getIdProducto(), objeto.getCantidad());
    }

    @Override
    public int Actualizar(CarritoCompra objeto){
        String SQL = "UPDATE Categoria SET Cantidad = ?  WHERE IdProducto= ? AND bestado = 1";
        return jdbcTemplate.update(SQL, objeto.getCantidad());
    }

    @Override
    public int Eliminar(long IdCarritoCompra) {
        String SQL = "UPDATE CarritoCompra SET IdProducto = 0 WHERE IdCarritoCompra = ? ";
        return jdbcTemplate.update(SQL, IdCarritoCompra);


    }
    private static class CarritoCompraRowMapper implements RowMapper<CarritoCompra> {
        @Override
        public CarritoCompra mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new CarritoCompra(
                    rs.getLong("IdCarritoCompra"),
                    rs.getBoolean("bestado"),
                    rs.getLong("IdCliente"),
                    rs.getLong("IdProducto"),
                    rs.getInt("Cantidad")
            );
        }

    }
}

