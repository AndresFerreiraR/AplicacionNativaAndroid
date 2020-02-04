package com.example.launch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.principal.principalActividad;
import com.example.principal.R;

import androidx.annotation.Nullable;


public class launchActividad extends Activity {

    //region Atributos
    int tiempo = 3;
    //endregion


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_launch);
        iniciarLaunch();
    }

    private void iniciarLaunch() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(new Intent(getBaseContext(), principalActividad.class)));
                finish();
            }
        }, tiempo * 1000);

    }

}
