package com.example.ulissessantana.dcwheelchair;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;



public class MainActivity extends Activity {

    private final String TAG = "TKT";
    LinearLayout background;
    Button forward, right, left, back, emergency;
    Button directions, gears, health, entertainment, bluetooth;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        Log.d(TAG, "onCreate");

        background = (LinearLayout) findViewById(R.id.background);
        forward = (Button) findViewById(R.id.forward);
        right = (Button) findViewById(R.id.right);
        left = (Button) findViewById(R.id.left);
        back = (Button) findViewById(R.id.back);
        emergency = (Button) findViewById(R.id.emergency);

        gears = (Button) findViewById(R.id.gears);
        directions = (Button) findViewById(R.id.directions);
        health = (Button) findViewById(R.id.health);
        entertainment = (Button) findViewById(R.id.entertainment);
        bluetooth = (Button) findViewById(R.id.bluetooth);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.parseColor("#0000FF"));

            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.parseColor("#DAA520"));

            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.parseColor("#BA55D3"));

                }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.parseColor("#228B22"));

            }
        });

        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setBackgroundColor(Color.parseColor("#CD5C5C"));

            }
        });
    }

    public void buttonOnClick(View bluetooth ){
        Button button = (Button) bluetooth;
        startActivity(new Intent(getApplicationContext(), BluetoothActivity.class));
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
