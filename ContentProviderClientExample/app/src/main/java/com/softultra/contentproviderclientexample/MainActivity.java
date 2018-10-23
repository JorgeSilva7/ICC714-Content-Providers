package com.softultra.contentproviderclientexample;

import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView t;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Cursor cursor = getContentResolver().query(
      Uri.parse("content://com.softultra.contentproviderexample.ClientesProvider/clientes/1" ),
      null,
      null,
      null,
      null);

    t= (TextView) findViewById(R.id.texto);

    if(cursor.moveToFirst()){
      String data = cursor.getString(cursor.getColumnIndex("nombre"));
      t.setText(data);
    }
  }
}
