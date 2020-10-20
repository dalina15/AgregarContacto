package com.example.agregarcontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
        Bundle siguiente=getIntent().getExtras();
        String nombre = siguiente.getString(Intent.EXTRA_TEXT);
        String fecha = siguiente.getString(Intent.EXTRA_TEXT);
        String telefono = siguiente.getString(Intent.EXTRA_TEXT);
        String correo = siguiente.getString(Intent.EXTRA_TEXT);
        String descripcion = siguiente.getString(Intent.EXTRA_TEXT);

        TextView editTextTextNombre = (TextView) findViewById(R.id.editTextTextNombre);
        TextView btnfecha = (TextView) findViewById(R.id.btnfecha);
        TextView editTextPhone = (TextView) findViewById(R.id.editTextPhone);
        TextView editTextTextEmail = (TextView) findViewById(R.id.editTextTextEmail);
        TextView editTextTextDescripcion = (TextView) findViewById(R.id.editTextTextDescripcion);

        //editTextTextNombre.setText(pnombre);
    }


}