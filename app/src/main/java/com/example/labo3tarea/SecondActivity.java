package com.example.labo3tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3tarea.utilities.AppConstants;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextView, mTextView2, mTextView3, mTextView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mTextView = findViewById(R.id.tv_nameG);
        mTextView2 = findViewById(R.id.tv_last_nameG);
        mTextView3 = findViewById(R.id.tv_emailG);
        mTextView4 = findViewById(R.id.tv_generoG);

        Intent mIntent = getIntent();

        String name = mIntent.getStringExtra(AppConstants.TEXT_NAME);
        String lastName = mIntent.getStringExtra(AppConstants.TEXT_LAST_NAME);
        String email = mIntent.getStringExtra(AppConstants.TEXT_MAIL);
        String gender = mIntent.getStringExtra(AppConstants.TEXT_GENDER);

        mTextView.setText(String.valueOf(name));
        mTextView2.setText(String.valueOf(lastName));
        mTextView3.setText(String.valueOf(email));
        mTextView4.setText(String.valueOf(gender));
    }
}
