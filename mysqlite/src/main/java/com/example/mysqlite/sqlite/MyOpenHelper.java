package com.example.mysqlite.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class MyOpenHelper extends SQLiteOpenHelper {

    private static final String TAG = "cj";
    private static final String CREATE_BOOK_TABLE = "create table book(" +
            "id integer primary key autoincrement," +
            "author text," +
            "price real," +
            "pages integer," +
            "name text" +
            ")";
    private Context context;

    public MyOpenHelper(Context context,int version) {
        super(context, "BookStore.db", null, version);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BOOK_TABLE);
        Toast.makeText(context, "建表成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        Log.e(TAG, "onUpgrade: " );
        Toast.makeText(context, "onUpgrade", Toast.LENGTH_SHORT).show();

    }
}
