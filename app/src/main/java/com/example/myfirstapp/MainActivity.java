package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView compIMG = (ImageView)findViewById(R.id.pic);

        ImageView userIMG = (ImageView)findViewById(R.id.userpic);

        int num;
        num=2;

        int result=0;

        TextView compInput = (TextView) findViewById(R.id.compChoice);

        if(num==1){
            compIMG.setImageResource(R.drawable.rock);
            compInput.setText("COMPUTER CHOSE ROCK");
        }
        else if(num==2){
            compIMG.setImageResource(R.drawable.scissors);
            compInput.setText("COMPUTER CHOSE SCISSORS");
        }

        else {
            compIMG.setImageResource(R.drawable.paper);
            compInput.setText("COMPUTER CHOSE PAPER");
        }

        TextView userInput = (TextView) findViewById(R.id.userChoice);

        int num2;
        num2=3;

        if(num2==1){

            userIMG.setImageResource(R.drawable.rock);
            userInput.setText("YOU CHOSE ROCK");
        }
        else if(num2==2){
            userIMG.setImageResource(R.drawable.scissors);
            userInput.setText("YOU CHOSE SCISSORS");
        }

        else {
            userIMG.setImageResource(R.drawable.paper);
            userInput.setText("YOU CHOSE PAPER");
        }

        TextView decision = (TextView) findViewById(R.id.wintext);

        decision.setText("");




        if(result==0)
            decision.setText("YOU LOSE!!");
        else if(result==1)
            decision.setText("TIE GAME!!");
        else{
            decision.setText("YOU WIN!!");
        }


    }

}
