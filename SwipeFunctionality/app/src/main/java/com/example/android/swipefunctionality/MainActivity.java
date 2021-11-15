package com.example.android.swipefunctionality;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Initializing Variables
    RelativeLayout relativeLayout;
    TextView textView;

    // Create a Swipe List
    SwipeListener swipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Linking the variables to the XML File
        relativeLayout = findViewById(R.id.relative_layout);
        textView = findViewById(R.id.text_view);

        // Initialize Swipe Listener
        swipeListener = new SwipeListener(relativeLayout);
    }

    private class SwipeListener implements View.OnTouchListener {
        /**
         * Called when a touch event is dispatched to a view. This allows listeners to
         * get a chance to respond before the target view.
         *
         * @param v     The view the touch event has been dispatched to.
         * @param event The MotionEvent object containing full information about
         *              the event.
         * @return True if the listener has consumed the event, false otherwise.
         */

        // Initialize variables
        GestureDetector gestureDetector;

        // Create Constructor
        SwipeListener(View view){
            // Initialize the Threshold Value
            int threshold = 100;
            int velocity_threshold = 100;

            // Initialize simple gesture listener
            GestureDetector.SimpleOnGestureListener listener = new GestureDetector.SimpleOnGestureListener(){
                @Override
                public boolean onDown(MotionEvent e) {
                    // Pass true value
                    return true;
                }

                @Override
                public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                    // Get the x and y difference
                    float xDifference = e2.getX() - e1.getX();
                    float yDifference = e2.getY() - e1.getY();
                    try{
                        // Checking condition
                        if(Math.abs(xDifference) > Math.abs(yDifference)){
                            // when x is greater than y, then check:
                            if(Math.abs(xDifference) > threshold && Math.abs(velocityX)>velocity_threshold){
                                // when xDifference is greater than threshold and when velocityX is greater than velocity_threshold, then check:
                                if(xDifference>0){
                                    // when xDifference is greater than 0, then swipe RIGHT
                                    textView.setText("Swiped Right");
                                }
                                else{
                                    // when xDifference is less than 0, then swipe LEFT
                                    textView.setText("Swiped Left");
                                }
                                return true;
                            } // End condition when xDifference is greater than threshold and when velocityX is greater than velocity_threshold
                        } // End condition when x is greater than y
                        else{
                            // when y is greater than x, then check:
                            if(Math.abs(yDifference) > threshold && Math.abs(velocityY)>velocity_threshold){
                                // when yDifference is greater than threshold and when velocityY is greater than velocity_threshold, then check:
                                if(yDifference>0){
                                    // when yDifference is greater than 0, then swipe DOWN
                                    textView.setText("Swiped Down");
                                }
                                else{
                                    // when yDifference is less than 0, then swipe UP
                                    textView.setText("Swiped Up");
                                }
                                return true;
                            } // End condition when yDifference is greater than threshold and when velocityY is greater than velocity_threshold
                        }// End else for if x is greater than y
                    }// End try
                    catch (Exception e){
                        e.printStackTrace();
                    }// End catch()
                    return false;
                }
            };
            // Initialize gesture detector
            gestureDetector = new GestureDetector(listener);
            // Set listener on view
            view.setOnTouchListener(this);
        }

        @Override
        public boolean onTouch(View v, MotionEvent motionEvent) {
            // Return gesture event
            return gestureDetector.onTouchEvent(motionEvent);
        }
    }
}