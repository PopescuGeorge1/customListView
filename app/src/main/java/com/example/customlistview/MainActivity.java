package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<laptop> products;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        products = new ArrayList<>();
        products.add(new laptop("lenovo","legion","good laptop"));
        products.add(new laptop("hp","X","ok laptop"));
        products.add(new laptop("Asus","Ryzen","gaming"));

        laptopAdapter adapter = new laptopAdapter(this, products);

        listView.setAdapter(adapter);

    }


}