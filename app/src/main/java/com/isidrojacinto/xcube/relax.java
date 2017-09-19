package com.isidrojacinto.xcube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class relax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax);
    }
    public void eat(View view){
        Intent intent = new Intent(this, eat.class);
        startActivity(intent);

    }
    public void play(View view){
        Intent intent = new Intent(this, play.class);
        startActivity(intent);

    }
}
