package com.thesis.mobiserve;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AdministratorActivity extends AppCompatActivity {
    private NavController navController;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.adminNavHostFragment);
        this.navController = navHostFragment.getNavController();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(this.navController.getGraph()).build();
        this.bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);
        NavigationUI.setupWithNavController(this.bottomNavigationView, this.navController);

        //
        this.initializeMenu();

    }

    private void initializeMenu(){
//        ListView lv;
//        lv = (ListView) findViewById(R.id.admin_menu_list);
//        String menus[]= { "Menu 1", "Menu 2", "Menu 3", "Menu 4", "Menu 5", "Menu 6" };
//        TextView tv = new TextView(this);
//        tv.setText("Menu");
//        lv.addView(tv);
//        this.addContentView(
//                tv,
//                new ConstraintLayout.LayoutParams(
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT
//                )
//        );
    }


}