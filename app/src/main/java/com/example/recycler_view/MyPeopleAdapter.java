package com.example.recycler_view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import model.Persona;

public class MyPeopleAdapter extends RecyclerView.Adapter <PeopleViewHolder>{

    private ArrayList<Persona> personList;

    /**
     * Constructor of the adapter class
     * @param personList
     */
    public MyPeopleAdapter(ArrayList<Persona> personList) {
        this.personList = personList;
    }


    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.people_custom_layout, viewGroup, false);

        PeopleViewHolder peopleViewHolder = new PeopleViewHolder(contactView);

        return peopleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder viewHolder, int i) {

        Persona personaTmp = personList.get(i);

        TextView nameTv = viewHolder.name;
        nameTv.setText(personaTmp.getNombre());

        TextView heightTv = viewHolder.height;
        heightTv.setText(personaTmp.getHeight());

        TextView genderTv = viewHolder.gender;
        genderTv.setText(personaTmp.getGender());

        TextView hairColorTv = viewHolder.hair_color;
        hairColorTv.setText(personaTmp.getHair_color());

        TextView skinColorTv = viewHolder.skin_color;
        skinColorTv.setText(personaTmp.getSkin_color());

        TextView eyeColorTv = viewHolder.eye_color;
        eyeColorTv.setText(personaTmp.getEye_color());

        TextView birthYearTv = viewHolder.birth_year;
        birthYearTv.setText(personaTmp.getBirth_year());

        TextView massTv = viewHolder.mass;
        massTv.setText(personaTmp.getMass());

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}


