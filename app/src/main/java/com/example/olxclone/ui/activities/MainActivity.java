package com.example.olxclone.ui.activities;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.example.olxclone.R;
import com.example.olxclone.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        binding = ActivityMainBinding.inflate(getLayoutInflater());
            View view = binding.getRoot();
            setContentView(view);
            initView();
//        BottomNavigationView bottomNavigationView;
//
//        binding.bottomNav.setOnNavigationItemSelectedListener(item -> {
//            switch (item.getItemId()) {
//                case R.id.fragmentAdvertise:
//                    openNewIntent();
//                    break;
//            }
//
//            return true;
//        });



    }

    private void openNewIntent() {
        Intent intent = new Intent(this, AdvertiseActivity.class);
        startActivity(intent);
    }

    private void initView() {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomNav, navController);
        binding.bottomNav.setItemIconTintList(null);


    }









}