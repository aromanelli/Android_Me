package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class MasterListFragment extends Fragment {

    // TODO (2) Create a new class called MasterListFragment which will display the GridView list of ALL AndroidMe images
    // In the fragment class, you'll need to implement an empty constructor, and onCreateView

    public MasterListFragment() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        GridView rootView =
                (GridView) inflater.inflate(R.layout.fragment_master_list, container, false);

        // TODO (3) In the MasterListFragment class, create a new MasterListAdapter and set it on the GridView
        // The MasterListAdapter code is provided; it creates the ImageViews that are contained in the GridView
        // The adapter takes as parameters (Context context, List<Integer> imageIds)

        rootView.setAdapter(
                new MasterListAdapter( getContext(), AndroidImageAssets.getAll() )
        );

        return rootView;
    }

}
