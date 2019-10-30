package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;

public class game_screen extends AppCompatActivity {

    private static int startVal = 0;
    private static double key = 0;
    private static int endval = 0;
    private int [][] modifiers = new int[2][4];
    Random rand = new Random();
    private static int numMoves = 0;
    private static boolean skipButton = true;
    private enum operations{Add,Sub,Mult,Div,Pwr};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        rand.setSeed(0);
        startVal = rand.nextInt(9);
        endval = rand.nextInt(1000) + 100;
        
    }
}
