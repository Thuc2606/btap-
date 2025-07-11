package com.example.baitaptuan4_02_linh;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class VerifyActivity extends AppCompatActivity {

    TextView textVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        textVerify = findViewById(R.id.textVerify);

        String email = getIntent().getStringExtra("email");
        textVerify.setText("Verify Code\nSent to: " + email);
    }
}