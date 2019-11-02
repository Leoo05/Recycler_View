package com.example.recycler_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import model.Persona;
import providers.People;

public class MainActivity extends AppCompatActivity {

    private RecyclerView bandsRecyclerView;
    private RecyclerView.Adapter myBandAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Persona> personList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //READ BANDS LIST
        fillDataSetOfPeople ();


        setContentView(R.layout.activity_main);
        bandsRecyclerView= findViewById(R.id.RecyclerView_People);
        layoutManager = new LinearLayoutManager(this);
        bandsRecyclerView.setLayoutManager(layoutManager);
        myBandAdapter = new MyPeopleAdapter(personList);
        bandsRecyclerView.setAdapter(myBandAdapter);

    }


    public void fillDataSetOfPeople () {
        People readerOfInfo = new People();
        personList = readerOfInfo.callWebService();
    }
}
