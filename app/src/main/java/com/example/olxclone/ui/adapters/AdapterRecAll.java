package com.example.olxclone.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olxclone.databinding.ItemRecAllBinding;
import com.example.olxclone.ui.models.ItemAll;

import java.util.List;

public class AdapterRecAll extends RecyclerView.Adapter<AdapterRecAll.MyViewHolder> {
    private final List<ItemAll> mList;
    private final Context mContext;

    public AdapterRecAll(List<ItemAll> itemAll, Context context) {
        this.mList = itemAll;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(ItemRecAllBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ItemAll itemAll = mList.get(position);
        holder.binding.image.setImageDrawable(ResourcesCompat.getDrawable(mContext.getResources(), itemAll.getImage(), null));
        holder.binding.cardViewAll.setCardBackgroundColor(ResourcesCompat.getColor(mContext.getResources(), itemAll.getColor(), null));
        holder.binding.type.setText(itemAll.getType());
        holder.binding.howMany.setText(itemAll.getHowMany());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ItemRecAllBinding binding;
        public MyViewHolder(@NonNull ItemRecAllBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
