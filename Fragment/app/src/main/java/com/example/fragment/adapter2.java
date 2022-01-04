package com.example.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.example.fragment.classes.phonemassege;

public class adapter2 {
       static helper helper;
       public adapter2(Context context){
              helper =new helper(context);
       }
       public long addentry(phonemassege2 entry){
SQLiteDatabase db= helper.getWritableDatabase();
               ContentValues  contentValues=new ContentValues();
               contentValues.put(adapter2.helper.phone,entry.getPhone());
               contentValues.put(adapter2.helper.mess,entry.getMassage());
               long id = db.insert(adapter2.helper.phone, null, contentValues);
return id;
       }
public phonemassege Reentry(){
               phonemassege entry=null;
        Cursor c;
        SQLiteDatabase db= adapter2.helper.getReadableDatabase();
String[] col={adapter2.helper.phone, adapter2.helper.mess};

        c=db.query(adapter2.helper.tname,col,null,null,null,null,null);
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
