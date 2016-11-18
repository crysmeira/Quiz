package com.crystianemeira.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by crystiane on 11/18/16.
 */

public class Question2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        // Set the question
        TextView question = (TextView) findViewById(R.id.tv_question);
        question.setText(R.string.question2);

        // Set the options
        RadioButton op1 = (RadioButton) findViewById(R.id.option1);
        op1.setText(R.string.lisa);
        RadioButton op2 = (RadioButton) findViewById(R.id.option2);
        op2.setText(R.string.ruby);
        RadioButton op3 = (RadioButton) findViewById(R.id.option3);
        op3.setText(R.string.jessica);
        RadioButton op4 = (RadioButton) findViewById(R.id.option4);
        op4.setText(R.string.carol);
        RadioButton op5 = (RadioButton) findViewById(R.id.option5);
        op5.setText(R.string.abbie);

        Button next = (Button) findViewById(R.id.bt_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question2.this, Question3.class);
                startActivity(intent);
            }
        });
    }
}
