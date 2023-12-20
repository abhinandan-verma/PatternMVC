package com.example.patternmvc.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.patternmvc.R;
import com.example.patternmvc.util.MyModel;

public class MainActivity extends AppCompatActivity implements AppView{

    Button btn;
    TextView textView;
    //Linking Activity with Presenter
    Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        // MVC -View -> Controller -> Model
        // Implementing the Pattern
        // Instantiating the Presenter
        presenter = new Presenter(this);

        btn.setOnClickListener(v -> {
            // Calling presenter to get the data from DB
            // No linkage between Activity & Model
            presenter.getAppFromMode();
        });
    }

    public MyModel getAppFromModel(){
        return new MyModel("App Development ",1000000, 4.7F);
    }

    @SuppressLint("SetTextI18n")
    public  void DisplayAppinText(View view){
    textView.setText(getAppFromModel().getAppName() + "Downloads "
            + getAppFromModel().getAppDownloads());
    }

    @Override
    public void onGetAppName(String str) {

    }
}