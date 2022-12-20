package com.example.designui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ocultando a barra de ação
        getSupportActionBar().hide();

        // Colocando o aplicativo atrás das barras do sistema
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
    }
}