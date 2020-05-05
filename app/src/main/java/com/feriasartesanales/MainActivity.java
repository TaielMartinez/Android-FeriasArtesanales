package com.feriasartesanales;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = 0;

    }

    public void count_sum(View view){
        count++;
        count_text();
    }

    public void count_res(View view){
        count--;
        count_text();
    }
    public void count_reset(View view){
        count = 0;
        count_text();
    }

    public void count_text(){
        TextView count_text=(TextView)findViewById(R.id.text_num);
        count_text.setText("" + count);

    }

}
