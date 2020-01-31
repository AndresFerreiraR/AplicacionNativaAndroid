package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.WebView.WVActividad;
import com.example.WebView.WVUmbActividad;
import com.example.mensajes.MensajeActividad;

public class principalActividad extends AppCompatActivity {

    //region Atributos
    private Button btnLink;
    private Button btnBusqueda;
    private Button btnMensajes;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);

        btnLink = findViewById(R.id.btn_link);
        btnLink.setOnClickListener(onClickLink);

        btnBusqueda = findViewById(R.id.btn_busqueda);
        btnBusqueda.setOnClickListener(onClickBusqueda);

        btnMensajes = findViewById(R.id.btn_msj);
        btnMensajes.setOnClickListener(onClickMensajes);
    }

    private View.OnClickListener onClickLink= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), WVUmbActividad.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener onClickBusqueda = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), WVActividad.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener onClickMensajes = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), MensajeActividad.class);
            startActivity(intent);
        }
    };


}
