package com.example.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView name,password,mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.tv_name);
        password = findViewById(R.id.tv_pass);
        mail = findViewById(R.id.tv_mail);

        String username = getIntent().getStringExtra("uname");
        String userpass = getIntent().getStringExtra("upass");
        String usermail = getIntent().getStringExtra("umail");

        name.setText(username);
        password.setText(userpass);
        mail.setText(usermail);
    }
}