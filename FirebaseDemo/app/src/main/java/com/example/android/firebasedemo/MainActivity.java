package com.example.android.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    /**
     * Step 30: Create the Logout Button.
     * Step 31: Creating Data Members.
     * Step 32: Creating an instance of Data Members by linking it to the XML File.
     * @param savedInstanceState
     */
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Step 32: Creating an instance of Data Members by linking it to the XML File.
         * Step 33: Add OnClickListener() to it.
         */
        logout = findViewById(R.id.logout);

        /**
         * Step 33: Creating OnClickListener() for the Button.
         * Step 34: Logging out with the help of Firebase.
         * Step 35: Return to Start Activity.
         */
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut(); // step 34
                Toast.makeText(MainActivity.this, "Logout Successful!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, StartActivity.class)); // step 35
            }
        });
    }
}