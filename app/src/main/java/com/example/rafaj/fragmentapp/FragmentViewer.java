package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView planetName, description;
    ImageView planetImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        //define la vista respectiva al componente
        planetName = view.findViewById(R.id.txt_title);
        planetImage = view.findViewById(R.id.img_planet);
        description = view.findViewById(R.id.txt_description);
        Bundle bundle = this.getArguments();
        BasicInformation planetInfo;

        if(bundle != null){
            planetInfo = bundle.getParcelable("KEY"); //identifica el bundle que contiene el objeto
            Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();

            //coloca la info guardada en el objeto y la coloca en el view respectivo
            planetName.setText(planetInfo.getTitle());
            planetImage.setImageResource(planetInfo.getImage());
            description.setText(planetInfo.getDescription());

        }

        return view;
    }


}
