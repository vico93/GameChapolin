package com.vico.gamechapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import java.net.URI;

public class ActivityFinal extends AppCompatActivity
{
    Button btnSair, btnReiniciar;
    TextView txtPontosFinal;
    VideoView vdvFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        btnSair = findViewById(R.id.btnSair);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        txtPontosFinal = findViewById(R.id.txtPontosFinal);
        vdvFinal = findViewById(R.id.vdvFinal);

        // Parar a música
        MainActivity.mp.stop();

        /*
            O caminho do vídeo e definido pela criação do caminho usando a classe URI
            Define o nome que recebe ela mesma ou a definição do caminho
            getPackageName(): é o espaço de nome do meu projeto
        */
        if (MainActivity.acertos == 3)
        {
            Uri caminho = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bonus);
            vdvFinal.setVideoURI(caminho);
            vdvFinal.start();
        }

        txtPontosFinal.setText("Pontos Aguais: " + MainActivity.acertos++);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.acertos = 0;
                abrirMain();
            }
        });
    }

    private void abrirMain()
    {
        Intent janela = new Intent(this, MainActivity.class);
        startActivity(janela);
        finish();
    }
}