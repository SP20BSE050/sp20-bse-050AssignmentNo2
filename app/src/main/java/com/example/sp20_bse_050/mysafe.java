package com.example.sp20_bse_050;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.sp20_bse_050.R;

public class mysafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysafe);
        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
    }
}