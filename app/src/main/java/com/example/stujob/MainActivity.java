package com.example.stujob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author Daniel Moradi
 * Här skrivs javakoden för logiken.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // >>> START-METODEN FÖR TEST KNAPPEN <<< //
    // Skriven av Weronika Sleboda

    public void start(View view) {

        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}