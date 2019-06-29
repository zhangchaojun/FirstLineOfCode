package com.example.mysqlite.ui;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mysqlite.R;
import com.example.mysqlite.sqlite.MyOpenHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyOpenHelper myOpenHelper = new MyOpenHelper(this,1);
        SQLiteDatabase database = myOpenHelper.getWritableDatabase();//没有就会创建数据库，有的话就不会创建了。


    }
}
