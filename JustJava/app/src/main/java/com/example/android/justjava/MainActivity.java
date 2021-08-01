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
    // Initialising the value of quantity and priceOfCoffee
    int quantity = 0, priceOfCoffee=5;
    String customerName="Aashish Bansal";

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
        displayMessage(createOrderSummary());
    }

    /**
     * Calculates the price of the order.
     *
     * @param quantity is the number of cups of coffee ordered.
     * @param priceOfCoffee is the cost of the one coffee.
     * @return total cost of the number of coffee cups ordered.
     */
    private int calculatePrice(int quantity, int priceOfCoffee) {
        int price = quantity * priceOfCoffee;
        return price;
    }

    /**
     * This is the increment method used to increase the value of quantity by 1.
     */
    public void increment(View view){
        quantity = quantity + 1;
        displayQuantity(quantity);
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
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     *
     * @param number is the value to be displayed on the screen.
     */
    private void displayQuantity(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     *
     * @param number is the value to be displayed on the screen.
     */
    private void displayPrice(int number){
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is used to display the text message along with the price displayed upon placing the order.
     *
     * @param message is the message which will be displayed on the screen along with the other information.
     */
    private void displayMessage(String message){
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    private String createOrderSummary(){
        String priceMessage = "Name: " + customerName + "\nQuantity: " + quantity + "\nTotal: " + "$" + calculatePrice(quantity,priceOfCoffee) + "\nThank You!";
        return priceMessage;
    }
}