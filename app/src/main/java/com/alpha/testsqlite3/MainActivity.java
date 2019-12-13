package com.alpha.testsqlite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
//creation des objets java
    private TextView scoresView;
    private DatabaseManager databaseManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoresView=findViewById(R.id.scoresView);
        databaseManager=new DatabaseManager(this);
        //databaseManager.insertScore("Oumar",1000);
        //databaseManager.insertScore("Alpha",5000);
        //databaseManager.insertScore("Massoud",2500);
        databaseManager.insertScore("Saidou",800);
        //creation d'une liste pour afficher le score
        List<ScoreData>scores=databaseManager.readTop10();
        for (ScoreData score:scores){
            scoresView.append(score.toString()+"\n\n");

        }
        databaseManager.close();
    }
}
