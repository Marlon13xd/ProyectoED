package com.utp.edu.pe.proyectoxd.Controller;

import com.utp.edu.pe.proyectoxd.Model.CarritoCompra;
import com.utp.edu.pe.proyectoxd.Service.ServiceCarritoCompraDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class CarritoCompraController {

   private final ServiceCarritoCompraDao serviceCarritoCompraDao;

   @Autowired
    public CarritoCompraController(ServiceCarritoCompraDao serviceCarritoCompraDao){
       this.serviceCarritoCompraDao = serviceCarritoCompraDao;
   }

   @GetMapping
    public List<CarritoCompra> Listar(){ return serviceCarritoCompraDao.Listar();}

    @PostMapping
    public int Insertar (CarritoCompra carritoCompra){return serviceCarritoCompraDao.Insertar(carritoCompra);}

    @PutMapping("/{IdCarritoCompra")
    public  int Actualizar (long IdProducto, CarritoCompra carritoCompra){return serviceCarritoCompraDao.Actualizar(carritoCompra);}

    @DeleteMapping("/IdCarritoCompra")
    public int Eliminar (long IdCarritoCompra, CarritoCompra carritoCompra){return serviceCarritoCompraDao.Eliminar(IdCarritoCompra);}

}
