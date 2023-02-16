package com.example.canteen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends ArrayAdapter<Food> {
    private Context context;
    private ArrayList<Food> array;

    public FoodAdapter(@NonNull Context context, int resource,@NonNull List<Food> objects) {
        super(context, resource, objects);
        this.context = context;
        this.array = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_fragment_food, null);
        }
        if (array.size() > 0 ){
            Food f = array.get(position);
        }
        return convertView;
    }
}
