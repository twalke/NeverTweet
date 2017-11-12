package com.example.twalke.nevertweet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    Intent homeIntent = new Intent(Profile.this, MainActivity.class);
                    Profile.this.startActivity(homeIntent);
                    return true;
                case R.id.navigation_search:
                    mTextMessage.setText(R.string.title_search);
                    Intent searchIntent = new Intent(Profile.this, Search.class);
                    Profile.this.startActivity(searchIntent);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    Intent notifyIntent = new Intent(Profile.this, Notifications.class);
                    Profile.this.startActivity(notifyIntent);
                    return true;
                case R.id.navigation_dm:
                    mTextMessage.setText(R.string.title_dm);
                    Intent dmIntent = new Intent(Profile.this, Notifications.class);
                    Profile.this.startActivity(dmIntent);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
