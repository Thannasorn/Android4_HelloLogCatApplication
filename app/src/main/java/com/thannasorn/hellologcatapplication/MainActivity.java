package com.thannasorn.hellologcatapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "My_App";
    private int data = 10;
 /*   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnError = (Button) findViewById(R.id.btnError);
        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Show Logcat Error",

                        Toast.LENGTH_LONG).show();
                Log.e(TAG, "Test log.e data = " + data); // แบบ error
            }
        });
        Button btnWarning = (Button) findViewById(R.id.btnWarning);
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Show Logcat Warning",

                        Toast.LENGTH_LONG).show();

                Log.w(TAG, "Test log.w data = " + data); // แบบ warning
            }
        });
        Button btnInformation = (Button) findViewById(R.id.btnInformation);
        btnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Show Logcat Information",
                        Toast.LENGTH_LONG).show();
                Log.i(TAG, "Test log.i data = " + data); // แบบ information
            }
        });
        Button btnDebug = (Button) findViewById(R.id.btnDebug);
        btnDebug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Show Logcat Debug",

                        Toast.LENGTH_LONG).show();
                Log.d(TAG, "Test log.d data = " + data); // แบบ debug
            }
        });
        Button btnVerbose = (Button) findViewById(R.id.btnVerbose);
        btnVerbose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Show Logcat Verbose",

                        Toast.LENGTH_LONG).show();

                Log.v(TAG, "Test log.v data = " + data); // แบบ verbose
            }
        });
    }
} */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnError);
        btn.setOnClickListener(this);

        Button btnWarning = (Button) findViewById(R.id.btnWarning);
        btnWarning.setOnClickListener (this);

        Button btnInformation = (Button) findViewById(R.id.btnInformation);
        btnInformation.setOnClickListener (this);

        Button btnDebug = (Button) findViewById(R.id.btnDebug);
        btnDebug.setOnClickListener (this);

        Button btnVerbose = (Button) findViewById(R.id.btnVerbose);
        btnVerbose.setOnClickListener (this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnError){
            Toast.makeText( MainActivity.this, "Show Logcat Error",

                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data); // แบบ error
        }

        if(view.getId() == R.id.btnWarning){
            Toast.makeText( MainActivity.this, "Show Logcat Warning",

                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data); // แบบ error
        }

        if(view.getId() == R.id.btnInformation){
            Toast.makeText( MainActivity.this, "Show Logcat Information",

                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data); // แบบ error
        }

        if(view.getId() == R.id.btnDebug){
            Toast.makeText( MainActivity.this, "Show Logcat Debug",

                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data); // แบบ error
        }

        if(view.getId() == R.id.btnVerbose){
            Toast.makeText( MainActivity.this, "Show Logcat Verbose",

                    Toast.LENGTH_LONG).show();
            Log.e(TAG, "Test log.e data = " + data); // แบบ error
        }


    }
}



