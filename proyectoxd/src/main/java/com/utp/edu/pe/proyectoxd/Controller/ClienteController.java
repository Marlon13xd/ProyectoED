package com.utp.edu.pe.proyectoxd.Controller;

import com.utp.edu.pe.proyectoxd.Model.Cliente;
import com.utp.edu.pe.proyectoxd.Service.ServicesClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Cliente")
public class ClienteController {

    private final ServicesClienteDao servicesClienteDao;

    @Autowired
    public  ClienteController(ServicesClienteDao servicesClienteDao){
        this.servicesClienteDao=servicesClienteDao;
    }

    @GetMapping
    public List <Cliente> Listar(){return servicesClienteDao.Listar();}

    @PostMapping
    public int Insertar(Cliente cliente){ return servicesClienteDao.Insertar(cliente);}

    @PutMapping
    public  int Actualizar (long IdCliente , Cliente cliente){ return servicesClienteDao.Actualizar(cliente);}

    @DeleteMapping
    public  int Eliminar (long IdCliente){ return servicesClienteDao.Eliminar(IdCliente);}
}
