package com.example.biim.temperatueconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.biim.temperatueconverter.model.Body;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fbutton = findViewById(R.id.f_button);
        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.input_text);
                int number = Integer.parseInt(input.getText().toString());
                Body body = new Body(number);
                final TextView output = findViewById(R.id.output_text);
                String show = Integer.toString(body.tranformC_to_F());
                output.setText(show);
            }
        });
        Button cbutton = findViewById(R.id.c_button);
        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.input_text);
                int number = Integer.parseInt(input.getText().toString());
                Body body = new Body(number);
                final TextView output = findViewById(R.id.output_text);
                String show = String.format("%.2f", body.tranformF_to_C());
                output.setText(show);
            }
        });
    }
}