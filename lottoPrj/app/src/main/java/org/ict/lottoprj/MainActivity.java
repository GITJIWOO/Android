package org.ict.lottoprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button lottoBtn;
    TextView value1, value2, value3, value4, value5, value6, value7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lottoBtn = (Button)findViewById(R.id.lottoBtn);
        value1 = (TextView)findViewById(R.id.value1);
        value2 = (TextView)findViewById(R.id.value2);
        value3 = (TextView)findViewById(R.id.value3);
        value4 = (TextView)findViewById(R.id.value4);
        value5 = (TextView)findViewById(R.id.value5);
        value6 = (TextView)findViewById(R.id.value6);
        value7 = (TextView)findViewById(R.id.value7);

        lottoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<Integer> lottoNumberList = new ArrayList<Integer>();

                int lottoNumber = 0;

                int bonusNumber = 0;

                while (lottoNumberList.size() < 6) {
                    lottoNumber = (int)(Math.random() * 45 + 1);

                    if(lottoNumberList.contains(lottoNumber)) {
                        continue;
                    } else {
                        lottoNumberList.add(lottoNumber);
                    }


                }
                while (true) {
                    bonusNumber = (int)(Math.random() * 45 + 1);

                    if(lottoNumberList.contains(bonusNumber)) {
                        continue;
                    } else {
                        break;
                    }
                }
                Collections.sort(lottoNumberList);

                value1.setText(lottoNumberList.get(0) + "");
                value2.setText(lottoNumberList.get(1) + "");
                value3.setText(lottoNumberList.get(2) + "");
                value4.setText(lottoNumberList.get(3) + "");
                value5.setText(lottoNumberList.get(4) + "");
                value6.setText(lottoNumberList.get(5) + "");
                value7.setText(bonusNumber + "");
            }
        });
    }
}