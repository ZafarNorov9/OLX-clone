package com.example.olxclone.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.olxclone.R;
import com.example.olxclone.databinding.ActivityAdvertiseBinding;

public class AdvertiseActivity extends AppCompatActivity {
    ActivityAdvertiseBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdvertiseBinding.inflate(getLayoutInflater());
            View view = binding.getRoot();
            setContentView(view);
            initView();
    }

    private void initView() {
    }
}