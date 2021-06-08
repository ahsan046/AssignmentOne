package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NewActivity(View view)
    {
        String character=((Button)view).getText().toString();
        mediaPlayer=MediaPlayer.create(this,R.raw.sound);
        mediaPlayer.start();
        Intent intent=new Intent(this,Alphabets.class);
        intent.putExtra("character",character);
        startActivity(intent);
    }
}


