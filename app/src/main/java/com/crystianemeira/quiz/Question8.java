package com.crystianemeira.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by crystiane on 11/18/16.
 */

public class Question8 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        Bundle extras = getIntent().getExtras();
        final int points = extras.getInt("points");

        // Set the question
        TextView question = (TextView) findViewById(R.id.tv_question);
        question.setText(R.string.question8);

        // Set the options
        ArrayList<Integer> textViews = new ArrayList<>();
        textViews.add(R.id.option1);
        textViews.add(R.id.option2);
        textViews.add(R.id.option3);
        textViews.add(R.id.option4);
        textViews.add(R.id.option5);

        ArrayList<Integer> options = new ArrayList<>();
        options.add(R.string.beaver);
        options.add(R.string.collins);
        options.add(R.string.singer);
        options.add(R.string.ackles);
        options.add(R.string.sheppard);

        for (int i = 0; i < textViews.size(); i++) {
            TextView op = (TextView) findViewById(textViews.get(i));
            op.setText(options.get(i));
            final int index = i;
            op.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (index == 4) {
                        callNext(points + 1);
                    } else {
                        callNext(points);
                    }
                }
            });
        }
    }

    /**
     * Method that calls the next question
     *
     * @param points how many points the user has until this point
     */
    private void callNext(int points) {
        Intent intent = new Intent(Question8.this, Question9.class);
        intent.putExtra("points", points);
        startActivity(intent);
    }
}
