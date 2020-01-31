package com.example.mensajes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import com.example.principal.R;
import com.example.visalizacionMensajes.VisalizacionMensajesActividad;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MensajeActividad extends AppCompatActivity {

    //region Atributos
    private String mensaje;
    private EditText etMensaje;
    private Button btnGuardar;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_mensajes);

        etMensaje = findViewById(R.id.ed_mensaje);
        mensaje = etMensaje.getText().toString();

        btnGuardar = findViewById(R.id.guardar);
        btnGuardar.setOnClickListener(onClickGuardar);

    }

    private void lanzarIntencion(String mensaje) {
        Intent intent = new Intent(getBaseContext(), VisalizacionMensajesActividad.class);
        intent.putExtra("keyString", mensaje);
        startActivity(intent);
    }

    private View.OnClickListener onClickGuardar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            lanzarIntencion(mensaje);
        }
    };
}
