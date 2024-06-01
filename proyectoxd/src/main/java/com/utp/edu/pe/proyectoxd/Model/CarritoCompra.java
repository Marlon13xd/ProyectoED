package com.utp.edu.pe.proyectoxd.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarritoCompra {
    private long IdCarritoCompra;
    private Boolean estado;
    private long IdCliente;
    private long IdProducto;
    private int cantidad;
}
