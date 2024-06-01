package com.utp.edu.pe.proyectoxd.Service;

import com.utp.edu.pe.proyectoxd.Dao.ProductoDao;
import com.utp.edu.pe.proyectoxd.Model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProductoDao {

    @Autowired
    private ProductoDao rproducto;

    public List<Producto> Listar(){return rproducto.Listar();}

    public int Insertar (Producto producto){return  rproducto.Insertar(producto);}

    public int Actualizar (Producto producto){return  rproducto.Actualizar(producto);}

    public int Eliminar (long IdProducto){return  rproducto.Eliminar(IdProducto);}
}
