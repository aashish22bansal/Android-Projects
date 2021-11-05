package com.example.android.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1, spinner2;
    EditText editText1;
    Button button1;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.txtAmount);
        spinner1 = findViewById(R.id.spFrom);
        spinner2 = findViewById(R.id.spTo);
        button1 = findViewById(R.id.btn1);
        result = (TextView) findViewById(R.id.displayAmount);

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
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 74.28;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 199.75;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 6.46;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.86;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.74;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 1.27;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "USD") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 72.84;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // INR Conversions
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 1.0;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.013;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 2.69;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 0.087;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.012;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.0100;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 0.017;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Indian Ruppee") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 0.98;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Sri Lankan Ruppee Conversions
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 1.0;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.0050;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 0.37;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 0.032;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.0043;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.0037;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 0.0064;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Sri Lankan Ruppee") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 0.36;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Chinese Yuan
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 1.0;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 11.49;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 30.92;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.15;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.13;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.11;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 0.20;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Chinese Yuan") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 11.29;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Euro Conversions
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 1.0;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 86.65;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 233.32;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 7.6141;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 1.17;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.86;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 1.48;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Euro") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 85.06;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Pound Sterling Conversions
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 1.0;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 100.39;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 270.34;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 8.74;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 1.16;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 1.35;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 1.72;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Pound Sterling") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 98.56;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Canadian Dollar
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 1.0;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 58.52;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 157.57;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 5.10;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.68;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.58;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.79;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Canadian Dollar") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 57.44;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                // Russian Ruble
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Russian Ruble")){
                    Total = Amount * 1.02;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Indian Ruppee")){
                    Total = Amount * 1.02;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Sri Lankan Ruppee")){
                    Total = Amount * 2.74;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Chinese Yuan")){
                    Total = Amount * 0.089;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Euro")){
                    Total = Amount * 0.012;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Pound Sterling")){
                    Total = Amount * 0.010;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "Canadian Dollar")){
                    Total = Amount * 0.017;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
                else if((spinner1.getSelectedItem().toString() == "Russian Ruble") && (spinner2.getSelectedItem().toString() == "USD")){
                    Total = Amount * 0.014;
                    result.setText(Double.toString(Total));
                    Toast.makeText(getApplicationContext(), Total.toString(), Toast.LENGTH_LONG).show();
                }
            } // end onClick()
        });
    }
}