package com.example.android.rugbyscoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /* Display the score for Team A */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /* Display the score for Team B */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /* Team A buttons */
    public void addFiveTeamA(View view) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addtwoTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /* Team B buttons */
    public void addFiveTeamB(View view) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addtwoTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void bonusScore(View view) {
        if (scoreTeamA > scoreTeamB) {
            scoreTeamA = scoreTeamA + 4;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        } else if (scoreTeamB > scoreTeamA) {
            scoreTeamB = scoreTeamB + 4;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        } else if (scoreTeamA == scoreTeamB) {
            scoreTeamB = scoreTeamB + 2;
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
    }

    public void resetScore(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}


