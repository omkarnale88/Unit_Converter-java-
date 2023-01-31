package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button pounds_to_kg;
Button kg_to_pounds;
TextView result;
EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pounds_to_kg=findViewById(R.id.button4);
        kg_to_pounds=findViewById(R.id.button3);
        result=findViewById(R.id.textView3);
        input=findViewById(R.id.editTextTextPersonName);
        kg_to_pounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kgs_entered=Double.parseDouble(input.getText().toString());
                result.setText(""+convert_kgs(kgs_entered));
            }
        });
        pounds_to_kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double pounds_entered=Double.parseDouble(input.getText().toString());
                result.setText(""+convert_pounds(pounds_entered));
            }

        });
    }

    public double convert_pounds(double pounds_entered) {
        return pounds_entered/2.204;
    }
    public double convert_kgs(double kgs_entered) {
        return kgs_entered*2.204;
    }
}