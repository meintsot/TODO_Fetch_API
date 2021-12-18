package com.meintsot.messengerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText usernameText;
    private EditText passwordText;
    private TextView dataView;
    public static String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);
        Button registerButton = findViewById(R.id.registerButton);
        usernameText = findViewById(R.id.usernameText);
        passwordText = findViewById(R.id.passwordText);
        dataView = findViewById(R.id.data);

        loginButton.setOnClickListener(v -> login());
        registerButton.setOnClickListener(v -> goToRegisterPage());
    }

    private void login() {
        String username = usernameText.getText().toString();
        String password = passwordText.getText().toString();
//        login process
        DataFetch process = new DataFetch();
        process.execute();
        dataView.setText(data);
    }

    private void goToRegisterPage() {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}