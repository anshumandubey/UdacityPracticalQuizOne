package com.example.abhayansh.udacitypracticalquizone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView receiveName,receiveEmail,receiveInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        receiveName = (TextView)findViewById(R.id.name_view);
        receiveEmail = (TextView)findViewById(R.id.email_view);
        receiveInfo = (TextView)findViewById(R.id.info_view);

        receiveName.setText(getIntent().getStringExtra("Name"));
        receiveEmail.setText(getIntent().getStringExtra("Email"));
        receiveInfo.setText(getIntent().getStringExtra("Info"));
    }
}
