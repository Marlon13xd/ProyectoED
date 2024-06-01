package com.utp.edu.pe.proyectoxd.Dao;

import com.utp.edu.pe.proyectoxd.Model.Cliente;
import java.util.List;

public interface ICliente {

    List<Cliente> Listar();

    int Insertar (Cliente objeto);

    int Actualizar(Cliente objeto);

    int Eliminar(long id);

    }



