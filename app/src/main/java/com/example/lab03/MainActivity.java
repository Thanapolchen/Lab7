package com.example.lab03;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.Date;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button noteButton;
    Button aboutMeButton;
    Button displayNoteButton;
    ImageView logo;
    ProgressBar PrgBarFRNT1;

    /*
    public static void main(String[] args) {


        //User
        User User1 = new User();

        //User1
        User1.userName = "Cheninwza007x";
        User1.gender = "Male";
        User1.age = 18 ;
        User1.email = "Thanapol123@gmail.com";
        User1.passcode = "Thanap0l";
        User1.showPasscode();
        User1.showProfile();

        //Note
        Note note1 = new TextNote();

        //note1
        note1.title = "Photo diary";
        note1.context = "none";

        note1.getSummary();
    }
    */

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        logo = findViewById(R.id.John);
        logo.setImageResource(R.drawable.fe_aeggagrgfagdfrgggrg);

        aboutMeButton = findViewById(R.id.AboutMeButton1);
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent aboutMeCLick = new Intent(MainActivity.this,AboutMeAct.class);
                startActivity(aboutMeCLick);
            }
        });

        noteButton = findViewById(R.id.NoteButton1);
        noteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noteClick = new Intent(MainActivity.this,NotePage.class);
                startActivity(noteClick);
            }
        });

        PrgBarFRNT1 = findViewById(R.id.progressBarMain);
        PrgBarFRNT1.setVisibility(View.GONE);
        displayNoteButton = findViewById(R.id.DispNoteBTN1);
        displayNoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PrgBarFRNT1.setVisibility(View.VISIBLE);
                new Thread(() -> {
                    //delay 2 sec
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //load data from database
                    // -
                    //back to main thread
                    runOnUiThread(() -> {
                        //remove progressbar
                        PrgBarFRNT1.setVisibility(View.GONE);
                        //go to DisplayNoteAct
                        Intent displayNoteAct = new Intent(getApplicationContext(),DisplayNoteActivity.class);
                        startActivity(displayNoteAct);
                    });
                }).start();

            }
        });

    }
}