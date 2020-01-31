package com.example.mensajes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.principal.R;
import com.example.visalizacionMensajes.VisalizacionMensajesActividad;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MensajeActividad extends AppCompatActivity {

    //region Atributos
    private String mensaje;
    private EditText etMensaje;
    private Button btnGuardar;
    private Button btnVerMensajes;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_mensajes);

        etMensaje = findViewById(R.id.ed_mensaje);
        btnGuardar = findViewById(R.id.guardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mensaje = etMensaje.getText().toString();
                if (mensaje.isEmpty()) {
                    Toast toast2= Toast.makeText(getBaseContext(),"escriba un mensaje",Toast.LENGTH_LONG);
                    toast2.show();
                    btnVerMensajes.setVisibility(View.INVISIBLE);
                    return;
                }else {
                    btnVerMensajes.setVisibility(View.VISIBLE);
                }

                Toast toast= Toast.makeText(getBaseContext(),"guardado",Toast.LENGTH_LONG);
                toast.show();

                limpiarControl(etMensaje);
            }
        });


        btnVerMensajes= findViewById(R.id.mostrar);
        btnVerMensajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarIntencion(mensaje);
            }
        });

    }

    private void lanzarIntencion(String mensaje) {
        Intent intent = new Intent(getBaseContext(), VisalizacionMensajesActividad.class);
        intent.putExtra("keyString", mensaje);
        startActivity(intent);
    }

    private void limpiarControl(EditText editText) {
        editText.setText("");
    }

}
