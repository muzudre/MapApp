package tk.muslimzabirov.mapapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            nextActivity();

            }
        };


    }


    public void nextActivity(){
        Intent a = new Intent(this, MainActivity.class);
        startActivity(a);
    }
}
