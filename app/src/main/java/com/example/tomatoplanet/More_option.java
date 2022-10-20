package com.example.tomatoplanet;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;

public class More_option extends Dialog implements View.OnClickListener {
    public More_option(@NonNull Context context) {
        super(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_option);
    }
    public void onClick(View view) {

    }

}
