package com.example.meownavitgation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {

    private MeowBottomNavigation bottomNavigation;
    RelativeLayout setting, home, person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.buttomNavigation);
        setting = findViewById(R.id.setting);
        home = findViewById(R.id.home);
        person = findViewById(R.id.person);


        //je layout ta apps open korle 1st a asbe aita lekhar code
        bottomNavigation.show(2, true);


        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.baseline_settings_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.baseline_person_24));

        bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>(){
            @Override
            public Unit invoke(MeowBottomNavigation.Model model){

                switch (model.getId()){
                    case 1:
                        setting.setVisibility(View.VISIBLE);
                        home.setVisibility(View.GONE);
                        person.setVisibility(View.GONE);
                        break;

                    case 2:
                        setting.setVisibility(View.GONE);
                        home.setVisibility(View.VISIBLE);
                        person.setVisibility(View.GONE);
                        break;
                    case 3:
                        setting.setVisibility(View.GONE);
                        home.setVisibility(View.GONE);
                        person.setVisibility(View.VISIBLE);
                        break;
                }



                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch(model.getId()){
                    case 1:
                        setting.setVisibility(View.VISIBLE);
                        home.setVisibility(View.GONE);
                        person.setVisibility(View.GONE);

                        break;
                }

                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch(model.getId()){
                    case 2:

                        setting.setVisibility(View.GONE);
                        home.setVisibility(View.VISIBLE);
                        person.setVisibility(View.GONE);
                        break;
                }

                return null;
            }
        });

        bottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {

                switch(model.getId()){
                    case 3:

                        setting.setVisibility(View.GONE);
                        home.setVisibility(View.GONE);
                        person.setVisibility(View.VISIBLE);
                        break;
                }

                return null;
            }
        });


    }
}