package org.ict.calculatorprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button plus, minus, division, multiplication;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        division = (Button)findViewById(R.id.division);
        multiplication = (Button)findViewById(R.id.multiplication);
        result = (TextView)findViewById(R.id.result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value1 = edit1.getText().toString();
                String value2 = edit2.getText().toString();

                int valResult = Integer.parseInt(value1) + Integer.parseInt(value2);

                result.setText(valResult + "");

                edit1.setText("");
                edit2.setText("");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value1 = edit1.getText().toString();
                String value2 = edit2.getText().toString();

                int valResult = Integer.parseInt(value1) - Integer.parseInt(value2);

                result.setText(valResult + "");

                edit1.setText("");
                edit2.setText("");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value1 = edit1.getText().toString();
                String value2 = edit2.getText().toString();

                int valResult = Integer.parseInt(value1) / Integer.parseInt(value2);

                result.setText(valResult + "");

                edit1.setText("");
                edit2.setText("");
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value1 = edit1.getText().toString();
                String value2 = edit2.getText().toString();

                int valResult = Integer.parseInt(value1) * Integer.parseInt(value2);

                result.setText(valResult + "");

                edit1.setText("");
                edit2.setText("");
            }
        });
    }
}