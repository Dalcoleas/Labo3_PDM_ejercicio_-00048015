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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.action_bt_send);
        mEditText = findViewById(R.id.et_name);
        mEditText1 = findViewById(R.id.et_last_name);
        mEditText2 = findViewById(R.id.et_email);

        mRadioGroup = findViewById(R.id.rg_selection);

        mButton.setOnClickListener(v->{
            String name = mEditText.getText().toString();
            String lastName = mEditText1.getText().toString();
            String email = mEditText2.getText().toString();
            int selectedId = mRadioGroup.getCheckedRadioButtonId();

            mRadioButton = findViewById(selectedId);

            String gender = mRadioButton.getText().toString();

            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            mIntent.putExtra(AppConstants.TEXT_NAME, name);
            mIntent.putExtra(AppConstants.TEXT_LAST_NAME,lastName);
            mIntent.putExtra(AppConstants.TEXT_MAIL, email);
            mIntent.putExtra(AppConstants.TEXT_GENDER,gender);
            startActivity(mIntent);

        });


    }
}
