package com.zybooks.cop4656finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Find the TextView by its ID
        TextView textView = findViewById(R.id.budgetCard);

        // Set OnClickListener for the TextView
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event here
                // For example, you can show a Toast message

                Toast.makeText(SecondActivity.this, "Div block clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}