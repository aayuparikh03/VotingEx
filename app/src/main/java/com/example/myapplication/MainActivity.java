package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView v=findViewById(R.id.imageView);
        ImageView v2=findViewById(R.id.imageView2);

        TextView t1=findViewById(R.id.textView);
         TextView t2=findViewById(R.id.textView2);
        Button b1=findViewById(R.id.button);
        Button b2=findViewById(R.id.button2);

        Candidate c=new Candidate();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Candidate 1's Vote:"+Integer.toString(++c.c1));
                Toast.makeText(MainActivity.this, "Vote for Candidate 1", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("Candidate 2's Vote:"+Integer.toString(++c.c2));
                Toast.makeText(MainActivity.this, "Vote for Candidate 2", Toast.LENGTH_SHORT).show();
            }
        });

    }
}