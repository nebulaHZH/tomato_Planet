package com.example.tomatoplanet;
import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ListView;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.dynamicanimation.animation.SpringAnimation;

import java.lang.reflect.Array;

public class Add_plan extends Dialog implements View.OnClickListener{
    private String plan_name;
    private int plan_min;

    public Add_plan(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user_dialog);
        EditText add_name = (EditText) findViewById(R.id.editTextText_name);
        EditText add_time = (EditText) findViewById(R.id.editTextText_time);
        ImageButton button_true = (ImageButton) findViewById(R.id.imageButton);
        button_true.setOnClickListener(this);
        ImageButton button_false = (ImageButton) findViewById(R.id.imageButton7);
        button_false.setOnClickListener(this);
        add_name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                plan_name = editable.toString();
            }
        });
        add_time.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                plan_min = Integer.parseInt(editable.toString());
            }
        });


    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton: close_true();break;
            case R.id.imageButton7: close_false();break;
        }
    }

    private void close_false() {
        this.dismiss();
    }
    private void close_true() {
        this.dismiss();
    }
}