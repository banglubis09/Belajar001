package com.example.belajar01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RatingBar ratingBar;
        final Spinner spinMakanan;
        Button btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        ratingBar = findViewById(R.id.rating);
        spinMakanan = findViewById(R.id.spin_makanan);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(Homepage.this, "Nilai", Toast.LENGTH_SHORT).show();
            }
        });

        btn = findViewById(R.id.btn_spin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Homepage.this, "Anda makan "+spinMakanan.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
