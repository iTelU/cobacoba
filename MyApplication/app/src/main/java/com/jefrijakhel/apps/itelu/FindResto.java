package com.jefrijakhel.apps.itelu;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class FindResto extends AppCompatActivity {

    ImageView imageViewResto,imageViewMapss;
    TextView titleResto, textViewDesk, textViewDesk1, textViewDesk2, textViewDesk3, titleRating;
    Button buttonMenu;
    RatingBar ratingBarResto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_resto);

        imageViewResto = (ImageView)findViewById(R.id.imageViewResto);
        imageViewMapss = (ImageView)findViewById(R.id.imageViewMapss);
        titleResto= (TextView)findViewById(R.id.titleResto);
        titleRating= (TextView)findViewById(R.id.titleRating);
        textViewDesk= (TextView)findViewById(R.id.textViewDesk);
        textViewDesk1= (TextView)findViewById(R.id.textViewDesk1);
        textViewDesk2= (TextView)findViewById(R.id.textViewDesk2);
        textViewDesk3= (TextView)findViewById(R.id.textViewDesk3);
        buttonMenu = (Button)findViewById(R.id.buttonMenu);
        ratingBarResto = (RatingBar)findViewById(R.id.ratingBarResto);

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = FindResto.this;
                String message = "Aplikasi Belum Selesai";
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
