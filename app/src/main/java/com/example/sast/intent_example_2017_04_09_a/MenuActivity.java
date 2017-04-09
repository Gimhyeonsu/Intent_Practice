package com.example.sast.intent_example_2017_04_09_a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (intent != null) {
            String title = intent.getStringExtra("title");
            Toast.makeText(getApplicationContext(),
                    "전달받은 값 :" + title,
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();
        intent.putExtra("name", "태연");
        setResult(RESULT_OK, intent);

        finish();

    }
}
