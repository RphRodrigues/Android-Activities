package com.rtstudio.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textView = findViewById(R.id.msgPassadaId);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            textView.setText(bundle.getString("msg"));
        }
    }
}
