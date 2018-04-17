package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView title, description;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        title = findViewById(R.id.txt_title);
        description = findViewById(R.id.txt_description);
        img1 = findViewById(R.id.img_planet);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();

        if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);
            }
        }

    }

    private void handleReceivedText(Intent intent){
        Bundle bundle1 = intent.getExtras();

        if (title != null){
            title.setText(bundle1.getString("KEY"));
        }

        if (description != null){
            description.setText(bundle1.getString("KEY1"));
        }

        if (img1 != null){
            img1.setImageResource(bundle1.getInt("KEY2"));
        }


    }
}
