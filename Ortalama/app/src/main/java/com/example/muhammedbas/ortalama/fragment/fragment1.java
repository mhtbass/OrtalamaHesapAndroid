package com.example.muhammedbas.ortalama.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.muhammedbas.ortalama.R;

/**
 * Created by mamibas on 8.08.2017.
 */

public class fragment1 extends Fragment {

    public fragment1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment1,container,false);
        return rootView;
    }
}
