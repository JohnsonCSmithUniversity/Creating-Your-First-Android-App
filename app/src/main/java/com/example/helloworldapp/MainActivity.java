package com.example.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Create a counter
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create a Button Object that will reference a View in XML
        Button buttonOne = findViewById(R.id.button_one);
        //Create a TextView Object that will reference a View in XML
        final TextView textViewOne = findViewById(R.id.textView);

        //set the text to '0'
        textViewOne.setText(""+0);


        //Attach an OnClickListener to check if the button has been clicked
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textViewOne.setText(""+counter);
            }
        });


    }
}
