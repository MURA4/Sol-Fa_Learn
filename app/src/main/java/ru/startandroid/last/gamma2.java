package ru.startandroid.last;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class gamma2 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamma2);
        chore = (Button) findViewById(R.id.accord);
        interval = (Button) findViewById(R.id.interval);
        klav = (Button) findViewById(R.id.klav);
        chore.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".chord");
                        startActivity(intent);

                    }
                }
        );

        interval.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".interval");
                        startActivity(intent);

                    }
                }
        );
        klav.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".klav");
                        startActivity(intent);

                    }
                }
        );
        RadioButton bdur = (RadioButton)findViewById(R.id.bdur);
        bdur.setOnClickListener(radioButtonClickListener);


        txt = findViewById(R.id.textView5);
    }
    private Button interval;
    private Button klav;
    private Button chore;
    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioGroup radioGroup = findViewById(R.id.radio);
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

            RadioButton myRadioButton = (RadioButton) findViewById(checkedRadioButtonId);

            String strText;
            strText = myRadioButton.getText().toString();

            if(strText.equals("До, мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.laddo);
                img.setBounds(0, 0, 800, 400);
                txt.setCompoundDrawables(img, null, null, null);

            }
        }
    };
    TextView txt;
}