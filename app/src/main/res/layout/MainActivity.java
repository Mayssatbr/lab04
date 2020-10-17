package com.example.emty_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void OnOpenInGoogleMaps(View view){
            EditText sportaddress=(EditText)findViewById(R.id.address);
            Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+sportaddress);
            Intent mapIntent=new Intent(Intent.ACTION_VIEW,gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);

        }
        public void OnSetAvatarButton(View view){
        Intent intent=new Intent(getApplicationContext(),Golf.class);
        startActivityForResult(intent,0);
        }

}