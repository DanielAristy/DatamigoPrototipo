package com.example.datamigoprototipo.entity;

import android.widget.Button;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Factura {

    private int imagen;
    private String proveedor;
    private String fecha;
    private String valorTotal;

}
