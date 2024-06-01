package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.CarritoCompra;
import com.utp.edu.pe.proyectoxd.Model.Cliente;

import java.util.List;

public interface ICarritoCompra {

    public List<CarritoCompra> Listar();

    int Insertar (CarritoCompra objeto);

    int Actualizar(CarritoCompra objeto);

    int Eliminar(long IdCarritoCompra);

}
