package com.example.jefrijakhel.restoitelu;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

import Beans.Restaurant;

/**
 * Created by Jefri Jakhel on 25/04/2017.
 */

public class ListRestaurantAdapter  extends ArrayAdapter{

    private final Activity context;
    private LinkedList<Restaurant> restaurants;

    public ListRestaurantAdapter(Activity context,LinkedList<Restaurant> restaurants) {
        super(context,R.layout.layout_list_restaurant);
        this.context = context;
        this.restaurants = restaurants;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.layout_list_restaurant, null,true);

        TextView tvNamaRestaurant = (TextView) rowView.findViewById(R.id.tvNamaRestaurant);
        ImageView ivLogoRestaurant = (ImageView) rowView.findViewById(R.id.ivLogoRestaurant);
        TextView tvDeskripsiRestaurant = (TextView) rowView.findViewById(R.id.tvDeskripsiRestaurant);
        tvNamaRestaurant.setText(restaurants.get(position).getName());
        // set image resource harus pakai int .. kalau mau ganti jadi url cari tau cara nya kwkwkw
        ivLogoRestaurant.setImageResource(restaurants.get(position).getImageUrl());
        tvDeskripsiRestaurant.setText(restaurants.get(position).getDescription());
        return rowView;
    };

}
