package com.utp.edu.pe.proyectoxd.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

    private long IdCliente;
    private boolean estado;
    private String nombre;
    private String apellido;
    private int dni;
    private String correoelectronico;
    private String telefono;
    private String direccion;
}
