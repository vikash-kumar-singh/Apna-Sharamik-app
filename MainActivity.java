package com.example.apnasharamik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void loginClick(View view)
    {
        Log.i("info","login...");
    }
    public void forgotClick(View view)
    {
        Log.i("info","forgot password");

    }
    public void registrationClick(View view)
    {
        Log.i("info","registration start");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        EditText nameText=findViewById(R.id.nameText);

    }
}