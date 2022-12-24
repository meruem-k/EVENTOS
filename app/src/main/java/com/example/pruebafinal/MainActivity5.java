package com.example.pruebafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    private Button btnVolverEventos;


    //References
    private void referencias (){
        btnVolverEventos = findViewById(R.id.btnVolverEventos);
    }

    private void eventos(){
        btnVolverEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        referencias();
        eventos();
    }


}