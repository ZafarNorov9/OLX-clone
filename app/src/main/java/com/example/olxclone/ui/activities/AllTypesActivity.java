package com.example.olxclone.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.olxclone.R;
import com.example.olxclone.databinding.ActivityAllTypesBinding;
import com.example.olxclone.ui.adapters.AdapterRecAll;
import com.example.olxclone.ui.fragments.AdvertisementsFragment;
import com.example.olxclone.ui.models.ItemAll;

import java.util.LinkedList;
import java.util.List;

public class AllTypesActivity extends AppCompatActivity {

    ActivityAllTypesBinding binding;
    List<ItemAll> itemAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAllTypesBinding.inflate(getLayoutInflater());
            View view = binding.getRoot();
            setContentView(view);
            initView();
    }

    private void initView() {
        initRecyclerView();
        binding.collapsingToolbar.setContentScrimColor(Color.parseColor("#FFFFFF"));
        binding.toolbar.setNavigationIcon(R.drawable.ic_back);
        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoBackToPrevious();

            }
        });
    }

    private void initRecyclerView() {
        itemAll = new LinkedList<>();
        itemAll.add(new ItemAll(R.drawable.image_olx, R.color.white, "Barcha ruknlar", "800763 e'lonlar"));
        itemAll.add(new ItemAll(R.drawable.image_olx, R.color.yellow_light, "Bolalar dunyosi", "41887 e'lonlar"));
        itemAll.add(new ItemAll(R.drawable.image_olx, R.color.sky, "Ko'chmas mulk", "137289 e'lonlar"));
        itemAll.add(new ItemAll(R.drawable.image_olx, R.color.color3, "Transport","77181 e'lonlar"));
        itemAll.add(new ItemAll(R.drawable.image_olx, R.color.color4, "Ish", "25487 e'lonlar"));
        itemAll.add(new ItemAll(R.drawable.image_olx, R.color.color5, "Hayvonlar", "17335 e'lonlar"));
        itemAll.add(new ItemAll(R.drawable.image_olx, R.color.color6, "Uy va bog'", "102349 e'lonlar"));
        itemAll.add(new ItemAll(R.drawable.image_olx, R.color.color7, "Elektr jihozlar", "123569 e'lonlar"));
        binding.recyclerViewAll.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerViewAll.setAdapter(new AdapterRecAll(itemAll, this));
    }
    private void GoBackToPrevious() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}