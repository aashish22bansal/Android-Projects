package com.example.android.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1, spinner2;
    EditText editText1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.txtAmount);
        spinner1 = findViewById(R.id.spFrom);
        spinner2 = findViewById(R.id.spTo);
        button1 = findViewById(R.id.btn1);

        // Loading a Spinner
        // Step 1 - Loading a String Array
        String[] from = {"USD", "Indian Ruppee", "Sri Lankan Ruppee", "Chinese Yuan", "Euro", "Pound Sterling", "Canadian Dollar"};
        ArrayAdapter arrayAdapterFrom = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,from);
        spinner1.setAdapter(arrayAdapterFrom);

        String[] to = {"USD", "Indian Ruppee", "Sri Lankan Ruppee", "Chinese Yuan", "Euro", "Pound Sterling", "Canadian Dollar"};
        ArrayAdapter arrayAdapterTo = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,to);
        spinner2.setAdapter(arrayAdapterTo);

        // Step 2 - Validation Part
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double Total;
                Double Amount = Double.parseDouble(editText1.getText().toString());
                // USD Conversions
                if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 1.0;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 74.28;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 199.75;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 6.46;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.86;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.74;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 1.27;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 72.84;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // INR Conversions
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 1.0;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.013;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 2.69;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 0.087;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.012;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.0100;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 0.017;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 0.98;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Sri Lankan Ruppee Conversions
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 1.0;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.0050;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 0.37;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 0.032;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.0043;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.0037;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 0.0064;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 0.36;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Chinese Yuan
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 1.0;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 11.49;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 30.92;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.15;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.13;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.11;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 0.20;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 11.29;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Euro Conversions
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 1.0;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 86.65;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 233.32;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 7.6141;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 1.17;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.86;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 1.48;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 85.06;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Pound Sterling Conversions
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 1.0;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 100.39;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 270.34;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 8.74;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 1.16;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 1.35;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 1.72;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 98.56;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Canadian Dollar
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 1.0;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 58.52;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 157.57;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 5.10;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.68;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.58;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.79;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 57.44;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Russian Ruble
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 1.02;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 1.02;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 2.74;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 0.089;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.012;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.010;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 0.017;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.014;
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}