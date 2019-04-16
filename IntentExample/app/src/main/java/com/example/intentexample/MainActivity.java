package com.example.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClick(View view){
        Intent intent=new Intent();
        editText=findViewById(R.id.et);
        intent.setAction("android.intent.action.VIEW");
        String url=editText.getText().toString();
        intent.putExtra("address",url);
        startActivity(intent);

    }
}
