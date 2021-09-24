package com.example.myproject23sep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import butterknife.BindView;

public class SplashScreen extends AppCompatActivity
{

    @BindView(R.id.splash_img)
    ImageView imageView;

    Animation top;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        top= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.top);
        imageView.setAnimation(top);
    }
}