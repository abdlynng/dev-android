package sn.edu.uadb.dbconnexion;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StudentDBHelper dbHelper = new StudentDBHelper(this.getApplicationContext());
        SQLiteDatabase  db= dbHelper.getWritableDatabase();
    }
}
