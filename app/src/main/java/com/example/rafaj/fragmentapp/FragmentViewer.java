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

        planetName = view.findViewById(R.id.txt_title);
        planetImage = view.findViewById(R.id.img_planet);
        Bundle bundle = this.getArguments();


        if(bundle != null){
            Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();

            planetName.setText(bundle.getString("KEY"));
            planetImage.setText(bundle.getString("KEY1"));

        }

        return view;
    }


}
