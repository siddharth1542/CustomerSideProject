package com.example.myproject23sep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hbb20.CountryCodePicker;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Login extends AppCompatActivity {


    @BindView(R.id.ccp)
    CountryCodePicker ccp;

    @BindView(R.id.t1)
    EditText t1;

    @BindView(R.id.btn_login)
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);

       ccp.registerCarrierNumberEditText(t1);
       btn_login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view)
           {
               Intent intent = new Intent(getApplicationContext(), OTP_Verify.class);
               intent.putExtra("mobile",ccp.getFullNumberWithPlus().replace("",""));
               intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
               startActivity(intent);
           }
       });

    }
}