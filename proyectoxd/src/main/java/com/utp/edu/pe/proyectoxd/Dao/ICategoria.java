package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.Categoria;


import java.util.List;

public interface ICategoria {

    List<Categoria> Listar();

    int Insertar (Categoria objeto);

    int Actualizar(Categoria objeto);

    int Eliminar(long IdCategoria);
}
