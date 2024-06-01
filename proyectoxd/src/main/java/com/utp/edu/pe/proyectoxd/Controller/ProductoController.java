package com.utp.edu.pe.proyectoxd.Controller;

import com.utp.edu.pe.proyectoxd.Model.Producto;
import com.utp.edu.pe.proyectoxd.Service.ServiceProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Producto")
public class ProductoController {

    private final ServiceProductoDao serviceProductoDao;

    @Autowired
    public ProductoController(ServiceProductoDao serviceProductoDao){
        this.serviceProductoDao = serviceProductoDao;
    }

    @GetMapping
    public List <Producto> Listar(){ return serviceProductoDao.Listar();}

    @PostMapping
    public int Insertar( Producto producto){ return serviceProductoDao.Insertar(producto);}

    @PutMapping("/{IdProducto}")
    public int Actualizar (long IdProducto, Producto producto){ return serviceProductoDao.Actualizar(producto);}

    @DeleteMapping("/{IdProducto")
    public  int Eliminar (long IdProducto){ return serviceProductoDao.Eliminar(IdProducto);}
}
