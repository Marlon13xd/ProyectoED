package com.utp.edu.pe.proyectoxd.Service;


import com.utp.edu.pe.proyectoxd.Dao.CarritoCompraDao;
import com.utp.edu.pe.proyectoxd.Model.CarritoCompra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCarritoCompraDao {

    @Autowired
    private CarritoCompraDao rcarritocompra;

    public List<CarritoCompra> Listar() {return rcarritocompra.Listar();}

    public int Insertar(CarritoCompra carritoCompra){return rcarritocompra.Insertar(carritoCompra);}

    public int Actualizar(CarritoCompra carritoCompra){return rcarritocompra.Actualizar(carritoCompra);}

    public int Eliminar (long IdCarritoCompra){return rcarritocompra.Eliminar(IdCarritoCompra);}



}
