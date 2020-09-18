package com.example.showhidestatusbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnShowStatusBar;
    Button btnHideStatusBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowStatusBar = findViewById(R.id.btnShowStatusBar);
        btnHideStatusBar = findViewById(R.id.btnHideStatusBar);

        btnShowStatusBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //to show the statusbar again we will clear the flag here
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

            }
        });

        btnHideStatusBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here we will add a flag to hide the statusbar
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            }
        });
    }
}