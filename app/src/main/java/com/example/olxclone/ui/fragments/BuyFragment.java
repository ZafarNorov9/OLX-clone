package com.example.olxclone.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.olxclone.R;
import com.example.olxclone.databinding.FragmentBuyBinding;


public class BuyFragment extends Fragment {
    FragmentBuyBinding binding;


    public void fade(View view) {
        ImageView nw = (ImageView) binding.fadeImg;
        nw.animate().translationXBy(-1000f).setDuration(2000);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
          binding = FragmentBuyBinding.inflate(inflater, container, false);
             View view = binding.getRoot();
             initView();
             return view;
    }

    private void initView() {
    }
}