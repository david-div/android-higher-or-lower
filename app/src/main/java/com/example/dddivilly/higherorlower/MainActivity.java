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

        int randomNumber = rand.nextInt(20) + 1;


        EditText numberInput = (EditText) findViewById(R.id.numberInput);

        String value = numberInput.getText().toString();

        int number = Integer.parseInt(value);


        Toast.makeText(MainActivity.this, "Toasts working", Toast.LENGTH_LONG).show();

        System.out.println(numberInput.getText().toString());
        System.out.println(Integer.toString(randomNumber));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
