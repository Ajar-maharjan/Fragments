package com.topic6.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.topic6.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    private Button btnArea;
    private EditText etRadius;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        etRadius = view.findViewById(R.id.etRadius);
        btnArea = view.findViewById(R.id.btnArea);
        btnArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float area, radius;
        radius = Float.parseFloat(etRadius.getText().toString());
        area = (float) (3.14 * radius * radius);
        Toast.makeText(getActivity(), "Area of circle is:" + area, Toast.LENGTH_SHORT).show();


    }
}
