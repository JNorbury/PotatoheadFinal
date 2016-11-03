package com.example.jonah.potatohead;

import android.app.ListActivity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.Toast;
import android.content.Context;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void onCheckBoxClicked(View v) {
        CheckBox chk = (CheckBox) v;

        if (chk.getText().equals("Arms")) {
            boxClicker(R.id.imageView31, chk);
        }
        if (chk.getText().equals("Glasses")) {
            boxClicker(R.id.imageView30, chk);
        }
        if (chk.getText().equals("Hat")) {
            boxClicker(R.id.imageView27, chk);
        }
        if (chk.getText().equals("Mouth")) {
            boxClicker(R.id.imageView63, chk);
        }
        if (chk.getText().equals("Mustache")) {
            boxClicker(R.id.imageView29, chk);
        }
        if (chk.getText().equals("Eyebrows")) {
            boxClicker(R.id.imageView33, chk);
        }
        if (chk.getText().equals("Eyes")) {
            boxClicker(R.id.imageView28, chk);
        }
        if (chk.getText().equals("Nose")) {
            boxClicker(R.id.imageView26, chk);
        }
        if (chk.getText().equals("Ears")) {
            boxClicker(R.id.imageView34, chk);
        }
        if (chk.getText().equals("Shoes")) {
            boxClicker(R.id.imageView32, chk);
        }
    }


    private void boxClicker(int id, CheckBox chk) {
        Context context = getApplicationContext();
        ImageView miv = (ImageView) findViewById(id);
        CharSequence text = chk.getText();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        toast = Toast.makeText(context, "id = " + miv.getId(), duration);
        if (!chk.isChecked()) {
            miv.setVisibility(View.INVISIBLE);
        }
        else {
            miv.setVisibility(View.VISIBLE);
        }
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
