package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductoDao implements IProducto{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductoDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public List<Producto> Listar() {
        String SQL = "SELECT * FROM  Producto WHERE estado = 1";
        return jdbcTemplate.query(SQL, new ProductoDao.ProductoRowMapper());
    }

    @Override
    public int Insertar(Producto objeto) {
        String SQL = "INSERT INTO Producto (IdCategoria, nombre, precio, descripcion) VALUES (?, ?, ?, ?)"   ;
        return jdbcTemplate.update(SQL,objeto.getIdCategoria(), objeto.getNombre(),objeto.getPrecio(),objeto.getDescripcion());
    }

    @Override
    public int Actualizar(Producto objeto){
        String SQL = "UPDATE Producto SET IdCategoria = ?, nombre = ?, precio = ? descripcion = ? WHERE IdProducto = ? AND Estado = 1";
        return jdbcTemplate.update(SQL, objeto.getIdProducto(), objeto.getNombre(), objeto.getPrecio(), objeto.getDescripcion());
    }

    @Override
    public int Eliminar(long IdProducto) {
        String SQL = "UPDATE Producto SET Estado = 0 WHERE IdCCategoria = ? AND Estado = 1";
        return jdbcTemplate.update(SQL, IdProducto);


    }
        private static class ProductoRowMapper implements RowMapper<Producto> {
        @Override
        public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Producto(
                    rs.getLong("IdProducto"),
                    rs.getBoolean("estado"),
                    rs.getLong("IdCategoria"),
                    rs.getString("nombre"),
                    rs.getFloat("precio"),
                    rs.getString("Descripcion")
            );
        }

    }
}

