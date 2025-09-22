package com.example.lab03;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DisplayNoteActivity extends AppCompatActivity {

    Button BackHome;
    EditText data;
    Button searchButtonADN;
    ProgressBar progressBarADN;
    TextView noData;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_display_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BackHome = findViewById(R.id.BackHomeDispNote);
        BackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BackHomeDspN = new Intent(DisplayNoteActivity.this,MainActivity.class);
                startActivity(BackHomeDspN);

            }
        });

        progressBarADN = findViewById(R.id.progressBarDNA);
        progressBarADN.setVisibility(View.GONE);

        searchButtonADN = findViewById(R.id.searchBtnActDispNote);
        searchButtonADN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBarADN.setVisibility(View.VISIBLE);
                new Thread(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    runOnUiThread(() -> {
                        progressBarADN.setVisibility(View.GONE);
                        System.out.println("Cl1ck");
                        noData = findViewById(R.id.SearchBarDSPN);
                        noData.setText("No data!");
                    });
                }).start();
            }
        });



    }
}