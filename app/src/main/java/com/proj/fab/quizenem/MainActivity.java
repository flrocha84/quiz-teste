package com.proj.fab.quizenem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout quimica = findViewById(R.id.quimicaLayout);
        final LinearLayout fisica = findViewById(R.id.fisicaLayout);
        final LinearLayout biologia = findViewById(R.id.biologiaLayout);
        final LinearLayout historia = findViewById(R.id.historiaLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);


        quimica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "quimica";
                quimica.setBackgroundResource(R.drawable.round_back_white_stroke);

                fisica.setBackgroundResource(R.drawable.round_back_white);
                biologia.setBackgroundResource(R.drawable.round_back_white);
                historia.setBackgroundResource(R.drawable.round_back_white);
                }
        });

        fisica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "fisica";
                fisica.setBackgroundResource(R.drawable.round_back_white_stroke);

                quimica.setBackgroundResource(R.drawable.round_back_white);
                biologia.setBackgroundResource(R.drawable.round_back_white);
                historia.setBackgroundResource(R.drawable.round_back_white);
            }
        });
        biologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "biologia";
                biologia.setBackgroundResource(R.drawable.round_back_white_stroke);

                quimica.setBackgroundResource(R.drawable.round_back_white);
                fisica.setBackgroundResource(R.drawable.round_back_white);
                historia.setBackgroundResource(R.drawable.round_back_white);
            }
        });
        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName = "historia";
                historia.setBackgroundResource(R.drawable.round_back_white_stroke);

                quimica.setBackgroundResource(R.drawable.round_back_white);
                biologia.setBackgroundResource(R.drawable.round_back_white);
                fisica.setBackgroundResource(R.drawable.round_back_white);
            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTopicName.isEmpty()) {
                    Toast.makeText(MainActivity.this,"Selecione um tópico",Toast.LENGTH_SHORT ).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(intent);
                }


            }
        });
    }
}