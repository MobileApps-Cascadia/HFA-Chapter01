package com.hfad.myfirstapp;

import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: Uncomment these lines and explain what happens when run
        myText = findViewById(R.id.helloText);
    }

    public void ChangeText(View view) {
        myText.setText("Hello from the Java Code");
    }
}
