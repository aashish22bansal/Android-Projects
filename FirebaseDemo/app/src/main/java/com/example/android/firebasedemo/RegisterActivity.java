package com.example.android.firebasedemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    /**
     * STEP 5: Create the Register and the Login Activities.
     * STEP 6: Creating Data Members
     * STEP 7: Link the Buttons to the XML File.
     * Step 14: Create a Firebase Authentication Variable.
     * Step 15: Initialize the Firebase Authentication Variable.
     * @param savedInstanceState
     */
    private EditText email;
    private EditText password;
    private Button register;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        /**
         * STEP 7: Linking the Data Members with the XML File.
         * STEP 8: Add the Register Library to the Project. (NO CODE)
         * STEP 9: Set OnClickListener() for the Button.
         * Step 15: Initializing the Firebase Authentication Variable.
         * Step 16: Register the User in the registerUser() Method.
         */
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        register = findViewById(R.id.register);
        auth = FirebaseAuth.getInstance(); // step 15

        /**
         * STEP 9: Setting up OnClickListener() for the Button.
         * Step 10: Obtain the Text from the EditTexts.
         * Step 11: Check if any of the above values are empty or not.
         * Step 12: Checking if the number of characters match the requirement.
         * Step 13: Create a Method to Register the User and send the email & password.
         * Step 14: Create a Firebase Authentication Variable.
         * Step 15: Initialize the Firebase Authentication Variable.
         * Step 16: Registering the user in the registerUser() Method.
         * Step 17: Notifying the user for the completion of the registration.
         * Step 18: Checking if the task was successful or not.
         * Step 19: Whenever a user is logged-in, then we want the user to be redirected to the MainActivity.java
         */
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Step 10: Obtain the Text from the EditTexts.
                String txt_email = email.getText().toString();
                String txt_password = password.getText().toString();

                // Step 11: Check if any of the above values are empty or not. This is done with the help of TextUtils. (The 'if' part)
                // Step 12: Checking if the number of characters match the requirement for email and password. (The 'else' part)
                if(TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){ // Step 11
                    Toast.makeText(RegisterActivity.this, "Empty field!",Toast.LENGTH_SHORT).show();
                }
                else if(txt_password.length()<6){ // Step 12
                    Toast.makeText(RegisterActivity.this, "Password is too short!",Toast.LENGTH_SHORT).show();
                }
                else{ // Step 13
                    registerUser(txt_email,txt_password);
                }
            }
        });
    }

    private void registerUser(String txt_email, String txt_password) {
        // Step 16: Registering the user
        // Step 17: Notifying the user for the completion of the registration.
        auth.createUserWithEmailAndPassword(txt_email, txt_password).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                // Step 18: Checking if the task was successful or not.
                if(task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                    /** Step 19: Whenever a user is logged-in, then we want the user to be redirected to the MainActivity.java
                     * This can be done by creating a new intent.
                     */
                    startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                    finish();
                }
                else{
                    Toast.makeText(RegisterActivity.this, "Registration Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}