package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score;
    int scoreb;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);

    }
    public void addThreeForTeamA(View view){
        score=score+3;
        display(score);
    }
    public void addTwoForTeamA(View view){
        score=score+2;
        display(score);
    }
    public void addOneForTeamA(View view){
        score=score+1;
        display(score);
    }
    public void Reset(View view){
        score=0;
        display(score);
    }
    public void addThreeForTeamb(View view){
        scoreb=scoreb+3;
        displayb(scoreb);
    }
    public void addTwoForTeamb(View view){
        scoreb=scoreb+2;
        displayb(scoreb);
    }
    public void addOneForTeamb(View view){
        scoreb=scoreb+1;
        displayb(scoreb);
    }
    public void Resetb(View view){
        scoreb=0;
        displayb(scoreb);
    }
    public void NewGame(View view){
        score=0;
        scoreb=0;
        display(score);
        displayb(scoreb);
    }
    public void display (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }
    public void displayb (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_b_score);
        countViewer.setText(""+ number);
    }

}