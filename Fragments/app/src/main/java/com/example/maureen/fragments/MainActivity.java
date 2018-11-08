package com.example.maureen.fragments;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * This app offers three view fragments and three tabs below the app bar
 * to navigate to them, as well as the options menu showing Settings.
 */

public class MainActivity extends AppCompatActivity {

    /**
     * Creates the content view and toolbar, sets up the tab layout, and sets up a page adapter
     * to manage views in fragments. The user clicks a tab and navigates to the view fragment.
     *
     * @param savedInstanceState Saved instance.
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Create an instance of the tab layout from the view.
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        // Set the text for each tab.
        tabLayout.addTab(tabLayout.newTab().setText("Top stories"));
        tabLayout.addTab(tabLayout.newTab().setText("Tech News"));
        tabLayout.addTab(tabLayout.newTab().setText("Cooking"));
        // Set the tabs to fill the entire layout.
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        // Use PagerAdapter to manage page views in fragments.
        // Each page is represented by its own fragment.
        // This is another example of the adapter pattern.

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        // Setting a listener for clicks.
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu mennu_main) {
       getMenuInflater().inflate(R.menu.menu_main,mennu_main);

    return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id = item.getItemId();
       if (id== R.id.action_settings){
           return  true;
       }
       return  super.onOptionsItemSelected(item);
    }
}

