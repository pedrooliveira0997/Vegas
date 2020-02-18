package br.edu.unichristus.vegas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);

        final ImageView leftDice = findViewById(R.id.image_leftDice);

        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int [] diceeArray = { //final torna o array constante
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice", "Entrou no clique no botão!");

                int soma = 0;
                Random numberRandom = new Random();
                int number = numberRandom.nextInt(6); //aleatório [0,5];
                soma += number;
                leftDice.setImageResource(diceeArray[number]);
                number = numberRandom.nextInt(6);
                soma += number;
                rightDice.setImageResource(diceeArray[number]);


                String str = Integer.toString(soma);


            }
        });
    }
}
