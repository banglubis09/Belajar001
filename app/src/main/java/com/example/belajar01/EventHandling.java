package com.example.belajar01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EventHandling extends AppCompatActivity implements View.OnClickListener {
    Button btnanonympus, btninterface,btnlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handling);
        btnanonympus = findViewById(R.id.btn_anonymous);
        btnanonympus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EventHandling.this, "Event handler menggunakan anonymous inner class ", Toast.LENGTH_SHORT).show();
            }
        });
        btninterface = findViewById(R.id.btn_interface);
        btninterface.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String label = ((Button)v).getText().toString();
        Toast.makeText(this, "Event handler intterface "+label, Toast.LENGTH_SHORT).show();

        if (label.equals("interface")){
            Toast.makeText(this, "blabla", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "salah", Toast.LENGTH_SHORT).show();
        }
    }

    public void pijit(View view) {
        
        Toast.makeText(this, "Event handler menggunakan layout ", Toast.LENGTH_SHORT).show();
    }

    public void pijitdua(View view) {
        Toast.makeText(this, "Event handler menggunakan layout02 ", Toast.LENGTH_SHORT).show();
    }
}
