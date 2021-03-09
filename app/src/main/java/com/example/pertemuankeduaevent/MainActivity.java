package com.example.pertemuankeduaevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pertemuankeduaevent.R;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edEmail, edPassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edEmail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edPassword = findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String Email = edEmail.getText().toString();
                String Password = edPassword.getText().toString();
                if (Email.equals("admin@mail.com")&&Password.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG).show();
                }
                else if (!Email.equals("admin@mail.com")&&Password.equals("123")){
                    Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_LONG).show();
                }
                else if (Email.equals("admin@mail.com")&&!Password.equals("123")){
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Email dan Password salah", Toast.LENGTH_LONG).show();
                }
               //menyimpan input user di edittext email kedalam variabel nama
                nama = edEmail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edPassword.getText().toString();

                //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda: " + nama + " dan Password anda: " + password + "", Toast.LENGTH_LONG);
                //menampilkan toast
                t.show();
            }
        });
    }
}