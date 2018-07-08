package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.android_me.R;

public class MainActivity extends AppCompatActivity {

    // TODO (4) Create a new Activity named MainActivity and a corresponding layout file that displays a MasterListFragment
    // Remember, to display a static fragment in a layout file, use the <fragment> tag

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
