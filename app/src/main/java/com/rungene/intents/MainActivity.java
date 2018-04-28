package com.rungene.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_cattwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_cattwo=findViewById(R.id.button_cattwo);



    }
    public void   openSecondCat(View view){

        //Toast.makeText(this, "Hi cat Two", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,ActivityTwo.class);
        startActivity(intent);

    }
}
