package com.example.greul.videogametrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitQuiz = (Button) findViewById(R.id.submitButton);
        submitQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateScore();
            }


        });

    }

    int numberOfQuestions = 0;
    int questionsCorrect = 0;

    public void calculateScore(){
        
    }

    public void displayScore(){

    }
}
