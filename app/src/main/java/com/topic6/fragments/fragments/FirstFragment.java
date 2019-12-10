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
public class FirstFragment extends Fragment implements View.OnClickListener {


    public FirstFragment() {
        // Required empty public constructor
    }

    private Button btnCalculate;
    private EditText etNumber1, etNumber2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        etNumber1 = view.findViewById(R.id.etNumber1);
        etNumber2 = view.findViewById(R.id.etNumber2);
        btnCalculate = view.findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int num1, num2, result;
        num1 = Integer.parseInt(etNumber1.getText().toString());
        num2 = Integer.parseInt(etNumber2.getText().toString());
        result = num1 + num2;

        Toast.makeText(getActivity(), "Sum is:" + result, Toast.LENGTH_SHORT).show();
    }
}
