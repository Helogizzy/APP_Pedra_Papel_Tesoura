package com.example.pedra_papel_tesoura;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.Drawable;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int escolha_user = 9999;

    public void pedra(View view){
        verifica_jogo(0);
    }

    public void papel(View view){
        verifica_jogo(1);
    }

    public void tesoura(View view){
        verifica_jogo(2);
    }

    void verifica_jogo(int escolha_user){
        int escolha_pc = new Random().nextInt(3);
        ImageView imagem = findViewById(R.id.resultado_pc);
        switch (escolha_pc) {
            case (0):
                imagem.setImageResource(R.drawable.pedra);
                break;
            case (1):
                imagem.setImageResource(R.drawable.papel);
                break;
            case (2):
                imagem.setImageResource(R.drawable.tesoura);
                break;
            default:
                imagem.setImageResource(R.drawable.fundo);
        }

        TextView resultado_final = findViewById(R.id.resultado_final);
        if (escolha_user == 0 && escolha_pc == 1) {
            resultado_final.setText("Você perdeu!!!");
        }
        else if (escolha_user == 0 && escolha_pc == 2) {
            resultado_final.setText("Você ganhou!!!");
        }
        else if (escolha_user == 1 && escolha_pc == 0) {
            resultado_final.setText("Você ganhou!!!");
        }
        else if (escolha_user == 1 && escolha_pc == 2) {
            resultado_final.setText("Você perdeu!!!");
        }
        else if (escolha_user == 2 && escolha_pc == 0) {
            resultado_final.setText("Você perdeu!!!");
        }
        else if (escolha_user == 2 && escolha_pc == 1) {
            resultado_final.setText("Você ganhou!!!");
        }
        else {
            resultado_final.setText("Você empatou!!!");
        }

    }

}

