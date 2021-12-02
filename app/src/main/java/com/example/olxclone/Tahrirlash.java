package com.example.olxclone;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.olxclone.databinding.FragmentTahrirlashBinding;

public class Tahrirlash extends Fragment {

    FragmentTahrirlashBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

          binding = FragmentTahrirlashBinding.inflate(inflater, container, false);
             View view = binding.getRoot();
             initView();
             return view;
    }

    private void initView() {
        binding.collapsingToolbar.setContentScrimColor(Color.parseColor("#FFFFFF"));
        binding.toolbar.setNavigationIcon(R.drawable.ic_back);
        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoBackToPrevious();

            }
        });
    }

    private void GoBackToPrevious() {
        Navigation.findNavController(binding.toolbar).navigate(R.id.action_tahrirlash_to_profileFragment2);
    }
}