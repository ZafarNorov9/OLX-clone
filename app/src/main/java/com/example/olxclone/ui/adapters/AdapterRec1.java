package com.example.olxclone.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olxclone.databinding.ItemTopRecyclerViewBinding;
import com.example.olxclone.ui.models.Item;

import java.util.List;

public class AdapterRec1 extends RecyclerView.Adapter<AdapterRec1.MyViewHolder> {
    private final List<Item> mList;
    private final Context mContext;

    public AdapterRec1(List<Item> itemList, Context c) {
        this.mList = itemList;
        this.mContext = c;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(ItemTopRecyclerViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = mList.get(position);
        holder.binding.circleImage.setImageDrawable(ResourcesCompat.getDrawable(mContext.getResources(), item.getImage(), null));
        holder.binding.circleImgName.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ItemTopRecyclerViewBinding binding;

        public MyViewHolder(@NonNull ItemTopRecyclerViewBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
