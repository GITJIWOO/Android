package org.ict.changeimgprj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch switch1;
    RadioGroup radioGroup;
    RadioButton ground, mountain;
    ImageView gv, mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        switch1 = (Switch) findViewById(R.id.switch1);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        ground = (RadioButton)findViewById(R.id.ground);
        mountain = (RadioButton)findViewById(R.id.mountain);
        gv = (ImageView)findViewById(R.id.gv);
        mv = (ImageView)findViewById(R.id.mv);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    text2.setVisibility(View.VISIBLE);
                    radioGroup.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    radioGroup.setVisibility(View.INVISIBLE);
                    mv.setVisibility(View.INVISIBLE);
                    gv.setVisibility(View.INVISIBLE);
                    radioGroup.clearCheck();
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(ground.isChecked()) {
                    Log.i("안내", "평원 버튼");
                    gv.setVisibility(View.VISIBLE);
                    mv.setVisibility(View.INVISIBLE);
                } else if(mountain.isChecked()) {
                    Log.i("안내", "설산 버튼");
                    mv.setVisibility(View.VISIBLE);
                    gv.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}