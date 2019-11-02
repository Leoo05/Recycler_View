package com.example.recycler_view;

import android.support.v7.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;

public class PeopleViewHolder extends RecyclerView.ViewHolder   {

    public TextView name;
    public TextView height;
    public TextView gender;
    public TextView mass;
    public TextView hair_color;
    public TextView skin_color;
    public TextView eye_color;
    public TextView birth_year;

    public PeopleViewHolder(View view) {
        super(view);
        this.name = (TextView) itemView.findViewById(R.id.peopleName);;
        this.height = (TextView) itemView.findViewById(R.id.peopleHeight);
        this.gender = (TextView) itemView.findViewById(R.id.peopleGender);
        this.hair_color = (TextView) itemView.findViewById(R.id.peopleHairColor);
        this.skin_color = (TextView) itemView.findViewById(R.id.peopleSkinColor);
        this.eye_color = (TextView) itemView.findViewById(R.id.peopleEyeColor);
        this.birth_year = (TextView) itemView.findViewById(R.id.peopleBirthYear);
        this.mass = (TextView) itemView.findViewById(R.id.peopleMass);

    }

}
