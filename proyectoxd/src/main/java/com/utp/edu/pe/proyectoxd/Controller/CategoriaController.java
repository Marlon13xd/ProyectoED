package com.utp.edu.pe.proyectoxd.Controller;

import com.utp.edu.pe.proyectoxd.Model.Categoria;
import com.utp.edu.pe.proyectoxd.Service.ServiceCategoriaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;

@Controller
@RequestMapping("/Categoria")
public class CategoriaController {

    private final ServiceCategoriaDao serviceCategoriaDao;

    @Autowired
    public CategoriaController(ServiceCategoriaDao serviceCategoriaDao){
        this.serviceCategoriaDao = serviceCategoriaDao;
    }

    @GetMapping
    public List <Categoria> Listar(){ return  serviceCategoriaDao.Listar();}

    @PostMapping
    public int Insertar(Categoria categoria){ return serviceCategoriaDao.Insertar(categoria);}

    @PutMapping("/{IdCategoria}")
    public int Actualizar (long IdCategoria, Categoria categoria){ return serviceCategoriaDao.Actualizar(categoria);}

    @DeleteMapping("/{IdCategoria}")
    public int Eliminar (long IdCategoria){ return serviceCategoriaDao.Eliminar(IdCategoria);}
}
