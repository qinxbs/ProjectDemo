package com.gs.myceshi;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DataBaseActivity extends AppCompatActivity {
    EditText editText;
    Calendar calendar = Calendar.getInstance();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database);
        onCreteData();
//        initCalendar();
    }

    private void initCalendar() {
        //日历数据源
        ArrayList<Date> alist = new ArrayList<>();
        Calendar newcalendar = (Calendar) calendar.clone();
        newcalendar.set(Calendar.DAY_OF_MONTH, 1);
        int index = newcalendar.get(Calendar.DAY_OF_WEEK);//1号在本周前还有几天
        newcalendar.add(Calendar.DAY_OF_MONTH, -index);
        while (alist.size() <= 6*7) {
            alist.add(newcalendar.getTime());
            newcalendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        for (Date date : alist) {
             Log.e("tag",dateFormat.format(date));
        }
    }


    public void onCreteData() {
        editText = findViewById(R.id.ed_data);
        //create
        findViewById(R.id.btn_create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySqliteDataHelper helper = new MySqliteDataHelper(getApplicationContext(), "user_db", null, 1);
                helper.getReadableDatabase();//调用这个类的方法getWritableDatabase()或者 getReadableDatabase()方法的时候，如果当时没有数据，那么Android系统就会自动生成一个数据库。
//              helper.getWritableDatabase();
            }
        });

        //update db verion
        findViewById(R.id.btn_update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySqliteDataHelper helper_update = new MySqliteDataHelper(getApplicationContext(), "user_db", null, 2);
                helper_update.getReadableDatabase();
            }
        });

        //insert
        findViewById(R.id.btn_insert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySqliteDataHelper helper_insert = new MySqliteDataHelper(getApplicationContext(), "user_db", null, 1);
                SQLiteDatabase sqLiteDatabase = helper_insert.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
//                contentValues.put("id", 1);
                contentValues.put("name", editText.getText().toString());
                contentValues.put("age", 91);
                sqLiteDatabase.insert("user", null, contentValues);
                sqLiteDatabase.close();
            }
        });

        //query
        findViewById(R.id.btn_query).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySqliteDataHelper helper_insert = new MySqliteDataHelper(getApplicationContext(), "user_db", null, 1);
                SQLiteDatabase sqLiteDatabase = helper_insert.getReadableDatabase();
                Cursor cursor = sqLiteDatabase.query("user", new String[]{"id", "name", "age"}, null, null, null, null, null);
                while (cursor.moveToNext()) {
                    String name = cursor.getString(cursor.getColumnIndex("name"));
                    String age = cursor.getString(cursor.getColumnIndex("age"));
                    Log.e("Tag", "name:" + name + "         age:" + age);
                }
                sqLiteDatabase.close();
            }
        });
        //update
        findViewById(R.id.btn_updateDATE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", "2");
                contentValues.put("name", "Name");
                contentValues.put("age", "20");
                MySqliteDataHelper helper_insert = new MySqliteDataHelper(getApplicationContext(), "user_db", null, 1);
                SQLiteDatabase sqlite_update = helper_insert.getWritableDatabase();
                sqlite_update.update("user", contentValues, "id=?", new String[]{"1"});
                sqlite_update.close();
            }
        });
        //clear
        findViewById(R.id.btn_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySqliteDataHelper helper_insert = new MySqliteDataHelper(getApplicationContext(), "user_db", null, 1);
                SQLiteDatabase sqlite_update = helper_insert.getWritableDatabase();
                sqlite_update.execSQL("drop table user");//删除表
                sqlite_update.close();
//                sqlite_update.execSQL("delete from user");//清空表数据
            }
        });
    }
}
