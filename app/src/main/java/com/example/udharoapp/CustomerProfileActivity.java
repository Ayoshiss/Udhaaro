package com.example.udharoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonlogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_profile);
        buttonlogout = (Button)findViewById(R.id.btnlogout);
        buttonlogout.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == buttonlogout){
            finish();
            startActivity(new Intent(this,MainActivity.class));
        }
    }
}
