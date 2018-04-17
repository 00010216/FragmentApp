package com.example.rafaj.fragmentapp;

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
        Bundle bundle = getIntent().getExtras();
        BasicInformation planetInfo;

        if(bundle != null){
            planetInfo = bundle.getParcelable("KEY");
            title.setText(planetInfo.getTitle());
            img1.setImageResource(planetInfo.getImage());
            description.setText(planetInfo.getDescription());
        }
    }

}
