package com.utp.edu.pe.proyectoxd.Service;

import com.utp.edu.pe.proyectoxd.Dao.MetodoPagoDao;
import com.utp.edu.pe.proyectoxd.Model.MetodoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMetodoPago {

    @Autowired
    private MetodoPagoDao rmetodopago;

    public List<MetodoPago> Listar() { return rmetodopago.Listar();}

    public int Insertar (MetodoPago metodoPago) {return  rmetodopago.Insertar(metodoPago);}

    public int Actualizar(MetodoPago metodoPago) {return rmetodopago.Actualizar(metodoPago);}

    public int Eliminar(long IdMetodoPago) {return rmetodopago.Eliminar(IdMetodoPago);}
}
