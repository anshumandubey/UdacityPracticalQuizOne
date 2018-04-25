package com.example.abhayansh.udacitypracticalquizone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText SendName,SendEmail,SendInfo;
    Button NextButton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NextButton = (Button)findViewById(R.id.button_send);
        SendName = (EditText)findViewById(R.id.username_text);
        SendEmail = (EditText)findViewById(R.id.email_text);
        SendInfo = (EditText)findViewById(R.id.about_yourself);

        NextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                intent = new Intent(getApplicationContext(),DetailActivity.class);
                intent.putExtra("Name", SendName.getText().toString());
                intent.putExtra("Email",SendEmail.getText().toString());
                intent.putExtra("Info",SendInfo.getText().toString());
                startActivity(intent);

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu m) {
        super.onCreateOptionsMenu(m);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.menu.menu){
            intent = new Intent(getApplicationContext(),DetailActivity.class);
            intent.putExtra("Name", SendName.getText().toString());
            intent.putExtra("Email",SendEmail.getText().toString());
            intent.putExtra("Info",SendInfo.getText().toString());
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
