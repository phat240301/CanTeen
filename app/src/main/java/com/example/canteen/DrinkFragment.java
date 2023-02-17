package com.example.canteen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class DrinkFragment extends Fragment {

    ListView ListDrink;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_drink, container,false);

        ListDrink = root.findViewById(R.id.ListDrink);
        ArrayList<Drink> arr = new ArrayList<>();
        while (arr.size()<10){
            arr.add(new Drink());
        }
        DrinkAdapter adapter = new DrinkAdapter(getActivity(), 0, arr);
        ListDrink.setAdapter(adapter);
        return root;
    }
}