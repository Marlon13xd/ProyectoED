package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.Categoria;
import com.utp.edu.pe.proyectoxd.Model.Producto;

import java.util.List;

public interface IProducto {
    List<Producto> Listar();

    int Insertar (Producto objeto);

    int Actualizar(Producto objeto);

    int Eliminar(long IdProducto);

}
