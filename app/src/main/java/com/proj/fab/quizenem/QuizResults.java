package com.proj.fab.quizenem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewQuiz = findViewById(R.id.novoQuizBtn);
        final TextView respostaCerta = findViewById(R.id.corretas);
        final TextView respostaErrada = findViewById(R.id.erradas);

        final int getCorrectAnswer =getIntent().getIntExtra("correct",0);
        final int getIncorrectAnswer =getIntent().getIntExtra("incorrect",0);

        respostaCerta.setText("Certas: "+String.valueOf(getCorrectAnswer));
        respostaErrada.setText("Erradas: "+String.valueOf(getIncorrectAnswer));

        startNewQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}