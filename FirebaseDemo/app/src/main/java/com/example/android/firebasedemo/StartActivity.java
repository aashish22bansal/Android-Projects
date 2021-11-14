package com.example.android.firebasedemo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StartActivity extends AppCompatActivity {

    //private AppBarConfiguration appBarConfiguration;
    //private ActivityMainBinding binding;

    /** STEP 1: Creating Data Members
     * STEP 2: Link them to the XML File
     */
    private Button register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        /**
         * STEP 2: Linking the Button in Java to the XML File
         * STEP 3: Create two new Activities: RegisterActivity and LoginActivity
         * STEP 4: On clicking a button, we want the respective activity to open. So, we will add the onClickListener() for them.
         */
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);

        /**
         * STEP 4: On clicking a button, we want the respective activity to open. So, we will add the onClickListener() for them.
         * STEP 5: Create the Register and the Login Activities.
         *
         * Also, when we get into this activity, we do not want the user to get to the previous activity again.
         */
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, RegisterActivity.class));
                // After the execution of the below statement, the user will not be able to get back to the previous activity.
                finish();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this, LoginActivity.class));
                // After the execution of the below statement, the user will not be able to get back to the previous activity.
                finish();
            }
        });
        /*
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
         */
    } // end of onCreate()

    /**
     * This method will solve the problem of logging in again and again.
     * Using this, we will not need to log into the application again and again.
     */
    @Override
    protected void onStart(){
        super.onStart();

        // Creating instance of Firebase
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        // Check if user is null
        if(user != null){
            startActivity(new Intent(StartActivity.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
        }
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
     */
}