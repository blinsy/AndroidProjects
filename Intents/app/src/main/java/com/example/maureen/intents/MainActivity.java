package com.example.maureen.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText mwebsiteedittext;
private EditText mLocationEdittext;
private  EditText mShareTextEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  mwebsiteedittext =(EditText)findViewById(R.id.wesiteEdittext);
  mLocationEdittext =(EditText)findViewById(R.id.location);
  mShareTextEdit =(EditText)findViewById(R.id.Share);

    }
    public void openwebsite (View view) {
        String url = mwebsiteedittext.getText().toString();

        Uri webpage = Uri.parse(url);

        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Cant handle this intent!");
        }

    }
        public void openlocation(View view) {
            // Get the string indicating a location.  Input is not validated; it is
            // passed to the location handler intact.
            String loc = mLocationEdittext.getText().toString();

            // Parse the location and create the intent.
            Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
            Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

            // Find an activity to handle the intent, and start that activity.
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Log.d("ImplicitIntents", "Can't handle this intent!");
            }
    }
    public void share(View view) {
        // Get the shared text.
        String txt = mShareTextEdit.getText().toString();

        // Build the share intent with the mimetype text/plain and launch
        // a chooser for the user to pick an app.
        ShareCompat.IntentBuilder
                .from(this)
                .setType("text/plain")
                .setChooserTitle("Share this text with: ")
                .setText(txt)
                .startChooser();
    }
}
