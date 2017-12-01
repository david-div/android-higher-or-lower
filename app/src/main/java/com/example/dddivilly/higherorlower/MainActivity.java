package com.example.dddivilly.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    public void guess(View view){

        Random rand = new Random();

        int randNumber = rand.nextInt(20) + 1;


        EditText numberInput = (EditText) findViewById(R.id.numberInput);

        String value = numberInput.getText().toString();

        int number = Integer.parseInt(value);


        if (number > randNumber){

            Toast.makeText(MainActivity.this, "Too high!", Toast.LENGTH_LONG).show();

        } else if (number < randNumber){

            Toast.makeText(MainActivity.this, "Too low!", Toast.LENGTH_LONG).show();

        } else {

            Toast.makeText(MainActivity.this, "Winner winner, chicken dinner!", Toast.LENGTH_LONG).show();
        }


        System.out.println(numberInput.getText().toString());
        System.out.println(Integer.toString(randNumber));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
