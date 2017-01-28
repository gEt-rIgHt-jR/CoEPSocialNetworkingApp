package com.aceshub.coepsocialnetworkingapp.view.activities;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.aceshub.coepsocialnetworkingapp.R;
import com.aceshub.coepsocialnetworkingapp.model.UIData;
import com.aceshub.coepsocialnetworkingapp.view.adapters.NonScrollableViewPager;
import com.aceshub.coepsocialnetworkingapp.view.fragments.HomeFragment;
import com.aceshub.coepsocialnetworkingapp.view.fragments.NotificationsFragment;
import com.aceshub.coepsocialnetworkingapp.view.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private NonScrollableViewPager mViewPager;
    private TabLayout tabLayout;

    private UIData uiData = new UIData();
    private TextView appTitleTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (NonScrollableViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        appTitleTextview = (TextView) findViewById(R.id.textview_main_title);
        Typeface font = Typeface.createFromAsset(getAssets(), "ForeverBrushScriptDemo.otf");
        appTitleTextview.setTypeface(font);

        //Setting tab icons
        setTabIcons();

        //tab change listener to change icons
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.setIcon(uiData.getIconSelected(tab.getPosition()));
                appTitleTextview.setText(uiData.getMainActivityTabName(tab.getPosition()));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.setIcon(uiData.getIconNormal(tab.getPosition()));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //Setting Home as first tab
        TabLayout.Tab homeTab = tabLayout.getTabAt(1);
        homeTab.select();

    }

    //Sets tab icons
    private void setTabIcons() {
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            //Tab icons are stored in UIData class
            tabLayout.getTabAt(i).setIcon(uiData.getIconNormal(i));
        }
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {
        SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 1:
                    return new HomeFragment();
                case 0:
                    return new NotificationsFragment();
                case 2:
                    return new ProfileFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return uiData.mainActivityTabsCount();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }
    }

}
