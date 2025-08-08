package com.example.activity_life_cycle;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Toast Tost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Toast toast1=Toast.makeText(getApplication(),"onCreate called",Toast.LENGTH_LONG);
        toast1.show();
    }
    protected void onStart(){
        super.onStart();
        Toast toast1=Toast.makeText(getApplication(),"onStart called",Toast.LENGTH_LONG);
        toast1.show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast toast1=Toast.makeText(getApplication(),"onRestart called",Toast.LENGTH_LONG);
        toast1.show();
    }
    protected void onPause(){
        super.onPause();
        Toast toast1=Toast.makeText(getApplication(),"onPause called",Toast.LENGTH_LONG);
        toast1.show();
    }
    protected void onResume(){
        super.onResume();
        Toast toast1=Toast.makeText(getApplication(),"onPause called",Toast.LENGTH_LONG);
        toast1.show();
    }
    protected void onStop(){
        super.onStop();
        Toast toast1=Toast.makeText(getApplication(),"onPause called",Toast.LENGTH_LONG);
        toast1.show();
    }
    protected void onDestroy(){
        super.onDestroy();
        Toast toast1=Toast.makeText(getApplication(),"onPause called",Toast.LENGTH_LONG);
        toast1.show();
    }

}