package com.example.olxclone.ui.fragments;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.example.olxclone.R;
import com.example.olxclone.databinding.FragmentAdvertisementsBinding;
import com.example.olxclone.ui.activities.AllTypesActivity;
import com.example.olxclone.ui.adapters.AdapterRec1;
import com.example.olxclone.ui.adapters.AdapterRec2;
import com.example.olxclone.ui.models.Item;
import com.example.olxclone.ui.models.ItemStagger;
import java.util.LinkedList;
import java.util.List;


public class AdvertisementsFragment extends Fragment {
    FragmentAdvertisementsBinding binding;
    private List<Item> itemList;
    private List<ItemStagger> itemStaggers;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            binding = FragmentAdvertisementsBinding.inflate(inflater, container, false);
               View view = binding.getRoot();
               initView();
               return view;
    }

    private void initView() {
        initRecyclerView1();
        initRecyclerView2();


        binding.allTypes.setOnClickListener(v -> {
           openSecondActivity();
        });

    }




    private void initRecyclerView1() {
        itemList = new LinkedList<>();
        itemList.add(new Item(R.drawable.image_olx, "Barcha ruknlar"));
        itemList.add(new Item(R.drawable.image_olx, "OLXga murojaat"));
        itemList.add(new Item(R.drawable.image_olx, "Ko'chmas mulk"));
        itemList.add(new Item(R.drawable.image_olx, "Transport"));
        itemList.add(new Item(R.drawable.image_olx, "Ish"));
        itemList.add(new Item(R.drawable.image_olx, "Hayvonlar"));
        itemList.add(new Item(R.drawable.image_olx, "Uy va Bog'"));
        itemList.add(new Item(R.drawable.image_olx, "Elektr jihozlari"));
        itemList.add(new Item(R.drawable.image_olx, "Moda va stil"));
        itemList.add(new Item(R.drawable.image_olx, "Xobbi va sport"));
        itemList.add(new Item(R.drawable.image_olx, "Tekinga beraman"));
        itemList.add(new Item(R.drawable.image_olx, "Ayirboshlash"));
        binding.topRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.topRecyclerView.setAdapter(new AdapterRec1(itemList, requireContext()));

    }
    private void initRecyclerView2() {
        itemStaggers = new LinkedList<>();
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        itemStaggers.add(new ItemStagger(R.drawable.headphone, "RUNMUS Gaming Headset", "Toshkent", "Bugun 14:10 da", "110 y.e."));
        binding.staggerRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayout.VERTICAL));
        binding.staggerRecyclerView.setAdapter(new AdapterRec2(itemStaggers, requireContext()));

    }

    private void openSecondActivity() {
        Intent intent = new Intent(getActivity(), AllTypesActivity.class);
        startActivity(intent);
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.profileFragment2) {
            Navigation.findNavController(binding.staggerRecyclerView).navigate(R.id.action_advertisementsFragment_to_buyFragment);
        }
        return true;
    }


}