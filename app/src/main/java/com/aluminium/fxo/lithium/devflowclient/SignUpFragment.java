package com.aluminium.fxo.lithium.devflowclient;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import static android.content.Context.MODE_PRIVATE;

//Фрагмент регистрации

public class SignUpFragment extends Fragment {

    SharedPreferences preferences;

    Button registerBtn;
    EditText loginEt;
    EditText passwordET;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        loginEt = (EditText) view.findViewById(R.id.loginET);
        passwordET = (EditText) view.findViewById(R.id.passwordET);
        registerBtn = (Button) view.findViewById(R.id.registerBtn);
        final TextView commentTV = (TextView) view.findViewById(R.id.commentTV);

        commentTV.setText("");

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                запись данных входа в память приложения
                нужно сделать хеширование и проверку на сервере
                 */

                String login = loginEt.getText().toString();
                String password = passwordET.getText().toString();

                preferences = getActivity().getSharedPreferences("userInfo", MODE_PRIVATE);
                SharedPreferences.Editor ed = preferences.edit();
                ed.putString("SharedLogin", login);
                ed.putString("SharedPassword", password);
                ed.apply();
                Toast toast = Toast.makeText(getActivity(), "Данные сохранены, " + login, Toast.LENGTH_SHORT);
                toast.show();
                Intent intent = new Intent(getActivity(), MainMenuActivity.class);
                startActivity(intent);
            }

        });

        return view;
    }

}
