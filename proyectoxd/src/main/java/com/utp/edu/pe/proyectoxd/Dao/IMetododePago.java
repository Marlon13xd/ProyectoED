package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.MetodoPago;

import java.util.List;

public interface IMetododePago {

    List<MetodoPago> Listar();

    int Insertar (MetodoPago objeto);

    int Actualizar (MetodoPago objeto);

    int Eliminar (long IdMetodopago);

}
