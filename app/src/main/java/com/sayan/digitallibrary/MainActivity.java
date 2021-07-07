package com.sayan.digitallibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    public static AppCompatActivity mainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = this;

        Button bookButton = findViewById(R.id.book_button);
        Button newspaperButton = findViewById(R.id.newspaper_button);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bookButton.setOnClickListener(v -> openBookActivity());

        newspaperButton.setOnClickListener(v -> openNewspaperActivity());
    }


    private void openBookActivity() {
        Intent bookIntent = new Intent(this, BookActivity.class);
        startActivity(bookIntent);
    }

    private void openNewspaperActivity() {
        Intent newspaperIntent = new Intent(this, NewspaperActivity.class);
        startActivity(newspaperIntent);
    }

    private void openCreditDialog() {
        CreditDialog creditDialog = new CreditDialog();
        creditDialog.show(getSupportFragmentManager(), "Credit Dialog");
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
//                Toast.makeText(MainActivity.this, "Credits Selected",Toast.LENGTH_SHORT).show();
                openCreditDialog();
                break;
            case R.id.mnu_exit:
//                Toast.makeText(MainActivity.this, "EXIT Selected",Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return true;
    }

}