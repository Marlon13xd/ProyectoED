package com.utp.edu.pe.proyectoxd.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    private long IdCategoria;
    private boolean estado;
    private String nombre;
    private String descrpcion;

}
