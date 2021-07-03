package com.maulanakurnia.responsi.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.maulanakurnia.responsi.R;

@SuppressLint("NonConstantResourceId")
public class MainActivity extends AppCompatActivity {

    protected BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navView = findViewById(R.id.bottom_navigation);
        navView.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.home:
                    fragment = new HomeFragment();
                    break;
                case R.id.fraskes:
                    fragment = new FaskesFragment();
                    break;
            }
            return loadFragment(fragment);
        });

        loadFragment(new HomeFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fr_main_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}