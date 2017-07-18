package com.example.mohan.listapplication;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.ClipData;


class CustomAdapter extends ArrayAdapter<String>{

    public CustomAdapter(Context context, String [] List) {
        super(context,R.layout.custom_row, List);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater myInFlater = LayoutInflater.from(getContext());
        View CustomView = myInFlater.inflate(R.layout.custom_row, parent, false);

        String singlelistitem = getItem(position);
        TextView myText  =(TextView) CustomView.findViewById(R.id.myText);

        ImageView myImage = (ImageView) CustomView.findViewById(R.id.myimage);

        myText.setText(singlelistitem);
        myImage.setImageResource(R.drawable.img);
        return CustomView;

    }
}
