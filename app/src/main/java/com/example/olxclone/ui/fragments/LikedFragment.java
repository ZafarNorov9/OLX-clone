package com.example.olxclone.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.olxclone.R;
import com.example.olxclone.databinding.FragmentLikedBinding;
import com.example.olxclone.ui.viewpager.SlidingFragment;
import com.example.olxclone.ui.viewpager.TablayoutViewpagerAdapter;

import java.util.LinkedList;
import java.util.List;

public class LikedFragment extends Fragment {

    FragmentLikedBinding binding;
    List<Fragment> fragmentList;
    List<String> tabNames;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         binding = FragmentLikedBinding.inflate(inflater, container, false);
            View view = binding.getRoot();
            initView();
            return view;
    }

    private void initView() {
        fragmentList = new LinkedList<>();
        tabNames = new LinkedList<>();
        fragmentList.add(new SlidingFragment(R.drawable.success, "Qiziqarli e'lonlarni shu yerda saqlang", "Sizga yoqqan e'lonlarga like bosing va ular shu yerda ko'rinadi."));
        fragmentList.add(new SlidingFragment(R.drawable.support, "O'ziga xos narsani qidiryapsizmi? Qidiruvni saqlang", "Saqlangan qidiruvlaringizga mos keladigan yangi e'lonlar shu yerda paydo bo'ladi."));

        tabNames.add("Saralangan e'lonlar");
        tabNames.add("Saqlangan qidiruvlar");
        TablayoutViewpagerAdapter adapter = new TablayoutViewpagerAdapter(getChildFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, fragmentList, tabNames);
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }
}