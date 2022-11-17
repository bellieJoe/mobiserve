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
    public NavController navController;
    private BottomNavigationView bottomNavigationView;
    private NavHostFragment navHostFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);

        this.navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.adminNavHostFragment);
        this.navController = navHostFragment.getNavController();

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(this.navController.getGraph()).build();
        this.bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);
        NavigationUI.setupWithNavController(this.bottomNavigationView, this.navController);
//        this.navController.navigate

    }

    public void showMenu(View v){
        this.navController.navigate(R.id.navigation_admin_menu);
//        this.navController.navigate(R.id.navigation_admin_home);
    }

    public void hideMenu(View v){
//        this.navHostFragment.
//        this.navController.navigate(R.id.navigation_admin_home);
        this.navController.popBackStack();
    }



}