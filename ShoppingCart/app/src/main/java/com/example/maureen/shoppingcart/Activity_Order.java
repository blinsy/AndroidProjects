package com.example.maureen.shoppingcart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity_Order extends AppCompatActivity {

    private  static final String Tag_ACTIVITY= Activity_Order.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__order);
    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();

    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.sameday:
                if (checked)
                    displayToast("Chosen : "+ "same day messenger service");

                break;
            case R.id.PickUp:
                if (checked)
                    displayToast("chosen : "+ "Pick Up");
                break;
            case R.id.nextday:
                if (checked)
                    displayToast("chosen : " + "Next day delivery");
                break;
                default:
                    Log.d(Tag_ACTIVITY, "onRadioButtonClicked: ");
        }
    }
}
