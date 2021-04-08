package com.example.locproviderlist;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity {
    TextView mTextView;
    LocationManager lm;
    List<String> locProvList;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.txtOutput);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lm = (LocationManager) getSystemService(LOCATION_SERVICE);

                locProvList = lm.getAllProviders();


                mTextView.append("(# Strings: " + locProvList.size() + ")\n\n");
                for(String string : locProvList){
                    mTextView.append("String Loc.Provider: " + string.getBytes() + "\n");
                    mTextView.append("String status: " + string.getBytes() + "\n\n");

                }

            }
        });


    }
}