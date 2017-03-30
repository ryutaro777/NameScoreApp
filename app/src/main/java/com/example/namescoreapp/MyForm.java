package com.example.namescoreapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MyForm extends AppCompatActivity {

    public final static String EXTRA_MYNAME ="com.example.namescoreapp.MYNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_form);
    }

    public void getScore(View view){
        EditText myEditText = (EditText) findViewById(R.id.myEditText);
        String myName = myEditText.getText().toString().trim();
        if (myName.equals("")){
            myEditText.setError("Please enter your name!");

        }  else {
            Intent intent = new Intent(this, MyResult.class);
            intent.putExtra(EXTRA_MYNAME, myName);
            startActivity(intent);
        }
    }
}
