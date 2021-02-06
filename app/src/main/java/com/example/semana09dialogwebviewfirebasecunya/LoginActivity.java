package com.example.semana09dialogwebviewfirebasecunya;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    Button btnIngresar;
    EditText etcorreo , etclave;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnIngresar = findViewById(R.id.button2);
        etcorreo = findViewById(R.id.etcorreo);
        etclave= findViewById(R.id.etpass);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String correo =  etcorreo.getText().toString();
                String clave = etclave.getText().toString();

                mAuth.getInstance().signInWithEmailAndPassword(correo , clave).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){

                            Toast.makeText(LoginActivity.this ,"Autenticacion correcta" ,Toast.LENGTH_SHORT) .show();

                            Intent intent = new Intent(LoginActivity.this , MainActivity.class);
              startActivity(intent);

                        }else{


                            Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();


                        }

                    }
                });








            }
        });




    }
}