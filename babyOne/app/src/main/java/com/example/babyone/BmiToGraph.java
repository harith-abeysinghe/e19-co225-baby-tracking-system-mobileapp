package com.example.babyone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BmiToGraph extends AppCompatActivity {

    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_to_graph);

        btnback = findViewById(R.id.btnBack);

        /*ACTION WHICH OCCURS WHEN THE BACK BUTTON IS CLICKED*/
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an instance of the profileFragment
                profileFragment fragment = new profileFragment();

                // Get the FragmentManager
                FragmentManager fragmentManager = getSupportFragmentManager();

                // Begin the fragment transaction
                FragmentTransaction transaction = fragmentManager.beginTransaction();

                // Replace the current fragment with the profileFragment
                transaction.replace(R.id.profileFragment, fragment);

                // Add the transaction to the back stack (optional)
                transaction.addToBackStack(null);

                // Commit the transaction
                transaction.commit();

            }
        });
    }




}