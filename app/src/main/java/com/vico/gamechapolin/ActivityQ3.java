package com.vico.gamechapolin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityQ3 extends AppCompatActivity
{

    Button btnOpcao1Q3, btnOpcao2Q3;
    TextView txtPontosQ3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        btnOpcao1Q3 = findViewById(R.id.btnOpcao1Q3);
        btnOpcao2Q3 = findViewById(R.id.btnOpcao2Q3);
        txtPontosQ3 = findViewById(R.id.txtPontosQ3);
        txtPontosQ3.setText("Pontos atuais: " + MainActivity.acertos++);

        btnOpcao1Q3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // MainActivity.acertos++;
                abrirFinal();
            }
        });
        btnOpcao2Q3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                // MainActivity.acertos++;
                abrirFinal();
            }
        });
    }
    private void abrirFinal(){
        Intent janela = new Intent(this, ActivityFinal.class);
        startActivity(janela);
        finish();
    }

    @Override
    public void onBackPressed()
    {
        Toast.makeText(this,"Você não pode voltar!", Toast.LENGTH_LONG).show();
    }

}