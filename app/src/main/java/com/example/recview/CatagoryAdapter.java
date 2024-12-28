package com.example.recview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recview.databinding.ItemCatagoryBinding;

import java.util.ArrayList;

public class CatagoryAdapter extends RecyclerView.Adapter<DoramaViewHolder> {

    private ArrayList<Catagory> doramaList;

    public CatagoryAdapter(ArrayList<Catagory> doramaList) {
        this.doramaList = doramaList;
    }

    @NonNull
    @Override
    public DoramaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DoramaViewHolder(ItemCatagoryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DoramaViewHolder holder, int position) {
        holder.onBind(doramaList.get(position));

    }

    @Override
    public int getItemCount() {
        return doramaList.size();
    }
}

class DoramaViewHolder extends RecyclerView.ViewHolder {
    private ItemCatagoryBinding binding;

    public DoramaViewHolder(@NonNull ItemCatagoryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Catagory catagory) {
        binding.tvCatagory.setText(catagory.getName());
        Glide.with(binding.imgCatagory).load(catagory.getImgCatagory()).into(binding.imgCatagory);

    }
}