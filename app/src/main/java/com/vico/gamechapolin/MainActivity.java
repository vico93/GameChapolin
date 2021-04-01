package com.vico.gamechapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button btnIniciar;

    public static MediaPlayer mp;
    public static int acertos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.fundo);

        btnIniciar = findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                abrirQ1();
            }
        });
    }

    private void abrirQ1()
    {
        Intent janelaQ1 = new Intent(this, ActivityQ1.class);

        startActivity(janelaQ1);
        finish();
    }
}