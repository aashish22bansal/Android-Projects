package com.example.android.firebasedemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Script;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    /**
     * Step 30: Create the Logout Button.
     * Step 31: Creating Data Members.
     * Step 32: Creating an instance of Data Members by linking it to the XML File.
     * @param savedInstanceState
     */
    private Button logout;

    /**
     * Step 37: Creating Data Members.
     * Step 38: Link the Data Members to the Instances.
     */
    private EditText edit; // step 37
    private Button add; // step 37

    /**
     * Step 44: Creating Data Member for ListView.
     * Step 45: Linking with the XML Component.
     * @param savedInstanceState
     */
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Step 32: Creating an instance of Data Members by linking it to the XML File.
         * Step 33: Add OnClickListener() to it.
         */
        logout = findViewById(R.id.logout); // step 32
        edit = findViewById(R.id.edit); // step 38

        /**
         * Step 38: Link the Data Members to the Instances.
         */
        add = findViewById(R.id.add); // step 38

        /**
         * Step 45: Link the listView data member with the XML Component.
         * Step 46: Because we are working with the ListView, so we will be using an ArrayList to store the data.
         */
        listView = findViewById(R.id.listview);


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

        /**
         * Step 36: Adding data to the database by creating an instance of the Firebase database. This will add a
         *          branch named aashish22bansal in the database which will have another branch named Android which
         *          will have the value set as "Aashish Bansal". This can be achieved through the following statement:
         *          FirebaseDatabase.getInstance().getReference().child("aashish22bansal").child("Android").setValue("Aashish Bansal");
         *
         *          Now, for our branch to have more than one child, we can use a HashMap. we can create a HashMap
         *          as shown below and then we can add it to the Firebase Database as well.
         *
         *          // step 36 - HashMap 1
         *         HashMap<String, Object> map = new HashMap<>();
         *         map.put("Name","Aashish Bansal");
         *         map.put("Email","aashish22bansal@gmail.com");
         *         FirebaseDatabase.getInstance().getReference().child("aashish22bansal").child("MultipleValues").updateChildren(map);
         *
         *         // step 36 - HashMap 2
         *         HashMap<String, Object> map = new HashMap<>();
         *         map.put("N1","Java");
         *         map.put("N2","Kotlin");
         *         map.put("N3","Flutter");
         *         map.put("N4","React Native");
         *         FirebaseDatabase.getInstance().getReference().child("Languages").updateChildren(map);
         */



        /**
         * Step 37: Taking input from the User and adding it to the Realtime Database. For this, we will add some buttons to the XML File and then we will add the componets in the java file
         * Step 38: Link the Data Members to the Instances.
         * Step 39: Add an OnClickListener().
         * Step 40: Extract the text from the user input.
         * Step 41: Check if the user has entered data or not.
         * Step 42: If data has been provided, then push the data to the database.
         * Step 54: Making sure that the values get added to the "Languages" branch so that the data can be added automatically. For
         *          this, we will change the Branch name in the SetOnClickListener() in step 42. We will change "MobileApplicationDevelopment"
         *          to "Languages". The previous statement of step 42 is commented.
         */
        add.setOnClickListener(new View.OnClickListener() { // step 39
            @Override
            public void onClick(View v) {
                String txt_name = edit.getText().toString(); // step 40
                if(txt_name.isEmpty()){ // step 41
                    Toast.makeText(MainActivity.this, "No Data entered!", Toast.LENGTH_SHORT).show();
                }
                else{
                    // step 42
                    //FirebaseDatabase.getInstance().getReference().child("MobileApplicationDevelopment").push().child("Name").setValue(txt_name);
                    //step 54
                    FirebaseDatabase.getInstance().getReference().child("Languages").push().setValue(txt_name);
                }
            }
        });

        /**
         * Step 43: Retrieving data from the database and show it as a ListView requires some changes in the design of the app,
         *          so we will make changes to the XML File.
         * Step 44: Create a data member for ListView.
         * Step 46: Because we are working with the ListView, so we will be using an ArrayList to store the data.
         * Step 47: We will also need an ArrayAdapter
         * Step 48: Add the adapter to the ListView.
         * Step 49: To access the database, we need a reference to the database. So, we will create a reference to the database.
         * Step 50: To access all the inner branches, we will use addValueEventListener() to the adapter. In this, the "snapshot"
         *          variable will store all the data which is present in the database and to iterate through each of the branches,
         *          we will use the foreach() loop.
         * Step 51: Clear the list before adding the elements to the list.
         * Step 52: Add elements to the list.
         * Step 53: After adding the elements has completed, we will notify the adapter.
         * Step 54: Making sure that the values get added to the "Languages" branch so that the data can be added automatically. For
         *          this, we will change the Branch name in the SetOnClickListener() in step 42. We will change "MobileApplicationDevelopment"
         *          to "Languages"
         */
        ArrayList<String> list = new ArrayList<>(); // step 46
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, list); // step 47
        listView.setAdapter(adapter); // step 48
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Languages"); //step 49
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear(); // step 51
                for(DataSnapshot dataSnapshot:snapshot.getChildren()){ // step 52
                    list.add(dataSnapshot.getValue().toString());
                }
                adapter.notifyDataSetChanged(); // step 53
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}