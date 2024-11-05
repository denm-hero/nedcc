package com.ni.avalon.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.ni.avalon.CRUD.crud;
import com.ni.avalon.R;

public class MainActivity extends AppCompatActivity {

    EditText user, password; // declaramos el tipo de variable de nuestro user y password
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Boton registrarse
        Button registerButton = findViewById(R.id.btnRegister); // llamamos a nuestro Button por su id
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, register.class);
                startActivity(intent);
                // aqui decimos que al presionar el boton nos mandara al activity register de nuestro proyecto
            }
        });

        // Instanciamos las variables
        user = findViewById(R.id.user); // declaramos una variable para nuestro campo de texto de usuario
        password = findViewById(R.id.password); // declaramos una variable para nuestro campo de texto de contraseña

        // Boton iniciar sesion
        Button loginButton = findViewById(R.id.btnLogin); // llamamos a nuestro Button por su id
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NameUser = user.getText().toString().trim(); // convertimos el texto del campo de usuario en string
                String PassUser = password.getText().toString().trim(); // convertimos el texto del campo de contraseña en string

                if(NameUser.isEmpty() && PassUser.isEmpty()){ // definimos una condicional
                    Toast.makeText(MainActivity.this, "Porfavor ingresa los datos", Toast.LENGTH_SHORT).show();
                    // en caso de que no haya ningun campo de texto nos mostrara un mensaje pidiendo que rellenemos los campos de nuestro login
                }
                else{
                    Intent intent = new Intent(MainActivity.this, menu.class);
                    startActivity(intent);
                }
            }
        });

        // Boton CRUD
        Button CRUDButton = findViewById(R.id.btnCRUD);
        CRUDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, crud.class);
                startActivity(intent);
            }
        });
    }
}