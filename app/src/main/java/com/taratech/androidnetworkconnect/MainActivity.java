package com.taratech.androidnetworkconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View v){
        String tag = (String) v.getTag();

        switch(tag){
            case "1":
                startActivity(new Intent(this,FirstExampleActivity.class));
                break;
            default: break;
        }
    }

}
