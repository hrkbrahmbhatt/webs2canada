package com.example.hrsikeshbrahmbhatt.webs2canada;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by hrsikeshbrahmbhatt on 2017-10-09.
 */

public class DetailActivity extends AppCompatActivity {

    TextView DevPos, DevNam;
    ImageView imageView;


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        imageView = (ImageView) findViewById(R.id.thumbnail_image_header);
        DevNam = (TextView) findViewById(R.id.devNam);

        DevPos = (TextView) findViewById(R.id.devRole);

        String devName = getIntent().getExtras().getString("devName");
        String devPos = getIntent().getExtras().getString("devRole");
        String thumbnail = getIntent().getExtras().getString("thumbnail");


        DevNam.setText(devName);
        DevPos.setText(devPos);
        Glide.with(this)
                .load(thumbnail)
                .placeholder(R.drawable.load)
                .into(imageView);


    }
}
