package com.example.progettobo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int mCount =0;
    private TextView mShowCounnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // all'avvio dell'app
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        super.onCreate(savedInstanceState);
        mShowCounnt = findViewById(R.id.show_Count);
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCounnt!=null){
            mShowCounnt.setText(Integer.toString(mCount));
        }


    }

    public void countDown(View view) {
        mCount--;
        if(mShowCounnt!=null){
            mShowCounnt.setText(Integer.toString(mCount));
        }
    }
}