package com.example.newsdashboard.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.newsdashboard.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initView();
    }

    private void initView() {
        ConstraintLayout backBtn = findViewById(R.id.backBtn);
        ConstraintLayout logoutBtn = findViewById(R.id.logoutBtn);
        backBtn.setOnClickListener(v -> finish());
        logoutBtn.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this, IntroActivity.class)));
    }

}