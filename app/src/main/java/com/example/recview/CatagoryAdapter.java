package com.example.recview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recview.databinding.ItemCatagoryBinding;

import java.util.ArrayList;

public class CatagoryAdapter extends RecyclerView.Adapter<CatagoryViewHolder> {

    private ArrayList<Catagory> catagoryList;

    public CatagoryAdapter(ArrayList<Catagory> catagoryList) {
        this.catagoryList = catagoryList;
    }

    @NonNull
    @Override
    public CatagoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CatagoryViewHolder(ItemCatagoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CatagoryViewHolder holder, int position) {
        holder.onBind(catagoryList.get(position));

    }

    @Override
    public int getItemCount() {
        return catagoryList.size();
    }
}

class CatagoryViewHolder extends RecyclerView.ViewHolder {
    private ItemCatagoryBinding binding;

    public CatagoryViewHolder(@NonNull ItemCatagoryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Catagory catagory) {
        binding.tvCatagory.setText(catagory.getName());
        Glide.with(binding.imgCatagory).load(catagory.getImgCatagory()).into(binding.imgCatagory);

    }
}