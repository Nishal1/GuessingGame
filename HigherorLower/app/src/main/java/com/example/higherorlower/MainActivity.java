package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        int randomNumber = 0;
    public void randomNumberGenerator(){
        Random rand = new Random();
        randomNumber = rand.nextInt(21);
    }


    public void guess(View view) {
        EditText guessNumber = findViewById(R.id.numberEditText);
        int num = Integer.parseInt(guessNumber.getText().toString());
        String message;
        if(num > randomNumber){
            message = "lower!";
        }
        else if(num < randomNumber){
            message = "higher!";
        }
        else{
            message = "You got it right! Try again !";
            randomNumberGenerator();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNumberGenerator();
    }
}
