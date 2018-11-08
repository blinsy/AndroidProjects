package com.example.maureen.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount =0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void countup (View View)
    {
        //
    }

    public void showtoast(View view) {
        //what happens when use clicks on the button

       // Toast toast =Toast.makeText(this,R.string.toast-message,Toast.LENGTH_LONG);
       // toast.show();
    }
}
