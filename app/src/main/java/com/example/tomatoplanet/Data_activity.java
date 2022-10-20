package com.example.tomatoplanet;

import static com.example.tomatoplanet.R.layout.data_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Data_activity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.data_activity);
        ImageButton change_activity = (ImageButton) findViewById(R.id.imageButton5);
        change_activity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton5: change_activity(view);
        }
    }

    private void change_activity(View view) {
        Intent intent = new Intent(this,plan.class);
        startActivity(intent);
        this.finish();
    }
}
