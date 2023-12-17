package com.example.patternmvc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        // MVC -View -> Controller -> Model

        // Implementing the Pattern

    }

    public MyModel getAppFromModel(){
        return new MyModel("App Development",1000000, 4.7F);
    }

    @SuppressLint("SetTextI18n")
    public  void DisplayAppinText(View view){
    textView.setText(getAppFromModel().getAppName() + "Downloads "
            + getAppFromModel().getAppDownloads());
    }
}