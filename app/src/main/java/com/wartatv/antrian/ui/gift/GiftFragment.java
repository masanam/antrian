package com.wartatv.antrian.ui.gift;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wartatv.antrian.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GiftFragment extends Fragment {


    public GiftFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_gift, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        return root;
    }

}
