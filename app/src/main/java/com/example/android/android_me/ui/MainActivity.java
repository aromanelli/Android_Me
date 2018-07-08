/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.android.android_me.R;

// This activity is responsible for displaying the master list of all images
// TODO (4) Implement the MasterListFragment callback, OnImageClickListener
public class MainActivity extends AppCompatActivity implements MasterListFragment.OnImageSelectedListener {

    private Toast prevToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void imageSelected(int position) {
        // Hate that old Toast won't go away when a new one is shown,
        // so we cancel out old one ourselves if new one is incoming ...
        // (assuming no threading issues of two images selected at same time)
        if (prevToast != null) {
            prevToast.cancel();
        }
        // TODO (5) Define the behavior for onImageSelected; create a Toast that displays the position clicked
        prevToast = Toast.makeText(this, "Pos: " + position, Toast.LENGTH_SHORT);
        prevToast.show();
    }


}
