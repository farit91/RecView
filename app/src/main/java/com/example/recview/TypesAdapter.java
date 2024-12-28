package com.example.recview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recview.databinding.ItemCatagoryBinding;
import com.example.recview.databinding.ItemTypesBinding;

import java.util.ArrayList;

public class TypesAdapter extends RecyclerView.Adapter<TypesViewHolder> {

    private ArrayList<String> typesList;

    public TypesAdapter(ArrayList<String> typesList) {
        this.typesList = typesList;
    }

    @NonNull
    @Override
    public TypesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TypesViewHolder(ItemTypesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TypesViewHolder holder, int position) {
        holder.onBind(typesList.get(position));

    }

    @Override
    public int getItemCount() {
        return typesList.size();
    }
}

class TypesViewHolder extends RecyclerView.ViewHolder {
    private ItemTypesBinding binding;

    public TypesViewHolder(@NonNull ItemTypesBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String types) {
        binding.textTitle.setText(types);
    }
}
