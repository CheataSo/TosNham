package com.example.ckcc.tosnham;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CKCC on 9/25/2018.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder>{

    private Event[] data;

    public void setData(Event[] data) {
        this.data = data;
        notifyDataSetChanged();
    }

    /* public void setData(String[] data)
    {
        this.data = data;
        //for refreshing adapter it relates to getItemCount() method
        notifyDataSetChanged();
    }*/
    /*for three methods execute
        1-adapter will call method getItemCount()
        2- adapter will call  function EventViewHolder()*/

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View viewholderlayout = layoutInflater.inflate(R.layout.retuarant_view_holder_event,parent);
        EventViewHolder viewHolder = new EventViewHolder((viewholderlayout));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position)
    {
       // String title = data[position];
       // holder.txtTitle.setText(title);

        Event event = data[position];
        holder.txtTitle.setText(event.getTitle());

    }

    @Override
    public int getItemCount()
    {
        if ((data == null))//? 0 : data.length;
        {
            return 0;
        }
        else {
            return data.length;
        }
    }

    class EventViewHolder extends RecyclerView.ViewHolder
    {
    private ImageView imageView;
    private TextView txtTitle;
        public EventViewHolder(View itemView)
        {
            super(itemView);

           imageView = itemView.findViewById(R.id.img_event);
           txtTitle= itemView.findViewById(R.id.img_title);

        }
    }
}
