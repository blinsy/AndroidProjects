package com.example.maureen.shoppingcart;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       switch (item.getItemId()){
           case R.id.action_order:
               displayToast("You selected order.");
                       return true;
           case R.id.action_status:
               displayToast("You selected status");
               return true;
           case R.id.action_favorites:
               displayToast("You selected favorites");
               return true;
           case R.id.action_contacts:
               displayToast("You seslcted Contac.");
               return true;
           default:
       }

        return super.onOptionsItemSelected(item);
    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    public void showDonutorder(View view) {
        showFoodOrder("You ordered a donut");
    }

    private void showFoodOrder(String message) {

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Activity_Order.class) ;
        startActivity(intent);
    }

    public void showfroyoOrder(View view) {
        showFoodOrder("You ordred a froyo.");
    }


    public void displayMap() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        // Using the coordinates for Google headquarters.
        String data = "0,0";
        intent.setData(Uri.parse(data));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

}
            }