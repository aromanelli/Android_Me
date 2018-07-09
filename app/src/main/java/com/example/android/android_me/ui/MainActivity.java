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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.android.android_me.R;

// This activity is responsible for displaying the master list of all images
// Implement the MasterListFragment callback, OnImageClickListener
public class MainActivity extends AppCompatActivity implements MasterListFragment.OnImageClickListener{

    final static private String TAG = MainActivity.class.getSimpleName();

    private int mSelectedHead;
    private int mSelectedBody;
    private int mSelectedLegs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            // TODO (4) Get a reference to the "Next" button and launch the intent when this button is clicked
            findViewById(R.id.button_next).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    // TODO (3) Put this information in a Bundle and attach it to an Intent that will launch an AndroidMeActivity

                    final Bundle bundle = new Bundle(3);
                    bundle.putInt(getString(R.string.key_index_head), mSelectedHead);
                    bundle.putInt(getString(R.string.key_index_body), mSelectedBody);
                    bundle.putInt(getString(R.string.key_index_legs), mSelectedLegs);

                    final Intent intent = new Intent(MainActivity.this, AndroidMeActivity.class);
                    intent.putExtras(bundle);

                    startActivity(intent);
                }
            });
        }

    }

    // Define the behavior for onImageSelected
    public void onImageSelected(int position) {
        Log.d(TAG, "onImageSelected() called with: position = [" + position + "]");

        // Create a Toast that displays the position that was clicked
        Toast.makeText(this, "Position clicked = " + position, Toast.LENGTH_SHORT).show();

        // TODO (2) Based on where a user has clicked, store the selected list index for the head, body, and leg BodyPartFragments
        int qtyPartsPerType = 12; // How many parts for each part type (Head, Body, Legs)
        int idPartsType = position / qtyPartsPerType; // id for part type (0/Head, 1/Body, 2/Legs)
        int indexPartTypeList = position - (qtyPartsPerType * idPartsType); // index in specific part type List
        switch( idPartsType ) {
            case 0:
                mSelectedHead = indexPartTypeList;
                break;
            case 1:
                mSelectedBody = indexPartTypeList;
                break;
            case 2:
                mSelectedLegs = indexPartTypeList;
                break;
            default:
                Log.e(TAG, "onImageSelected: idPartsType: ["+ idPartsType +"], indexInPartList: ["+ indexPartTypeList +"]");
                break;
        }

    }

}
