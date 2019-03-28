package com.rtstudio.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSegundaAct = findViewById(R.id.button);

        btnSegundaAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), SegundaActivity.class);
                intent.putExtra("msg", "Estamos da segunda tela com informação passada pela primeira tela");
                startActivity(intent);
            }
        });
    }
}
