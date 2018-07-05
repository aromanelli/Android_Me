package com.example.android.android_me.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;
import com.example.android.android_me.databinding.FragmentBodyPartBinding;

public class BodyPartFragment extends Fragment {

    // TODO (2) Create a new class called BodyPartFragment to display an image of an Android-Me body part
    // In this class, you'll need to implement an empty constructor and the onCreateView method

    public BodyPartFragment() {
        super(); // REVIEWER: Why empty and not super()
        // (realizing superclass has a zero-arg constructor too, but isn't it better to do a
        // super() call in case the parent class' constructor gets changed later on?)
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // Below code is different from tutorial video ...
        //   https://classroom.udacity.com/nanodegrees/nd801/parts/443745fb-4ae4-4918-8ea1-6bf24e356c1d/modules/6cb81da9-d083-4721-a31b-4f435de9fedd/lessons/79936377-aa69-45ae-a386-d865dcb36518/concepts/e07ab40c-9248-43f8-b78a-c4835aa8aa37
        // as it is using the Android Data Binding Library ...
        //   https://developer.android.com/topic/libraries/data-binding/
        // For fragments ...
        //   https://stackoverflow.com/questions/34706399/how-to-use-data-binding-with-fragment

        FragmentBodyPartBinding binding =
                // inflate for Fragments, setContentView for Activities!
                DataBindingUtil.inflate(inflater, R.layout.fragment_body_part, container, false);

        // TODO (3) Show the first image in the list of head images
        // Soon, you'll update this image display code to show any image you want
        binding.ivBodyPart.setImageResource(
                AndroidImageAssets.getHeads().get(0)
        );

        return binding.getRoot();
    }

}
