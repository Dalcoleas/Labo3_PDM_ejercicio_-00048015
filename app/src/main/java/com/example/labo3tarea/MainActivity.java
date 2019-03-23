package com.example.labo3tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.labo3tarea.utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mButton;

    private EditText mEditText, mEditText1, mEditText2;

    private RadioButton mRadioButton;

    private RadioGroup mRadioGroup;

    private String name, pass, email, gender;

    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mButton = findViewById(R.id.action_bt_send);
        this.mEditText = findViewById(R.id.et_name);
        this.mEditText1 = findViewById(R.id.et_pass);
        this.mEditText2 = findViewById(R.id.et_email);

        this.mRadioGroup = findViewById(R.id.rg_selection);

        mButton.setOnClickListener(v->{
            this.name = this.mEditText.getText().toString();
            this.pass = this.mEditText1.getText().toString();
            this.email = this.mEditText2.getText().toString();

            this.id = this.mRadioGroup.getCheckedRadioButtonId();

            this.mRadioButton = findViewById(this.id);

            this.gender = this.mRadioButton.getText().toString();

            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstants.TEXT_NAME, name);
            mIntent.putExtra(AppConstants.TEXT_PASS,pass);
            mIntent.putExtra(AppConstants.TEXT_MAIL, email);
            mIntent.putExtra(AppConstants.TEXT_GENDER,gender);
            startActivity(mIntent);

        });


    }
}
