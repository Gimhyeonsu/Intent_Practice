package com.example.sast.intent_example_2017_04_09_a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IntentActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-9381-7276"));
        startActivity(intent);

    }
}
