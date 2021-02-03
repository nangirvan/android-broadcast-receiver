package com.nangirvan.mybroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView bcData;
    private EditText inBcAction, inBcName;
    private Button btnRegister;

    private String TAG_MAIN = "MBC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bcData = findViewById(R.id.bcData);
        inBcAction = findViewById(R.id.inBcAction);
        inBcName = findViewById(R.id.inBcName);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(this::onClicks);
    }

    public void onClicks(View v) {
        switch(v.getId()) {
            case R.id.btnRegister:
                String strBcAction = inBcAction.getText().toString();
                String strBcName = inBcName.getText().toString();
                String strbcData = bcData.getText().toString();

                Log.i(TAG_MAIN, strBcAction);
                Log.i(TAG_MAIN, strBcName);
                Log.i(TAG_MAIN, strbcData);
        }
    }
}