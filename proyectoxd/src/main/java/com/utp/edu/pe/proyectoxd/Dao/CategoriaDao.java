package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CategoriaDao implements ICategoria {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CategoriaDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public List<Categoria> Listar() {
        String SQL = "SELECT * FROM  Categoria WHERE bestado = 1";
        return jdbcTemplate.query(SQL, new CategoriaRowMapper());
    }

    @Override
    public int Insertar(Categoria objeto) {
        String SQL = "INSERT INTO Categoria (Nombre, descripcion) VALUES (?, ?)"   ;
        return jdbcTemplate.update(SQL, objeto.getNombre(), objeto.getDescrpcion());
    }

    @Override
    public int Actualizar(Categoria objeto){
        String SQL = "UPDATE Categoria SET nombre = ?, descripcion = ? WHERE IdCategoria = ? AND bestado = 1";
        return jdbcTemplate.update(SQL, objeto.getNombre(), objeto.getDescrpcion());
    }

    @Override
    public int Eliminar(long IdCategoria) {
        String SQL = "UPDATE Categoria SET Estado = 0 WHERE IdCCategoria = ? AND bestado = 1";
        return jdbcTemplate.update(SQL, IdCategoria);


    }
    private static class CategoriaRowMapper implements RowMapper<Categoria> {
        @Override
        public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Categoria(
                    rs.getLong("IdCategoria"),
                    rs.getBoolean("bestado"),
                    rs.getString("nombre"),
                    rs.getString("Descripcion")
                    );
        }

    }
}


