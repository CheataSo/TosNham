package com.example.ckcc.tosnham;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by CKCC on 9/27/2018.
 */

public class DbManager extends SQLiteOpenHelper
{
    //Db schema
    public DbManager(Context context) {
        super(context,"mydb",null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Create event table
        String sql = "create table tblEvent(id integer primary key autoincrement,"
                +"title text, date text, imageUrl text, location text)";
        sqLiteDatabase.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    //Data Manipulation
    public Event[] getAllEvents()
    {
        //get Database object
        SQLiteDatabase db = getReadableDatabase();

        //Selecting data
        Cursor cursor = db.query("tblEvent",null,null,null,null,null,"id Desc");
        Event[] events = new Event[cursor.getCount()];
        int index = 0;

        while (cursor.moveToNext())
        {
            int id = cursor.getInt(0);
            String title = cursor.getString(1);
            String iamgeUrl = cursor.getString(2);
            String date = cursor.getString(3);
            String location = cursor.getString(4);

            Event event = new Event(id, title, iamgeUrl, date, location);
            events[index] = event;
            index++;
        }
        //free up cursor
        cursor.close();
        return events;
    }
    public  void insertTemporaryData()
    {
        SQLiteDatabase db = getWritableDatabase();
        for(int i=0; i<10; i++)
        {
            db.execSQL("insert into tblEvent(title, imageUrl,date,location"
                        +"('Event '"+i+"','', '14 april', 'CKCC')");
        }
    }
}
