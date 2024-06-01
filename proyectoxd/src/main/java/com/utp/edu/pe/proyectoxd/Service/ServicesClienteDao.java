package com.utp.edu.pe.proyectoxd.Service;

import com.utp.edu.pe.proyectoxd.Dao.ClienteDao;
import com.utp.edu.pe.proyectoxd.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesClienteDao {

    @Autowired
    private ClienteDao rcliente;

    public List<Cliente> Listar() {  return rcliente.Listar(); }

    public int Insertar (Cliente cliente) { return rcliente.Insertar(cliente);}

    public int Actualizar (Cliente cliente) { return rcliente.Actualizar(cliente);}

    public int Eliminar (Long IdCliente){ return  rcliente.Eliminar(IdCliente);}
}
