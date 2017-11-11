package com.sean.guess.guessv2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int r = new Random().nextInt(10)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send (View view){
        EditText number = (EditText) findViewById(R.id.ed_num);

        int n = Integer.parseInt(number.getText().toString());

        if(n>r){
            Toast.makeText(this,"小一點",Toast.LENGTH_LONG).show();
        }else if(n<r){
            Toast.makeText(this,"大一點",Toast.LENGTH_LONG).show();
        }else if(n ==r){
            new AlertDialog.Builder(this)
                    .setTitle("恭喜")
                    .setMessage("答對了!!")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }



}
