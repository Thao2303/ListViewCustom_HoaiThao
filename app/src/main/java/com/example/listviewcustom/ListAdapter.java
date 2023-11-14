package com.example.listviewcustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends ArrayAdapter<SmartPhone> {
    public ListAdapter(Context context, int textViewResourceId){
        super(context,textViewResourceId);
    }
    public ListAdapter(Context context, int resource,List<SmartPhone> items){
        super(context,resource,items);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View view =convertView;
        if(view==null){
            LayoutInflater inflater=LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.activity_customlistview,null);

        }
        SmartPhone p =getItem(position);
        if(p!=null){
            TextView txtName =(TextView) view.findViewById(R.id.textViewtitle);
            txtName.setText(p.title);
            TextView txtDescription=(TextView) view.findViewById(R.id.textViewDescription);
            txtDescription.setText(p.description);
            TextView txtPrice=(TextView) view.findViewById(R.id.textViewPrice);
            txtPrice.setText("Giá: " + p.price +".000 VND");
           ImageView imageView=view.findViewById(R.id.imageView2);
           Picasso.with(getContext()).load(p.thumbnail).into(imageView);
        }
        return view;
    }
}


