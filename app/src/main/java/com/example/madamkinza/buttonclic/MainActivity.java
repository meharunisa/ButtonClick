package com.example.madamkinza.buttonclic;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button button;
    Button another;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        another = (Button) findViewById(R.id.button2);

        button.setOnClickListener(this);
        another.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            Intent intent= new Intent(MainActivity.this,New.class);
           // Log.d("", "this button is clicked by A");

        }
        if (v.getId()==R.id.button2)
        {
            Log.d("","this is clicked by B");
        }

    }
}
