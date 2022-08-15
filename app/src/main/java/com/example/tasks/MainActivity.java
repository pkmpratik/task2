package com.example.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name,password,mail;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.et_name);
        password = findViewById(R.id.et_password);
        mail = findViewById(R.id.et_mail);
        add = findViewById(R.id.bt_add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = name.getText().toString();
                String userpass = password.getText().toString();
                String usermail = mail.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("uname",username);
                intent.putExtra("upass",userpass);
                intent.putExtra("umail",usermail);
                startActivity(intent);
            }
        });
    }
}