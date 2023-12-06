package com.example.newsdashboard.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.newsdashboard.Adapter.TrendsAdapter;
import com.example.newsdashboard.Domain.TrendsDomain;
import com.example.newsdashboard.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTrendList;
    private RecyclerView recyclerViewTrends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
        BottomNavigation();
    }

    private void BottomNavigation() {
        LinearLayout profileBtn = findViewById(R.id.profileBtn);
        profileBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ProfileActivity.class)));
    }

    private void initRecyclerView() {
        ArrayList<TrendsDomain> item = new ArrayList<>();
        item.add(new TrendsDomain("Future in AI, What will tomorrow be like?", "The National", "trends"));
        item.add(new TrendsDomain("Important points in concluding a work contract", "Reuters", "trends2"));
        item.add(new TrendsDomain("What will tomorrow be like?", "BBC", "trends3"));

        recyclerViewTrends = findViewById(R.id.view1);
        recyclerViewTrends.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterTrendList = new TrendsAdapter(item);
        recyclerViewTrends.setAdapter(adapterTrendList);
    }
}