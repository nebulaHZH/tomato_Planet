package com.example.tomatoplanet;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

public class Frame extends Dialog {
    public Frame(Context context) {
        super(context);
    }
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.frame_1);
    }
}
