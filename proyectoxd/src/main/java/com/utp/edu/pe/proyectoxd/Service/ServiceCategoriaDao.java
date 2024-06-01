package com.utp.edu.pe.proyectoxd.Service;

import com.utp.edu.pe.proyectoxd.Dao.CategoriaDao;
import com.utp.edu.pe.proyectoxd.Model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategoriaDao {

    @Autowired
    private CategoriaDao rcategoria;

    public List<Categoria> Listar(){ return  rcategoria.Listar();}

    public int Insertar (Categoria categoria){ return rcategoria.Insertar(categoria); }

    public int Actualizar (Categoria categoria) {return  rcategoria.Actualizar(categoria);}

    public int Eliminar (long IdCategoria){ return  rcategoria.Eliminar(IdCategoria);}
}
