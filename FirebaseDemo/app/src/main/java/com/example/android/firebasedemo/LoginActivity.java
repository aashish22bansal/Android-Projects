package com.example.android.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    /**
     * Step 20: Create the Data Members
     * Step 21: Connect them to the XML File.
     * Step 22: Creating a Firebase Authentication Variable.
     * Step 23: Create instance of the Firebase Authentication Variable.
     * @param savedInstanceState
     */
    private EditText email;
    private EditText password;
    private Button login;

    private FirebaseAuth auth; // step 22

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Step 21: Connect them to the XML File.
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        // Step 23: Create instance of the Firebase Authentication Variable.
        auth = FirebaseAuth.getInstance();

        /**
         * Step 24: Creating an OnClickListener() for the button
         * Step 25: Extract the email and password.
         * Step 26: Pass the email and password as parameters to login method loginUser()
         */
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Step 25
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();
                // Step 26
                loginUser(txt_email, txt_password);
            }
        });
    }

    private void loginUser(String txt_email, String txt_password) {
        /**
         * Step 27: User the Firebase "auth" variable to sign-in to the application
         * Step 28: Add a success Listener which will veify whether we have logged-in or not.
         * Step 29: Go to MainActivity by starting the intent for the MainActivity
         */
        auth.signInWithEmailAndPassword(txt_email, txt_password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                // Step 29
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}