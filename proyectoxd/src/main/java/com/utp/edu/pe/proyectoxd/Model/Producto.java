package com.utp.edu.pe.proyectoxd.Model;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @NotNull
    private long IdProducto;
    @NotNull
    private Boolean Estado;
    @NotNull
    private Long IdCategoria;
    @NotNull
    private String Nombre;
    private Float Precio;
    @NotNull
    private String Descripcion;


}
