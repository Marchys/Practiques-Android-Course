package com.hopeta.marcel.fragments_p5;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment implements View.OnClickListener {


    View viewMine;
    ChangeMainImage myCallback;

    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        viewMine= inflater.inflate(R.layout.fragment_fragment3, container, false);
        Button button1 = (Button) viewMine.findViewById(R.id.buttonFragment3);
        button1.setOnClickListener(this);
        return viewMine;
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        myCallback = (ChangeMainImage)activity;
    }

    @Override
    public void onClick(View v){
        myCallback.ChangeImg(R.drawable.swift2);
        //((MainActivity)getActivity()).ChangeText("fragment 1");
    }



}
