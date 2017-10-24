package com.example.jonmid.basededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListarActivity extends AppCompatActivity {

    TextView textViewName;
    TextView textViewPhone;
    TextView textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);


        textViewName = (TextView) findViewById(R.id.nombre);
        textViewPhone = (TextView) findViewById(R.id.telefono);
        textViewEmail = (TextView) findViewById(R.id.email);

        textViewName.setText(getIntent().getExtras().getString("Nombre"));
        textViewPhone.setText(getIntent().getExtras().getString("Telefono"));
        textViewEmail.setText(getIntent().getExtras().getString("Email"));

    }
}
