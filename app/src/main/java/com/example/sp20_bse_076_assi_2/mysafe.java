package com.example.sp20_bse_076_assi_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class mysafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysafe);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }
}