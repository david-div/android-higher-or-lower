package com.example.dddivilly.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    int randNumber;

    public void makeToast(String string){

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }


    public void guess(View view){

        EditText numberInput = (EditText) findViewById(R.id.numberInput);

        String value = numberInput.getText().toString();

        int number = Integer.parseInt(value);


        if (number > randNumber){

            makeToast("Lower!");

        } else if (number < randNumber){

            makeToast("Higher!");

        } else {

            makeToast("Winner winner, chicken dinner!\nHave another go!");

            Random rand = new Random();

            randNumber = rand.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // generated when the app is launched, rather than each button press
        // initialised in the class

        Random rand = new Random();

        randNumber = rand.nextInt(20) + 1;
    }
}
