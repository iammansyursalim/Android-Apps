package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtTextFirstName;
    EditText edtTextLastName;
    EditText edtTextEmail;

    TextView textViewFirstName,textViewLastName, textViewEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTextFirstName = findViewById(R.id.firstname);
        edtTextLastName = findViewById(R.id.LastName);
        edtTextEmail = findViewById(R.id.Email);

        textViewFirstName = findViewById(R.id.ViewFirstName);
        textViewLastName = findViewById(R.id.ViewLastName);
        textViewEmail = findViewById(R.id.ViewEmail);
    }

    public void onRegister ( View view) {
        textViewFirstName.setText("First Name " + edtTextFirstName.getText().toString());
        textViewLastName.setText("Last Name " + edtTextLastName.getText().toString());
        textViewEmail.setText("Email " + edtTextEmail.getText().toString());
    }

}
