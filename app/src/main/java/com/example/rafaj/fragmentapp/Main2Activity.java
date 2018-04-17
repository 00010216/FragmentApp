package com.example.rafaj.fragmentapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView planetName, description;
    ImageView planetImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //define la vista respectiva al componente
        planetName = findViewById(R.id.txt_title);
        planetImage = findViewById(R.id.img_planet);
        description = findViewById(R.id.txt_description);
        Bundle bundle = getIntent().getExtras();
        BasicInformation planetInfo;

        if(bundle != null){
            planetInfo = bundle.getParcelable("KEY"); //identifica el bundle que contiene el objeto
            //Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();

            //coloca la info guardada en el objeto y la coloca en el view respectivo
            planetName.setText(planetInfo.getTitle());
            planetImage.setImageResource(planetInfo.getImage());
            description.setText(planetInfo.getDescription());

        }
    }

}
