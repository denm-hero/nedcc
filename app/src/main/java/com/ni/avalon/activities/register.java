package com.ni.avalon.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.ni.avalon.R;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        ImageButton backButton = findViewById(R.id.btnBack); // llamamos a nuestro ImageButton por su id
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register.this, MainActivity.class);
                startActivity(intent);
                // aqui decimos que al presionar el boton nos mandara al activity main de nuestro proyecto
            }
        });
    }
}