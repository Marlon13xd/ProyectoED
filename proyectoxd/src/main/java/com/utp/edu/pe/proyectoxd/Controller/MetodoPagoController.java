package com.utp.edu.pe.proyectoxd.Controller;

import com.utp.edu.pe.proyectoxd.Dao.MetodoPagoDao;
import com.utp.edu.pe.proyectoxd.Model.MetodoPago;
import com.utp.edu.pe.proyectoxd.Service.ServiceMetodoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/MetodoPago")
public class MetodoPagoController {

    private ServiceMetodoPago serviceMetodoPago;

    @Autowired
    public MetodoPagoController( ServiceMetodoPago serviceMetodoPago){
        this.serviceMetodoPago = serviceMetodoPago;
    }

    @GetMapping
    public List <MetodoPago> Listar(){ return serviceMetodoPago.Listar();}

    @PostMapping
    public int Insertar (MetodoPago metodoPago){ return serviceMetodoPago.Insertar(metodoPago);}

    @PutMapping("/{IdMetodoPago}")
    public int Actualizar (long IdMetodoPago,MetodoPago metodoPago){ return serviceMetodoPago.Actualizar(metodoPago);}

    @DeleteMapping("/IdMetodoPago}")
    public  int Eliminar (long IdMetodoPago){ return serviceMetodoPago.Eliminar(IdMetodoPago);}

}
