package com.crystianemeira.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.crystianemeira.quiz.R.string.next;

/**
 * Created by crystiane on 11/17/16.
 */

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        // Set the question
        TextView question = (TextView) findViewById(R.id.tv_question);
        question.setText(R.string.question1);

        // Set the options
        RadioButton op1 = (RadioButton) findViewById(R.id.option1);
        op1.setText(R.string.harvard);
        RadioButton op2 = (RadioButton) findViewById(R.id.option2);
        op2.setText(R.string.stanford);
        RadioButton op3 = (RadioButton) findViewById(R.id.option3);
        op3.setText(R.string.yale);
        RadioButton op4 = (RadioButton) findViewById(R.id.option4);
        op4.setText(R.string.berkeley);
        RadioButton op5 = (RadioButton) findViewById(R.id.option5);
        op5.setText(R.string.princeton);

        Button next = (Button) findViewById(R.id.bt_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question1.this, Question2.class);
                startActivity(intent);
            }
        });
    }
}
