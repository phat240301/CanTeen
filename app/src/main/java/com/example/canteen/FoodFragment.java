package com.example.canteen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    ListView ListFood;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceSate){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_food, container,false);

        ListFood = root.findViewById(R.id.ListFood);
        ArrayList<Food> arr = new ArrayList<>();
        while (arr.size()<10){
            arr.add(new Food());
        }
        FoodAdapter adapter = new FoodAdapter(getActivity(), 0, arr);
        ListFood.setAdapter(adapter);
        return root;
    }
}