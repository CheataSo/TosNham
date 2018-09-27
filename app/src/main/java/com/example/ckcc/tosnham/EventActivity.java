package com.example.ckcc.tosnham;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by CKCC on 9/25/2018.
 */

public class EventActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restuarant_event_activity);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        //Layout Manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        EventAdapter eventAdapter = new EventAdapter();

        //
        DbManager dbManager = new DbManager(this);
        dbManager.insertTemporaryData();

        Event[] events = dbManager.getAllEvents();
        //  String[] data = new String[]{"Event 1","Event 2","Event 3"};
        eventAdapter.setData(events);
        recyclerView.setAdapter(eventAdapter);
        /*
        Event event1 = new Event();
        event1.setTitle("Event1");
        event1.setDate("11 December 2018");

        Event event2 = new Event();
        event2.setTitle("Event2");
        event2.setDate("11 December 2018");

        Event event3 = new Event();
        event3.setTitle("Event3");
        event3.setDate("11 December 2018");

        Event[] events = new Event[3];
        events[0]= event1;
        events[1]= event2;
        events[2]= event3;

        eventAdapter.setData(events);

        recyclerView.setAdapter(eventAdapter);
    }
    public void onChangeDataButtonClick(View view)
    {
        String[] data = new  String[]{"Event 1","Event 2", "Event 3"};

    }*/

    }
}
