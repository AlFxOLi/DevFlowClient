package com.aluminium.fxo.lithium.devflowclient;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

//активити окна входа в аккаунт
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //подключение фрагмента с кнопками для авторизации и регистрации

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, new BlankFragment()).commit();
    }

    //переход в окно аутентификации или регистрации в соответсвии с нажатой кнопкой с сохранением последовательности переходов

    public void loadFragment(View view) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (view.getId()) {
            case R.id.initialSignInBtn:
                fragmentTransaction.replace(R.id.fragment_container, new SignInFragment()).addToBackStack(null).commit();
                break;
            case R.id.initialSignUpBtn:
                fragmentTransaction.replace(R.id.fragment_container, new SignUpFragment()).addToBackStack(null).commit();
                break;
        }
    }


}
