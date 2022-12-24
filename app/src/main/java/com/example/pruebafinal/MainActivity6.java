package com.example.pruebafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    private Button btnVerEventos, btnRegistrar;

    private void pantallaVisualizarEventos(){
        String nombre = getIntent().getExtras().getString("nombreUsuario");
        Intent pantallaregistrarevento = new Intent(this, MainActivity5.class);
        pantallaregistrarevento.putExtra("nombreUsuario",nombre);
        startActivity(pantallaregistrarevento);
    }


    private void pantallaregistrarevento(){
        String nombre = getIntent().getExtras().getString("nombreUsuario");
        Intent pantallaregistrarevento = new Intent(this, MainActivity7.class);
        pantallaregistrarevento.putExtra("nombreUsuario",nombre);
        startActivity(pantallaregistrarevento);
    }



    //REferences



    private void referencias(){
        btnRegistrar = findViewById(R.id.btnAgregarEventos);
        btnVerEventos= findViewById(R.id.btnVerEventos);

    }

    private void eventos(){
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { pantallaregistrarevento();

            }
        });
        btnVerEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {pantallaVisualizarEventos();

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        referencias();
        eventos();
        String nombre = getIntent().getExtras().getString("nombreUsuario");
    }


}