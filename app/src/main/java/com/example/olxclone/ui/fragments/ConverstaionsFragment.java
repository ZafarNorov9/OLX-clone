package com.example.olxclone.ui.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.olxclone.R;
import com.example.olxclone.databinding.FragmentConverstaionsBinding;

public class ConverstaionsFragment extends Fragment {

    FragmentConverstaionsBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
          binding = FragmentConverstaionsBinding.inflate(inflater, container, false);
             View view = binding.getRoot();
             initView();
             return view;
    }

    private void initView() {
        binding.textViewFilter.setOnClickListener(v -> {
            Toast.makeText(requireContext(), "Bu tanlov mavjud emas", Toast.LENGTH_SHORT).show();
        });
    }
}