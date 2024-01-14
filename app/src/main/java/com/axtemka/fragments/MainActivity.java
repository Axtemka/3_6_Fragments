package com.axtemka.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.axtemka.fragments.databinding.ActivityMainBinding;
import com.axtemka.fragments.fragment.FirstFragment;
import com.axtemka.fragments.fragment.SecondFragment;
import com.axtemka.fragments.fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    FragmentManager fragmentManager;
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;

    private ThirdFragment thirdFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fragmentManager = getSupportFragmentManager();

        firstFragment = (FirstFragment) fragmentManager.getFragments().get(0);

        secondFragment = new SecondFragment();

        thirdFragment = new ThirdFragment();

        binding.bntFr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fc_first, secondFragment);
                fragmentTransaction.commit();

            }
        });
        binding.bntFr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fc_first, firstFragment);
                fragmentTransaction.commit();
            }
        });
        binding.bntFr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fc_first, thirdFragment);
                fragmentTransaction.commit();
            }
        });
    }
}