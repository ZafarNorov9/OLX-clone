package com.example.olxclone.ui.viewpager;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.olxclone.R;
import com.example.olxclone.databinding.FragmentSlidingBinding;

public class SlidingFragment extends Fragment {

    private final int ImageId;
    private final String title;
    private final String description;
    FragmentSlidingBinding binding;

    public SlidingFragment(int imageId, String title, String description) {
        this.ImageId = imageId;
        this.title = title;
        this.description = description;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
          binding = FragmentSlidingBinding.inflate(inflater, container, false);
             View view = binding.getRoot();
             initView();
             return view;
    }

    private void initView() {
        binding.imageSliding.setImageDrawable(ContextCompat.getDrawable(requireContext(), ImageId));
        binding.textViewLikes.setText(title);
        binding.textViewLikesDescription.setText(description);
    }
}