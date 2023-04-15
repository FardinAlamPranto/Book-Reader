package com.ayesha.bookreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class BooKReader extends AppCompatActivity {

    PDFView pdfView;
    TextView pdfname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boo_kreader);

        pdfView = findViewById(R.id.pdfview);
        pdfname = findViewById(R.id.viewer_bookname);

        int openwhichbook = getIntent().getExtras().getInt("openbook", 0);

        if (openwhichbook == 0) {
            pdfname.setText("My Computer Book");
            pdfView.fromAsset("my_computer_book.pdf").load();
        }

        if (openwhichbook == 1) {
            pdfname.setText("Learn Science");
            pdfView.fromAsset("science.pdf").load();
        }

        if (openwhichbook == 2) {
            pdfname.setText("Learn Maths");
            pdfView.fromAsset("mathematics.pdf").load();
        }

        if (openwhichbook == 3) {
            pdfname.setText("1000+ Mathematics Problems");
            pdfView.fromAsset("maths_problems.pdf").load();
        }


    }
}