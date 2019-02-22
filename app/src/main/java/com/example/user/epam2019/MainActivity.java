package com.example.user.epam2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "first feature2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "second feature2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "first feature1", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "second feature1", Toast.LENGTH_LONG).show();

        Toast.makeText(getApplicationContext(), "stash", Toast.LENGTH_LONG).show();



    }

}
