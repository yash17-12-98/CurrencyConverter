package com.yashuthar.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText amountinrupees = findViewById(R.id.amountinrupees);
        Double rupees = Double.parseDouble(amountinrupees.getText().toString());
        Double dollar = 0.013 * rupees;
        Toast.makeText(MainActivity.this, "$" + dollar.toString(), Toast.LENGTH_SHORT).show();
        Log.i("Amount", amountinrupees.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}