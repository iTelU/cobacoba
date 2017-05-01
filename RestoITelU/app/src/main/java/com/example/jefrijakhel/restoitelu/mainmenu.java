package com.example.jefrijakhel.restoitelu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.LinkedList;

import Beans.Restaurant;

public class mainmenu extends AppCompatActivity {

    ListView lvRestaurant;
    LinkedList<Restaurant> restaurants = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        // data dummy

        Restaurant a = new Restaurant(1, "Sederhana", "Enak", R.drawable.makanan);
        Restaurant b = new Restaurant(2, "Lamun Ombak", "Enak", R.drawable.rendang);
        Restaurant c = new Restaurant(3, "Talago", "Enak", R.drawable.sop);

        this.restaurants.add(a);
        this.restaurants.add(b);
        this.restaurants.add(c);

        ListRestaurantAdapter listRestaurantAdapter = new ListRestaurantAdapter(this, this.restaurants);
        this.lvRestaurant = (ListView) findViewById(R.id.lvListRestaurant);
        this.lvRestaurant.setAdapter(listRestaurantAdapter);

        this.lvRestaurant.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // do something if item got clicked .. use @int position param to detect the clicked item

            }
        });

    }

}
