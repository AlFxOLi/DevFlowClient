package com.aluminium.fxo.lithium.devflowclient;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

//фрагмент курса

public class TimelineScrollFragment extends Fragment {

    Button boolBtn, mechaBtn, digitBtn, ibmBtn, videoboolBtn, videomechaBtn, videoDigitBtn, videoibmBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_timeline_scroll, container, false);

        boolBtn = (Button) view.findViewById(R.id.boolBtn);
        mechaBtn = (Button) view.findViewById(R.id.mechaBtn);
        digitBtn = (Button) view.findViewById(R.id.digitBtn);
        ibmBtn = (Button) view.findViewById(R.id.ibmBtn);
        videoboolBtn = (Button) view.findViewById(R.id.videoboolBtn);
        videomechaBtn = (Button) view.findViewById(R.id.videomechaBtn);
        videoDigitBtn = (Button) view.findViewById(R.id.videodigitBtn);
        videoibmBtn = (Button) view.findViewById(R.id.videoibmBtn);

        boolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new WebBoolFragment()).addToBackStack(null).commit();
            }
        });

        videoboolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new VideoBoolFragment()).addToBackStack(null).commit();
            }
        });

        mechaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new WebMechaFragment()).addToBackStack(null).commit();
            }
        });

        videomechaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new VideoMechaFragment()).addToBackStack(null).commit();
            }
        });

        digitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new WebDigitalFragment()).addToBackStack(null).commit();
            }
        });

        videoDigitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new VideoDigitalFragment()).addToBackStack(null).commit();
            }
        });

        ibmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new WebIBMFragment()).addToBackStack(null).commit();
            }
        });

        videoibmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new VideoIBMFragment()).addToBackStack(null).commit();
            }
        });

        return view;
    }

}
