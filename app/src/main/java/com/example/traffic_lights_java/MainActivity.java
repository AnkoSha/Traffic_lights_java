package com.example.traffic_lights_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;
    Button yellowButton;
    Button redButton;
    Button greenButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = findViewById(R.id.root_layout);
        mInfoTextView = findViewById(R.id.textView);
        Button yellowButton = (Button) findViewById(R.id.yellow_button);
        Button redButton = (Button) findViewById(R.id.red_button);
        Button greenButton = (Button) findViewById(R.id.green_button);
       View.OnClickListener onClickListener = new View.OnClickListener(){
           @Override
           public void onClick(View view){
               int id = view.getId();
              if (id==R.id.red_button) {
                  mInfoTextView.setText(R.string.red);
                  mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.redColor));
              }
              else if (id==R.id.yellow_button) {
                  mInfoTextView.setText(R.string.yellow);
                  mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellowColor));
              }
              else { mInfoTextView.setText(R.string.green);
                       mConstraintLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.greenColor));

               }
       }};
        yellowButton.setOnClickListener(onClickListener);
        redButton.setOnClickListener(onClickListener);
        greenButton.setOnClickListener(onClickListener);

    }}