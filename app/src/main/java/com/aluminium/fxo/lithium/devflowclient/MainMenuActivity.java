package com.aluminium.fxo.lithium.devflowclient;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

//основная активити

public class MainMenuActivity extends AppCompatActivity {

    SharedPreferences preferences;

    TextView TempTV;

    ImageView SearchBtn;
    ImageView BookmarksBtn;
    ImageView TimelineBtn;
    ImageView DownloadsBtn;
    ImageView SettingsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        TempTV = findViewById(R.id.TempTV);

        //подключение дефолтного фрагмента
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.menu_fragment_container, new TimelineScrollFragment()).commit();

        SearchBtn = (ImageButton) findViewById(R.id.SearchButton);
        BookmarksBtn = (ImageButton) findViewById(R.id.BookmarksButton);
        TimelineBtn = (ImageButton) findViewById(R.id.TimelineButton);
        DownloadsBtn = (ImageButton) findViewById(R.id.DownloadsButton);
        SettingsBtn = (ImageButton) findViewById(R.id.SettingsButton);


        SearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new DuckFragment()).addToBackStack(null).commit();
            }
        });

        BookmarksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new WIPFragment()).addToBackStack(null).commit();
            }
        });

        TimelineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new TimelineScrollFragment()).addToBackStack(null).commit();
            }
        });

        DownloadsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new WIPFragment()).addToBackStack(null).commit();
            }
        });

        SettingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                ft.replace(R.id.menu_fragment_container, new WIPFragment()).addToBackStack(null).commit();
            }
        });

        // вывод логина пользователя

        preferences = getSharedPreferences("userInfo", MODE_PRIVATE);
        String user = preferences.getString("SharedLogin", "");
        TempTV.setText(user);
    }


}
