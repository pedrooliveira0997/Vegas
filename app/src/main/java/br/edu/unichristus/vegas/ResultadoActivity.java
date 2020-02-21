package br.edu.unichristus.vegas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();
        String result = (String) intent.getSerializableExtra("RESULTADO");
        TextView textResult = (TextView) findViewById(R.id.textviewResult);
        textResult.setText("O Resultado da soma dos dados é:"+result);

    }
}
