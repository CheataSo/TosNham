package com.example.ckcc.tosnham;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CKCC on 9/27/2018.
 */

public class RestuarantAdapter extends RecyclerView.Adapter<RestuarantAdapter.RestuarantViewHolder>
{
    //Create Array object of Restuarant
    Restuarant[] restuarants;
    //for loading xml or java file
    @Override
    public RestuarantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Create object LayoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        //Create object for load
        View viewholder = layoutInflater.inflate(R.layout.retuarant_view_holder_event,parent);
        RestuarantViewHolder restuarantViewHolder = new RestuarantViewHolder(viewholder);
        return restuarantViewHolder;
    }

    @Override
    public void onBindViewHolder(RestuarantViewHolder holder, int position)
    {
       /* Event event = data[position];
        holder.txtTitle.setText(event.getTitle());*/
       Restuarant restuarant= restuarants[position];
       holder.textView.setText(restuarant.getName());
    }

    @Override
    public int getItemCount() {

        return 10;
    }

    class RestuarantViewHolder extends RecyclerView.ViewHolder{

        //Create variable
        private ImageView imageView;
        private TextView textView;

        public RestuarantViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img_event);
            textView = itemView.findViewById(R.id.img_title);
        }
    }
}
