package com.tomas.main.controller_view;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.tomas.main.R;
import com.tomas.main.controller_view.fragments.ProgressBar2;
import com.tomas.main.controller_view.fragments.TestHTTPUrlConnection;
import com.tomas.main.controller_view.fragments.TestJSON;
import com.tomas.main.controller_view.fragments.TestNotificacionPersisten;
import com.tomas.main.controller_view.fragments.TestTimerTask;

public class MainActivity extends AppCompatActivity {


    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter
    {

        public SectionsPagerAdapter(FragmentManager fm)
        {
            super(fm);
        }

        @Override
        public Fragment getItem(int position)
        {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch(position)
            {
                case 0:
                    return TestHTTPUrlConnection.newInstance(position + 1);
                case 1:
                    return TestNotificacionPersisten.newInstace(position + 1);
                case 2:
                    return TestTimerTask.newInstace(position + 1);
                case 3:
                    return TestJSON.newInstace(position + 1);
                case 4:
                    return ProgressBar2.newInstance("", "");
                default:
                    return TestHTTPUrlConnection.newInstance(position + 1);
            }
        }

        @Override
        public int getCount()
        {
            // Show 3 total pages.
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            switch (position)
            {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "Clock";
            }
            return null;
        }
    }
}
