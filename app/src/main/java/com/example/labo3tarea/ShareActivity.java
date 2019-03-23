package com.example.labo3tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3tarea.utilities.AppConstants;

public class ShareActivity extends AppCompatActivity {

    private TextView mTextView;

    private String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        this.mTextView = findViewById(R.id.tv_info);
;

        Intent mIntent = getIntent();

        if(mIntent!=null){

            this.mTextView.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));

        }

    }
}
