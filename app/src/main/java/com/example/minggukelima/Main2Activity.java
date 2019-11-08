package com.example.minggukelima;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {
    EditText etEmail, etPass;
    Button btnSignIn2, btnNew;
    TextView tvTitle, tvNamaEmail, tvPass, tvForgot, tvOr;
    ImageView logo2, imgFb1, imgGo1;
    private FirebaseAuth mAuth;


    LoginButton facebookLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etEmail = findViewById(R.id.EtEmail);
        etPass = findViewById(R.id.EtPass);
        imgFb1 = findViewById(R.id.ImgFb1);
        imgGo1 = findViewById(R.id.ImgGo1);
        tvForgot = findViewById(R.id.TvForgot);
        btnSignIn2 = findViewById(R.id.BtnSignIn2);
        btnNew = findViewById(R.id.BtnNew);

        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });

        btnSignIn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
            }
        });


    }
}

