package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add,mul,div,sub;
    private TextView result,operand;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.edN1);
        num2 = (EditText)findViewById(R.id.edN2);
        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        mul = (Button)findViewById(R.id.btnMul);
        div = (Button)findViewById(R.id.btnDiv);

        result = (TextView)findViewById(R.id.result);

        operand = (TextView)findViewById(R.id.operant);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1=0,number2=0;

                 number1 = Float.parseFloat(num1.getText().toString());
                 number2 = Float.parseFloat(num2.getText().toString());
                float sum = number1 + number2;
                result.setText(" = " + String.valueOf(sum));
                operand.setText("+");

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number1=0,number2=0;

                 number1 = Float.parseFloat(num1.getText().toString());
                 number2 = Float.parseFloat(num2.getText().toString());
                float sum = number1 - number2;
                result.setText(" = " + String.valueOf(sum));
                operand.setText("-");

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float number1=0,number2=0;

                 number1 = Float.parseFloat(num1.getText().toString());
                 number2 = Float.parseFloat(num2.getText().toString());
                float pod = number1 * number2;
                result.setText(" = " + String.valueOf(pod));
                operand.setText("X");

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 float number1=0,number2=0;
                 number1 = Float.parseFloat(num1.getText().toString());
                 number2 = Float.parseFloat(num2.getText().toString());
                if(number2==0)
                {
                    result.setText(" = ERROR!!");
                    operand.setText("/");
                }
                else {
                    float div = number1 / number2;
                    result.setText(" = " + String.valueOf(div));
                    operand.setText("/");
                }
            }
        });
    }

}