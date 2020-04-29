package com.example.iliyanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lview3;
    AnimalAdapter adapter;
    private ArrayList<Object> animalList;
    private Animal bean;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareArrayLits();
        lview3 = (ListView) findViewById(R.id.listView1);
        adapter = new AnimalAdapter(this, animalList);
        lview3.setAdapter(adapter);

        //lview3.setOnItemClickListener((AdapterView.OnItemClickListener) this);
    }

    /* Method used to prepare the ArrayList,
     * Same way, you can also do looping and adding object into the ArrayList.
     */
    public void prepareArrayLits()
    {
        animalList = new ArrayList<Object>();

        AddObjectToList(R.drawable.images, "Example 1");
        AddObjectToList(R.drawable.images, "Example 2");
        AddObjectToList(R.drawable.images, "Example 3");
    }

    // Add one item into the Array List
    public void AddObjectToList(int image, String title)
    {
        bean = new Animal();
        bean.setImageId(image);
        bean.setTitle(title);
        animalList.add(bean);
    }
}
