package com.sayan.digitallibrary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void openCreditDialog() {
        CreditDialog creditDialog = new CreditDialog();
        creditDialog.show(getSupportFragmentManager(), "Credit Dialog");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnu_credit:
//                Toast.makeText(this, "Credits Selected",Toast.LENGTH_SHORT).show();
                openCreditDialog();
                break;
            case R.id.mnu_exit:
                finish();
                MainActivity.mainActivity.finish();
                break;
        }
        return true;
    }
}