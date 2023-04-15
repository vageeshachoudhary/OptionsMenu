package com.example.optionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_settings)
        {
            textView.setText("Settings was selected");
            Toast.makeText(this, "Settings", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == R.id.one)
        {
            textView.setText("One was selected");
            Toast.makeText(this, "One", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == R.id.two)
        {
            textView.setText("Two was selected");
            Toast.makeText(this, "Two", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == R.id.discard)
        {
            textView.setText("Delete was selected");
            Toast.makeText(this, "Delete", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == R.id.search)
        {
            textView.setText("Search was selected");
            Toast.makeText(this, "Search", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == R.id.ActivityOne)
        {
            Intent intent = new Intent(this,Activity1.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.ActivityTwo)
        {
            Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);
        }
        else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }
}