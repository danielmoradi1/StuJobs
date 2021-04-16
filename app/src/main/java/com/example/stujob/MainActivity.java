package com.example.stujob;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * @author Daniel Moradi
 * Här skrivs javakoden för logiken.
 */

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom_navigation);

        BottomNavigationView bottomNavigationView = findViewById(R.id.buttom_Nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_continer,new HomeGUI()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment selectedfragment = null;

            switch (item.getItemId()){

                case R.id.home:
                    selectedfragment = new HomeGUI();
                    break;

                case R.id.profile:
                    selectedfragment = new Login();
                    break;

                case R.id.contact:
                    selectedfragment = new Contact_us();
                    break;

                case R.id.contract:
                    selectedfragment = new Contract();
                    break;

                case R.id.register:
                    selectedfragment = new Register();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_continer, selectedfragment).commit();
            return true;
        }
    };
}
