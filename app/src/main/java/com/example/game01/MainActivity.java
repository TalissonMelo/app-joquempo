package com.example.game01;

import androidx.appcompat.app.AppCompatActivity;

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

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String msg){

        ImageView img = findViewById(R.id.imageView5);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};

        String opcapApp = opcoes[numero];

        switch (opcapApp){
            case "pedra" :
                img.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                img.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                img.setImageResource(R.drawable.tesoura);
                break;
            default:
        }

        TextView text = findViewById(R.id.textView3);
        text.setText(msg);
    }


}
