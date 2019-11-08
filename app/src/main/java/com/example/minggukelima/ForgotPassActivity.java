package com.example.minggukelima;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassActivity extends AppCompatActivity {

    EditText etEmail3;
    Button btnSubmit;
//    FirebaseAuth mAuth;
    private final String TAG = "tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);

        etEmail3 = findViewById(R.id.EtEmail3);
        btnSubmit = findViewById(R.id.BtnSubmit);
//        mAuth = FirebaseAuth.getInstance();

//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String email = etEmail3.getText().toString().trim();
//                mAuth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//                        Log.d(TAG, "Email sent.");
//                        Toast.makeText(ForgotPassActivity.this, "Check your email for password recovery link.", Toast.LENGTH_LONG).show();
//                        startActivity(new Intent(getApplicationContext(), Main2Activity.class));
//                    }
//                });
//            }
//        });
    }
}
