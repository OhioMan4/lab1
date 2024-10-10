package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button bt1=findViewById(R.id.button3);
        bt1.setOnClickListener(view -> {
            Intent intent1 = new Intent(this, UI1.class);

            startActivity(intent1);
        });
        Button bt2=findViewById(R.id.button4);
        bt2.setOnClickListener(view -> {
            Intent intent2 = new Intent(this, UI2.class);

            startActivity(intent2);
        });
    }
}