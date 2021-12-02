package com.example.olxclone.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import com.example.olxclone.R;
import com.example.olxclone.databinding.ItemStaggerRecyclerViewBinding;
import com.example.olxclone.ui.models.ItemStagger;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class AdapterRec2 extends RecyclerView.Adapter<AdapterRec2.MyViewHolder> {
    private final List<ItemStagger> mList;
    private final Context mContext;

    public AdapterRec2(List<ItemStagger> itemStaggers, Context context) {
        this.mList = itemStaggers;
        this.mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new AdapterRec2.MyViewHolder(ItemStaggerRecyclerViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ItemStagger itemStagger = mList.get(position);
        holder.binding.imageId.setImageDrawable(ResourcesCompat.getDrawable(mContext.getResources(), itemStagger.getImage(), null));
        holder.binding.itemName.setText(itemStagger.getName());
        holder.binding.price.setText(itemStagger.getPrice());
        holder.binding.location.setText(itemStagger.getLocation());
        holder.binding.lastSeen.setText(itemStagger.getLast_seen());

        AtomicReference<Boolean> clicked = new AtomicReference<>(true);
        holder.binding.heartButtonBtn.setOnClickListener(v -> {
            if (clicked.get()) {
                holder.binding.heartButtonBtn.setImageResource(R.drawable.ic_like_active);
                Toast.makeText(mContext, "Ajoyib tanlov. Saralanganlarga qo'shildi", Toast.LENGTH_SHORT).show();
                clicked.set(false);
            } else {
                clicked.set(true);
                holder.binding.heartButtonBtn.setImageResource(R.drawable.ic_like);
                Toast.makeText(mContext, "Saralanganlardan o'chirildi", Toast.LENGTH_SHORT).show();
            }
        });


        holder.binding.cardViewStagger.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_advertisementsFragment_to_buyFragment);
        });

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ItemStaggerRecyclerViewBinding binding;
        public MyViewHolder(@NonNull ItemStaggerRecyclerViewBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
