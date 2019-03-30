package com.example.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        //Create EditText Objects that will reference the Views in XML
        EditText emailView = findViewById(R.id.editText);
        EditText passwordView = findViewById(R.id.editText2);

        //Attach an OnClickListener to check if the button has been clicked
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display Logging in when the user click the button
                Toast.makeText(MainActivity.this, "Loggging in", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
