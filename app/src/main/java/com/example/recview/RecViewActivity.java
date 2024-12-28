package com.example.recview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.recview.databinding.ActivityRecViewBinding;

import java.util.ArrayList;

public class RecViewActivity extends AppCompatActivity {

    private ActivityRecViewBinding binding;
    private ArrayList<Catagory> catagoryList = new ArrayList<>();
    private ArrayList<String> typeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityRecViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        intAdapterType();
        intLoadType();
        initAdapterCatagory();
        initLoadCatagory();
    }

    private void intAdapterType() {
        typeList.add("Burger");
        typeList.add("Burger");
        typeList.add("Burger");
        typeList.add("Burger");
        typeList.add("Burger");
    }

    private void intLoadType() {
        TypesAdapter adapter = new TypesAdapter(typeList);
        binding.rvType.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvType.setLayoutManager(layoutManager);
    }

    private void initLoadCatagory() {
        catagoryList.add(new Catagory("Burger", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.com%2Ffree-icon%2Fburger_5787016&psig=AOvVaw2GrQ1h9g82aSbZrUvmTzJS&ust=1735395351161000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNCwo9HAyYoDFQAAAAAdAAAAABAE"));
        catagoryList.add(new Catagory("Hamburger", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.com%2Ffree-icon%2Fburger_1046784&psig=AOvVaw2GrQ1h9g82aSbZrUvmTzJS&ust=1735395351161000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNCwo9HAyYoDFQAAAAAdAAAAABAI"));
        catagoryList.add(new Catagory("HotDog", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.com%2Ffree-icon%2Fburger_1046784&psig=AOvVaw2GrQ1h9g82aSbZrUvmTzJS&ust=1735395351161000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNCwo9HAyYoDFQAAAAAdAAAAABAI"));
        catagoryList.add(new Catagory("Pizza", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.com%2Ffree-icon%2Fburger_1046784&psig=AOvVaw2GrQ1h9g82aSbZrUvmTzJS&ust=1735395351161000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNCwo9HAyYoDFQAAAAAdAAAAABAI"));
        catagoryList.add(new Catagory("Doner", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.com%2Ffree-icon%2Fburger_1046784&psig=AOvVaw2GrQ1h9g82aSbZrUvmTzJS&ust=1735395351161000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNCwo9HAyYoDFQAAAAAdAAAAABAI"));
        catagoryList.add(new Catagory("Shaurma", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.com%2Ffree-icon%2Fburger_1046784&psig=AOvVaw2GrQ1h9g82aSbZrUvmTzJS&ust=1735395351161000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNCwo9HAyYoDFQAAAAAdAAAAABAI"));
    }

    private void initAdapterCatagory() {
        CatagoryAdapter adapter = new CatagoryAdapter(catagoryList);
        binding.rvCatagory.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.rvCatagory.setLayoutManager(layoutManager);
    }
}