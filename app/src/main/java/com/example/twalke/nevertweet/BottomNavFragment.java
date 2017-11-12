package com.example.twalke.nevertweet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomNavFragment extends Fragment {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    Intent homeIntent = new Intent(BottomNavFragment.this.getActivity(), MainActivity.class);
                    BottomNavFragment.this.startActivity(homeIntent);
                    return true;
                case R.id.navigation_search:
                    mTextMessage.setText(R.string.title_search);
                    Intent searchIntent = new Intent(BottomNavFragment.this.getActivity(), Search.class);
                    BottomNavFragment.this.startActivity(searchIntent);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    Intent notifyIntent = new Intent(BottomNavFragment.this.getActivity(), Notifications.class);
                    BottomNavFragment.this.startActivity(notifyIntent);
                    return true;
                case R.id.navigation_dm:
                    mTextMessage.setText(R.string.title_dm);
                    Intent dmIntent = new Intent(BottomNavFragment.this.getActivity(), Notifications.class);
                    BottomNavFragment.this.startActivity(dmIntent);
                    return true;
            }
            return false;
        }

    };
}
