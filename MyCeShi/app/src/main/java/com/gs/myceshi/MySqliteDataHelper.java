package com.gs.myceshi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySqliteDataHelper extends SQLiteOpenHelper{
    public MySqliteDataHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       String sql="create table user(id integer primary key autoincrement,name varchar(20),age int)";
       db.execSQL(sql);
       Log.e("Tag","创建了数据库----");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");
        onCreate(db);
        Log.e("Tag","更新了数据库=====");
    }
}
