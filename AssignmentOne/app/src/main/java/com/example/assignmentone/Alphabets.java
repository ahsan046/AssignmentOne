package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Alphabets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        ImageView imageView=findViewById(R.id.image);
        Intent intent=getIntent();
        String alpha=intent.getStringExtra("character");
        switch(alpha)
        {
            case "A":
                imageView.setImageResource(R.drawable.a);
                break;
            case "B":
                imageView.setImageResource(R.drawable.b);
                break;
            case "C":
                imageView.setImageResource(R.drawable.c);
                break;
            case "D":
                imageView.setImageResource(R.drawable.d);
                break;
            case "E":
                imageView.setImageResource(R.drawable.e);
                break;
            case "F":
                imageView.setImageResource(R.drawable.f);
                break;
            case "G":
                imageView.setImageResource(R.drawable.g);
                break;
            case "H":
                imageView.setImageResource(R.drawable.h);
                break;
            case "I":
                imageView.setImageResource(R.drawable.i);
                break;
            case "J":
                imageView.setImageResource(R.drawable.j);
                break;
            case "K":
                imageView.setImageResource(R.drawable.k);
                break;
            case "L":
                imageView.setImageResource(R.drawable.l);
                break;
            case "M":
                imageView.setImageResource(R.drawable.m);
                break;
            case "N":
                imageView.setImageResource(R.drawable.n);
                break;
            case "O":
                imageView.setImageResource(R.drawable.o);
                break;
            case "P":
                imageView.setImageResource(R.drawable.p);
                break;
            case "Q":
                imageView.setImageResource(R.drawable.q);
                break;
            case "R":
                imageView.setImageResource(R.drawable.r);
                break;
            case "S":
                imageView.setImageResource(R.drawable.s);
                break;
            case "T":
                imageView.setImageResource(R.drawable.t);
                break;
            case "U":
                imageView.setImageResource(R.drawable.u);
                break;
            case "V":
                imageView.setImageResource(R.drawable.v);
                break;
            case "W":
                imageView.setImageResource(R.drawable.w);
                break;
            case "X":
                imageView.setImageResource(R.drawable.x);
                break;
            case "Y":
                imageView.setImageResource(R.drawable.y);
                break;
            case "Z":
                imageView.setImageResource(R.drawable.z);

        }
    }
}