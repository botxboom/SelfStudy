package com.example.selfstudy;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.selfstudy.Fragments.add_fragment;
import com.example.selfstudy.Fragments.home_fragment;
import com.example.selfstudy.Fragments.inbox_fragment;
import com.example.selfstudy.Fragments.profile_fragment;
import com.example.selfstudy.Fragments.school_fragment;
import com.gigamole.navigationtabbar.ntb.NavigationTabBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public BottomNavigationView bottomNavigationView;
    public FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = findViewById(R.id.fragmentContainer);
        bottomNavigationView = findViewById(R.id.bottom_navigation_bar);

        //calling the bottomnavigation function.---------------------------------------------------------
        //init();

        //default bottomnavigationSetup-----------------------------------------------------------------------
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @SuppressLint("ResourceType")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        frameLayout.setVisibility(View.VISIBLE);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new home_fragment()).commit();
                        break;

                    case R.id.nav_school:
                        frameLayout.setVisibility(View.VISIBLE);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new school_fragment()).commit();
                        break;

                    case R.id.nav_add:
                        frameLayout.setVisibility(View.VISIBLE);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new add_fragment()).commit();
                        break;

                    case R.id.nav_inbox:
                        frameLayout.setVisibility(View.VISIBLE);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new inbox_fragment()).commit();
                        break;

                    case R.id.nav_profile:
                        frameLayout.setVisibility(View.VISIBLE);
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new profile_fragment()).commit();
                        break;

                }

                return false;
            }


        });
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

   }

   //for bottomnavigation bar costumization.--------------------------------------------------------------------

   /*private void init(){
       final NavigationTabBar ntbSample5 = (NavigationTabBar) findViewById(R.id.bottom_navigation_bar);
       final ArrayList<NavigationTabBar.Model> models5 = new ArrayList<>();
       models5.add(
               new NavigationTabBar.Model.Builder(
                       getResources().getDrawable(R.drawable.ic_home), Color.WHITE
               ).build()
       );
       models5.add(
               new NavigationTabBar.Model.Builder(
                       getResources().getDrawable(R.drawable.ic_school), Color.WHITE
               ).build()
       );
       models5.add(
               new NavigationTabBar.Model.Builder(
                       getResources().getDrawable(R.drawable.ic_add), Color.WHITE
               ).build()
       );
       models5.add(
               new NavigationTabBar.Model.Builder(
                       getResources().getDrawable(R.drawable.ic_inbox), Color.WHITE
               ).build()
       );
       models5.add(
               new NavigationTabBar.Model.Builder(
                       getResources().getDrawable(R.drawable.ic_profile), Color.WHITE
               ).build()
       );
       ntbSample5.setModels(models5);
       ntbSample5.setModelIndex(2, true);
       ntbSample5.setOnTabBarSelectedIndexListener(new NavigationTabBar.OnTabBarSelectedIndexListener() {
           @Override
           public void onStartTabSelected(final NavigationTabBar.Model model, final int index) {

           }

           @Override
           public void onEndTabSelected(final NavigationTabBar.Model model, final int index) {
               Toast.makeText(MainActivity.this, String.format("onEndTabSelected #%d", index), Toast.LENGTH_SHORT).show();

               switch (index) {
                   case 0:
                       frameLayout.setVisibility(View.VISIBLE);
                       getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new home_fragment()).commit();
                       break;

                   case 1:
                       frameLayout.setVisibility(View.VISIBLE);
                       getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new school_fragment()).commit();
                       break;

                   case 2:
                       frameLayout.setVisibility(View.VISIBLE);
                       getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new add_fragment()).commit();
                       break;

                   case 3:
                       frameLayout.setVisibility(View.VISIBLE);
                       getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new inbox_fragment()).commit();
                       break;

                   case 4:
                       frameLayout.setVisibility(View.VISIBLE);
                       getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new profile_fragment()).commit();
                       break;

               }


           }
       });
   }*/

}


