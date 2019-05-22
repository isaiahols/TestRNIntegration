package com.example.test_rn_integration;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
//        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        NavigationView navigationView = findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        Button goToIntegrate = (Button) findViewById(R.id.goToIntegrate);

        goToIntegrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToIntegrationActivity();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }
        });
    }


    private void goToIntegrationActivity() {
        Intent intent = new Intent(this, MyReactActivity.class);

        startActivity(intent);
    }


    private void goToSecondActivity() {

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }



}
