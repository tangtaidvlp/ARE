package com.chinalwb.are.demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.chinalwb.are.AREditor;
import com.chinalwb.are.strategies.VideoStrategy;

import static com.chinalwb.are.demo.TextViewActivity.HTML_TEXT;

public class ARE_FullBottomActivity extends AppCompatActivity {

    private AREditor arEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_are__full_bottom);
        this.arEditor = this.findViewById(R.id.areditor);
        arEditor.getToolbar().setOnInsertImageButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ARE_FullBottomActivity.this, "Hello bros, my name is Tai", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
