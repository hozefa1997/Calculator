package com.example.hozefa.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button)findViewById(R.id.add);
        Button sub = (Button)findViewById(R.id.sub);
        Button div = (Button)findViewById(R.id.div);
        Button mult = (Button)findViewById(R.id.mult);
        Button reset = (Button)findViewById(R.id.reset);
        final EditText num1 = (EditText)findViewById(R.id.n1);
        final EditText num2 = (EditText)findViewById(R.id.n2);
        final EditText result = (EditText)findViewById(R.id.res);

        add.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt(num2.getText().toString());
                        int res = n1+n2;
                        result.setText(""+res);

                    }
                }
        );

        sub.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt(num2.getText().toString());
                        int res = n1-n2;
                        result.setText(""+res);

                    }
                }
        );

        div.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt(num2.getText().toString());
                        float res = (float)n1/n2;
                        result.setText(""+res);

                    }
                }
        );

        mult.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        int n1 = Integer.parseInt(num1.getText().toString());
                        int n2 = Integer.parseInt(num2.getText().toString());
                        int res = n1*n2;
                        result.setText(""+res);

                    }
                }
        );

        reset.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        num1.setText("");
                        num2.setText("");
                        result.setText("");
                    }
                }
        );

    }
}
