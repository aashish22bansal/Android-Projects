package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity
{
    // Initialising the value of quatity and priceOfCoffee
    int quantity = 0, priceOfCoffee=5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
    * This method is called when the order button is clicked.
    */
    public void submitOrder(View view){

        String priceMessage = "Item Count: " + quantity + "\nTotal: "+"$"+(quantity*priceOfCoffee)+"\nThank You!";
        displayMessage(priceMessage);
        //        display(quantity);
        //        displayPrice(quantity * priceOfCoffee);
    }

    /**
     * This is the increment method used to increase the value of quantity by 1.
     */
    public void increment(View view){
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This is the decrement method used to reduce the value of quantity by 1.
     */
    public void decrement(View view){
        quantity = quantity - 1;
        if(quantity<=0)
        {
            quantity = 0;
        }
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is used to display the text message along with the price displayed upon placing the order.
     */
    private void displayMessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}