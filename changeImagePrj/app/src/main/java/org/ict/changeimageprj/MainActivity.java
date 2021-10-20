package org.ict.changeimageprj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox check;
    RadioGroup radioGroup;
    RadioButton ground, mountain;
    Button choice;
    ImageView gv, mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        check = (CheckBox)findViewById(R.id.check);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        ground = (RadioButton)findViewById(R.id.ground);
        mountain = (RadioButton)findViewById(R.id.mountain);
        choice = (Button)findViewById(R.id.choice);
        gv = (ImageView)findViewById(R.id.gv);
        mv = (ImageView)findViewById(R.id.mv);

        // 체크박스 클릭을 컨트롤하는 setOnCheckedChangeListener()를 사용
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.i("체크", isChecked + "");
                if(isChecked) {
                    text2.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                    choice.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    choice.setVisibility(View.INVISIBLE);
                    mv.setVisibility(View.INVISIBLE);
                    gv.setVisibility(View.INVISIBLE);
                    radioGroup.clearCheck();
                }
            }
        });

        choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int checked = radioGroup.getCheckedRadioButtonId();
                Log.i("check", checked + "");

                if(checked == 2131230917) {
                    Log.i("안내", "평원 버튼");
                    gv.setVisibility(View.VISIBLE);
                    mv.setVisibility(View.INVISIBLE);
                } else if(checked == 2131230986) {
                    Log.i("안내", "설산 버튼");
                    mv.setVisibility(View.VISIBLE);
                    gv.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}