package com.example.datamigoprototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.datamigoprototipo.adapter.FacturaAdapter;
import com.example.datamigoprototipo.entity.Factura;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.listaViewFacturas)
    public ListView listaWiewFacturas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Para mostra las lista*/
        ButterKnife.bind(this);
        loadInfo();

    }

    private void loadInfo() {

        List<Factura> listaFacturas = new ArrayList<>();
        listaFacturas.add(new Factura(R.drawable.factura, "Mayorca","22/02/2020", "$ 130000"));
        listaFacturas.add(new Factura(R.drawable.factura, "Exito","22/02/2009", "$ 130000"));
        listaFacturas.add(new Factura(R.drawable.factura, "Caruya","22/02/2010", "$ 130000"));
        listaFacturas.add(new Factura(R.drawable.factura, "Carrefur","22/02/2020", "$ 130000"));
        FacturaAdapter facturaAdapter = new FacturaAdapter(this,listaFacturas);
        listaWiewFacturas.setAdapter(facturaAdapter);
    }
}
