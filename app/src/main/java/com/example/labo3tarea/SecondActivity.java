package com.example.labo3tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.labo3tarea.utilities.AppConstants;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextView, mTextView2, mTextView3, mTextView4;

    private String name, pass, email, gender;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.mTextView = findViewById(R.id.tv_nameG);
        this.mTextView2 = findViewById(R.id.tv_passG);
        this.mTextView3 = findViewById(R.id.tv_emailG);
        this.mTextView4 = findViewById(R.id.tv_generoG);
        this.mButton = findViewById(R.id.btn_share);

        Intent mIntent = getIntent();

        if(mIntent!=null){

            this.name = mIntent.getStringExtra(AppConstants.TEXT_NAME);
            this.pass = mIntent.getStringExtra(AppConstants.TEXT_PASS);
            this.email = mIntent.getStringExtra(AppConstants.TEXT_MAIL);
            this.gender = mIntent.getStringExtra(AppConstants.TEXT_GENDER);

            this.mTextView.setText(String.valueOf(this.name));
            this.mTextView2.setText(String.valueOf(this.pass));
            this.mTextView3.setText(String.valueOf(this.email));
            this.mTextView4.setText(String.valueOf(this.gender));

        }

        mButton.setOnClickListener(v->{
            Intent mIntentShare = new Intent();
            mIntentShare.setAction(Intent.ACTION_SEND);
            mIntentShare.setType("text/plain");
            mIntentShare.putExtra(Intent.EXTRA_TEXT,"Nombre: " + this.mTextView.getText().toString() + " " + "Contraseña: " + this.mTextView2.getText().toString()
                    + " " + "Email: " + this.mTextView3.getText().toString() + " " + "Genero: " + this.mTextView4.getText().toString());
            startActivity(mIntentShare);
        });



    }


}
