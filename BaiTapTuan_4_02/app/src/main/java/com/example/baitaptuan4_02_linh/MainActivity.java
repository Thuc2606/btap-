package com.example.baitaptuan4_02_linh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editEmail;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.editEmail);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {
            String email = editEmail.getText().toString().trim();
            Intent intent = new Intent(MainActivity.this, VerifyActivity.class);
            intent.putExtra("email", email);
            startActivity(intent);
        });
    }
}