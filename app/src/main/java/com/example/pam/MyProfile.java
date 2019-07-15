package com.example.pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyProfile extends AppCompatActivity {
private Button mainPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        mainPage = findViewById(R.id.back);
        mainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainPage();
            }
        });
    }


    public void mainPage(){
        Intent mainPageIntent = new Intent(this, MainActivity.class);
        startActivity(mainPageIntent);
    }
}
