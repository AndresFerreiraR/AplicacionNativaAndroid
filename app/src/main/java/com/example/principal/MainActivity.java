package com.example.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.WebView.WVActividad;

public class MainActivity extends AppCompatActivity {

    //region Atributos
    private Button btnBusqueda;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);

        btnBusqueda = findViewById(R.id.btn_busqueda);
        btnBusqueda.setOnClickListener(onClickBusqueda);
    }

    private View.OnClickListener onClickBusqueda = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getBaseContext(), WVActividad.class);
            startActivity(intent);
        }
    };


}
