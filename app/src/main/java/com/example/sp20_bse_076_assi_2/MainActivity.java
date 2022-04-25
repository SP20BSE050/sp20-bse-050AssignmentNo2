package com.example.sp20_bse_076_assi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button  one,two,three,four,five,six,seven,eight,nine,back,open,zero;
private EditText et;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one= findViewById(R.id.one);
        two= findViewById(R.id.two);
        three= findViewById(R.id.three);

        four= findViewById(R.id.four);
        five= findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven= findViewById(R.id.seven);
        eight= findViewById(R.id.eight);
        nine= findViewById(R.id.nine);
        zero= findViewById(R.id.zero);
        back= findViewById(R.id.back);
        open= findViewById(R.id.open);
        et= findViewById(R.id.editt);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"7");
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"0");
            }
        });


        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            String ps ="1234";
                if(et.getText().toString().equals(ps)){
                    Intent intent = new Intent(MainActivity.this,mysafe.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Entry", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}