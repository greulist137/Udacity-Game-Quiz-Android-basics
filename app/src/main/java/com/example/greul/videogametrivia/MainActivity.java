package com.example.greul.videogametrivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
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
    String userName = "";

    public void calculateScore(){
     EditText name = (EditText) findViewById(R.id.nameEntry);
     userName = name.getText().toString();
     displayScore();

        RadioButton q1 = (RadioButton) findViewById(R.id.Question1);
        RadioButton q2 = (RadioButton) findViewById(R.id.Question2);
        RadioButton q3 = (RadioButton) findViewById(R.id.Question3);
        RadioButton q4 = (RadioButton) findViewById(R.id.Question4);
        CheckBox q5a = (CheckBox) findViewById(R.id.Question5_1);
        CheckBox q5b = (CheckBox) findViewById(R.id.Question5_2);
        CheckBox q5c = (CheckBox) findViewById(R.id.Question5_3);
    }


    //The DisplayScore method will show the users score out of total questions via a Toast Message
    public void displayScore(){
        Toast displayToast = Toast.makeText(this, userName, Toast.LENGTH_LONG);
        displayToast.show();
    }
}
