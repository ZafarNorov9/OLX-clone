package com.example.olxclone.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.olxclone.R;
import com.example.olxclone.databinding.FragmentProfileBinding;


public class ProfileFragment extends Fragment {

    FragmentProfileBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

          binding = FragmentProfileBinding.inflate(inflater, container, false);
             View view = binding.getRoot();
             initView();
             return view;
    }

    private void initView() {
        binding.idTahrirlash.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_profileFragment2_to_tahrirlash);
        });
    }
}