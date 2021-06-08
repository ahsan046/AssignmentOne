package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Alphabets extends AppCompatActivity
{
    ImageView imageView;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        imageView=findViewById(R.id.image);
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

    public void voice(View view)
    {
        ImageView imageView=findViewById(R.id.image);
        Intent intent=getIntent();
        String alpha=intent.getStringExtra("character");
        switch(alpha)
        {
            case "A":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "B":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "C":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "D":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "E":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "F":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "G":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "H":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "I":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "J":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "K":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "L":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "M":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "N":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "O":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "P":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "Q":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "R":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "S":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "T":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "U":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "V":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "W":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "X":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "Y":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
                break;
            case "Z":
                mediaPlayer=MediaPlayer.create(this,R.raw.sound);
        }
        mediaPlayer.start();
    }

    public void Rotation(View view)
    {
        imageView.animate().rotation(360).setDuration(2000);
    }
}