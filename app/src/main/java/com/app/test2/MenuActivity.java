package com.app.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button Main,Chat,Individual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Main = (Button)findViewById(R.id.Main);
        Chat = (Button)findViewById(R.id.Chat);
        Individual = (Button)findViewById(R.id.Individual);

        //메인업무
        Main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainWorkActivity.class);
            }
        });
        //채팅
        Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivity.class);
            }
        });
        //개인업무
        Individual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(IndividualActivity.class);
            }
        });



    }

    private void startActivity(Class c){
        Intent intent = new Intent(getApplicationContext(),c);
        startActivity(intent);
    }
}
