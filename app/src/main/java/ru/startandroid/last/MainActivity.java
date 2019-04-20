package ru.startandroid.last;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        add();
    }
    private Button bc22;
    private Button ba2;
    private Button bb;
    private Button bg2;
    private Button bg;
    private Button bf2;
    private Button bf;
    private Button bla;
    private Button bdo;
    private Button bdo2;
    private Button bre;
    private Button bre2;
    private Button be;

    private MediaPlayer c22sound;
    private MediaPlayer a2sound;
    private MediaPlayer bsound;
    private MediaPlayer asound;
    private MediaPlayer csound;
    private MediaPlayer c2sound;
    private MediaPlayer resound;
    private MediaPlayer re2sound;
    private MediaPlayer esound;
    private MediaPlayer fsound;
    private MediaPlayer f2sound;
    private MediaPlayer gsound;
    private MediaPlayer g2sound;

    private Button interval;
    private Button klav;
    private Button chore;
    private Button gamma;
    private Button inf;
    private Button chat;
    public void addListenerOnButton(){
        chat = (Button) findViewById(R.id.chat);
        chore = (Button) findViewById(R.id.accord);
        interval = (Button) findViewById(R.id.interval);
        inf = (Button) findViewById(R.id.inf);
        gamma = (Button) findViewById(R.id.gamma);
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
        inf.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".inf");
                        startActivity(intent);

                    }
                }
        );
        chat.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".mychat");
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
        klav.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".klav");
                        startActivity(intent);

                    }
                }
        );
    }
    public void add(){

        c22sound = MediaPlayer.create(this, R.raw.c22);
        a2sound = MediaPlayer.create(this, R.raw.a2);
        bsound = MediaPlayer.create(this, R.raw.b);
        g2sound = MediaPlayer.create(this, R.raw.g2);
        gsound = MediaPlayer.create(this, R.raw.g);
        f2sound = MediaPlayer.create(this, R.raw.f2);
        fsound = MediaPlayer.create(this, R.raw.f);
        esound = MediaPlayer.create(this, R.raw.e);
        re2sound = MediaPlayer.create(this, R.raw.d2);
        resound = MediaPlayer.create(this, R.raw.d);
        asound = MediaPlayer.create(this, R.raw.a);
        csound = MediaPlayer.create(this, R.raw.c);
        c2sound = MediaPlayer.create(this, R.raw.c2);

        bc22 = findViewById( R.id.bdo2);
        ba2 = findViewById( R.id.button9);
        bb = findViewById( R.id.bsi);
        bg2 = findViewById( R.id.button19);
        bg = findViewById( R.id.bsol);
        bf2 = findViewById(R.id.button18);
        bf = findViewById(R.id.bfa);
        be = findViewById(R.id.bmi);
        bla = findViewById(R.id.bla);
        bdo = findViewById(R.id.bdo);
        bdo2 = findViewById(R.id.button10);
        bre = findViewById(R.id.bre);
        bre2 = findViewById(R.id.button17);

        bc22.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        c22sound.start();
                    }
                }
        );
        ba2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        a2sound.start();
                    }
                }
        );
        bb.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        bsound.start();
                    }
                }
        );
        bg2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        g2sound.start();
                    }
                }
        );
        bg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gsound.start();
                    }
                }
        );
        bf2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        f2sound.start();
                    }
                }
        );
        bf.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        fsound.start();
                    }
                }
        );
        be.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        esound.start();
                    }
                }
        );
        bre2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        re2sound.start();
                    }
                }
        );
        bla.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        asound.start();
                    }
                }
        );
        bre.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        resound.start();
                    }
                }
        );
        bdo2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        c2sound.start();
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
