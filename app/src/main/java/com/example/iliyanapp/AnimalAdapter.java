package com.example.iliyanapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnimalAdapter extends ArrayAdapter {
    ArrayList<Object> animalsList;

    public Context context;
    public LayoutInflater inflater;

    public AnimalAdapter(Context context, ArrayList<Object> animalsList) {
        super(context, R.layout.activity_main);

        this.context = context;
        this.animalsList = animalsList;

        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return animalsList.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return animalsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static class ViewHolder
    {
        ImageView imgViewLogo;
        TextView txtName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        ViewHolder holder;

        if(convertView == null)
        {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.items, null);

            holder.imgViewLogo = (ImageView) convertView.findViewById(R.id.imgViewLogo);
            holder.txtName = (TextView) convertView.findViewById(R.id.txtName);

            convertView.setTag(holder);
        }
        else
            holder=(ViewHolder)convertView.getTag();

        Animal bean = (Animal) animalsList.get(position);

        holder.imgViewLogo.setImageResource(bean.getImageId());
        holder.txtName.setText(bean.getTitle());

        return convertView;
    }
}
