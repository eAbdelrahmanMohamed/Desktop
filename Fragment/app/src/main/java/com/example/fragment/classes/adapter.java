package com.example.fragment.classes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class adapter {
       static helper helper;
       public adapter(Context context){
              helper =new helper(context);
       }
       public long addentry(phonemassege entry){
SQLiteDatabase db= helper.getWritableDatabase();
               ContentValues  contentValues=new ContentValues();
               contentValues.put(adapter.helper.phone,entry.getPhone());
               contentValues.put(adapter.helper.mess,entry.getMassage());
               long id = db.insert(adapter.helper.phone, null, contentValues);
return id;
       }
public phonemassege Reentry(){
               phonemassege entry=null;
        Cursor c;
        SQLiteDatabase db= com.example.fragment.classes.adapter.helper.getReadableDatabase();
String[] col={com.example.fragment.classes.adapter.helper.phone, com.example.fragment.classes.adapter.helper.mess};

        c=db.query(com.example.fragment.classes.adapter.helper.tname,col,null,null,null,null,null);
while (c.moveToNext()){
        entry=new phonemassege(c.getString(0),c.getString(1));
}
        return entry;
}
    static class helper extends SQLiteOpenHelper{
private static final String dbname="mpdb";
        private static final String tname="mpt";
        private static final String idname="id";
        private static final int dbveresion=1;
        public static final String mess="message";
        public static final String phone="phone";
        private static final String stat="CREATE TABLE "+tname+"("
        +idname+"INTEGER PRIMARY KEY AUTOINCREMENT ,"+phone+"TEXT ,"+mess+"TEXT);";

                public helper(@Nullable Context context) {
            super(context, dbname, null, dbveresion);
        }

            
            @Override
        public void onCreate(SQLiteDatabase db) {
db.execSQL(stat);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("DROP TABLE IF EXISTSmpt"+tname);
onCreate(db);
        }
    }
}
