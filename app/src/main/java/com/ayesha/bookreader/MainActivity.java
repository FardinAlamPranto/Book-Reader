package com.ayesha.bookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.imageview.ShapeableImageView;

public class MainActivity extends AppCompatActivity {

    ShapeableImageView book1, book2, book3, book4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        book1 = findViewById(R.id.book1);
        book2 = findViewById(R.id.book2);
        book3 = findViewById(R.id.book3);
        book4 = findViewById(R.id.book4);

        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto1 = new Intent(MainActivity.this, BookDetails.class);
                goto1.putExtra("bookindex", 0);
                startActivity(goto1);
            }
        });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto2 = new Intent(MainActivity.this, BookDetails.class);
                goto2.putExtra("bookindex", 1);
                startActivity(goto2);
            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto3 = new Intent(MainActivity.this, BookDetails.class);
                goto3.putExtra("bookindex", 2);
                startActivity(goto3);
            }
        });

        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto4 = new Intent(MainActivity.this, BookDetails.class);
                goto4.putExtra("bookindex", 3);
                startActivity(goto4);
            }
        });


    }
}