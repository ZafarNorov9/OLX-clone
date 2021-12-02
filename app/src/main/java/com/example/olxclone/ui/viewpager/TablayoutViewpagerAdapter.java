package com.example.olxclone.ui.viewpager;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class TablayoutViewpagerAdapter extends FragmentStatePagerAdapter {


    private final List<Fragment> mList;
    private final List<String> mTabnames;

    public TablayoutViewpagerAdapter(FragmentManager fm, int behavior, List<Fragment> fragmentList, List<String> tabNames) {
        super(fm, behavior);
        this.mList = fragmentList;
        this.mTabnames = tabNames;
    }

    @NonNull
        @Override
        public Fragment getItem(int position) {
            return mList.get(position);
        }

        @Override
        public int getCount() {
            return mList.size();
        }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabnames.get(position);
    }

}


