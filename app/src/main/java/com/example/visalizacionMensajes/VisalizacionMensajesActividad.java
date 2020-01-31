package com.example.visalizacionMensajes;

import android.os.Bundle;
import android.widget.TextView;

import com.example.principal.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VisalizacionMensajesActividad extends AppCompatActivity {

    //region Atributos
    private String mensajeRecibido;
    private TextView textMensaje;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_visualizacion_mensajes);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mensajeRecibido = extras.getString("keyString");
        } else {
            mensajeRecibido = (String) savedInstanceState.getSerializable("keyString");
        }

        textMensaje = findViewById(R.id.ed_mensaje_visualizado);
        textMensaje.setText(mensajeRecibido);


    }
}
