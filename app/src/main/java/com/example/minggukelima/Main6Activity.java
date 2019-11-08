package com.example.minggukelima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main6Activity extends AppCompatActivity {

    ImageView imageCamera;
    Button btnBackToCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        imageCamera = findViewById(R.id.image_result);
        btnBackToCamera = findViewById(R.id.btn_back_camera);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            Bitmap img = (Bitmap)extras.get("image");
            if (imageCamera != null){
                imageCamera.setImageBitmap(img);
            }
        }

        btnBackToCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Main5Activity.class));
                finish();
            }
        });
    }
}
