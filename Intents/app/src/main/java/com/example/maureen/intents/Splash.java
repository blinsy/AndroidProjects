package com.example.maureen.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {
    ProgressBar mine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mine =(ProgressBar) findViewById(R.id.progressbar);
    Thread splash = new Thread(){
        @Override
        public void run() {
            try {
                sleep(3000);
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();

            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    };
    splash.start();

    }
}
