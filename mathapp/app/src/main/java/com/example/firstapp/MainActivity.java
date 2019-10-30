package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Settings button */
    public void openSettings(View view) {
        Intent intent = new Intent(this, GameSettings.class);
        startActivity(intent);
    }

    /** Called when the user taps the Settings button */
    public void openGame(View view) {
        Intent intent = new Intent(this, game_screen.class);
        startActivity(intent);
    }
}
