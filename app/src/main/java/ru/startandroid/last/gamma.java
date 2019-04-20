package ru.startandroid.last;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class gamma extends AppCompatActivity {
    private Button gam1;
    private Button gam2;
    private Button chat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamma);

            gam1 = (Button) findViewById(R.id.gam1);
           gam2= (Button) findViewById(R.id.gam2);
            gam1.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick (View v){
                            Intent intent = new Intent(".gamma1");
                            startActivity(intent);

                        }
                    }
            );
            gam2.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick (View v){
                            Intent intent = new Intent(".gamma2");
                            startActivity(intent);

                        }
                    }
            );
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
        chat = (Button) findViewById(R.id.chat);
        chat.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".mychat");
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
    private Button interval;
    private Button klav;
    private Button chore;

}
