package com.sayan.digitallibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bookButton;
    private Button newspaperButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookButton = findViewById(R.id.book_button);
        newspaperButton = findViewById(R.id.newspaper_button);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBookActivity();
            }
        });

        newspaperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewspaperActivity();
            }
        });
    }


    private void openBookActivity() {
        Intent bookIntent = new Intent(this, BookActivity.class);
        startActivity(bookIntent);
    }

    private void openNewspaperActivity() {
        Intent newspaperIntent = new Intent(this, NewspaperActivity.class);
        startActivity(newspaperIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnu_credit:
                Toast.makeText(this, "Credits Selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnu_exit:
                Toast.makeText(this, "EXIT Selected",Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return true;
    }

}