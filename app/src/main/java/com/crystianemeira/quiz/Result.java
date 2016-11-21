package com.crystianemeira.quiz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by crystiane on 11/20/16.
 */

public class Result extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        Bundle extras = getIntent().getExtras();
        int points = extras.getInt("points");

        TextView score = (TextView) findViewById(R.id.final_score);
        score.setText(String.valueOf(points));
    }
}
