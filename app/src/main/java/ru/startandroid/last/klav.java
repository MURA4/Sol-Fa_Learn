package ru.startandroid.last;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class klav extends AppCompatActivity {

    private Button bla;
    private Button bdo;
    private MediaPlayer asound;
    private MediaPlayer csound;

    private Button interval;
    private Button chore;
    private Button gamma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klav);
        add();

        chore = (Button) findViewById(R.id.accord);
        interval = (Button) findViewById(R.id.interval);
        gamma = (Button) findViewById(R.id.gamma);
        chore.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".chord");
                        startActivity(intent);

                    }
                }
        );
        gamma.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".gamma");
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

    }

    public void add(){
        asound = MediaPlayer.create(this, R.raw.a);
        csound = MediaPlayer.create(this, R.raw.c);

        bla = findViewById(R.id.bla);
        bdo = findViewById(R.id.bdo);
        bla.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        asound.start();
                    }
                }
        );
        bdo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        csound.start();
                    }
                }
        );
    }

}
