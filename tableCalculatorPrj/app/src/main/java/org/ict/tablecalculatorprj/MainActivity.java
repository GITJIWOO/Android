package org.ict.tablecalculatorprj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button[] numBtns = new Button[10];
    Integer[] numBtnIDs = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
    Button btnplus, btnmi, btnmul, btndiv;
    EditText edit1, edit2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0; i<10; i++){
            numBtns[1] = (Button)findViewById(numBtnIDs[i]);
        }

        edit1 = (EditText)findViewById(R.id.edit1);
        edit2 = (EditText)findViewById(R.id.edit2);
        result = (TextView)findViewById(R.id.result);
        btnplus = (Button)findViewById(R.id.btnplus);
        btnmi = (Button)findViewById(R.id.btnmi);
        btnmul = (Button)findViewById(R.id.btnmul);
        btndiv = (Button)findViewById(R.id.btndiv);

        for(int i = 0; i < numBtns.length; i++) {
            final int index;
            index = i;

            numBtns[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("눌린버튼", numBtns[index].getText() + "");
                    if(edit1.isFocused()) {
//                        edit1.setText();
                    } else if(edit2.isFocused()) {
//                        edit2.setText();
                    }
                }
            });
        }

    }
}