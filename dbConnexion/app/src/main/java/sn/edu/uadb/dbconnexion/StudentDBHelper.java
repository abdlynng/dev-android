package sn.edu.uadb.dbconnexion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class StudentDBHelper extends SQLiteOpenHelper {

    private static String DBNAME ="student1.db";
    private static int DBVERSION=1;

    public StudentDBHelper( Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table  student1(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //

    }
    public void onOpen(SQLiteDatabase db){

        super.onOpen(db);
    }

}
