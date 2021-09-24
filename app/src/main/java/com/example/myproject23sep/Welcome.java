package com.example.myproject23sep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Timer().schedule(new TimerTask()
        {
            public void run()
            {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);

            }
        }, 2000);
    }
}