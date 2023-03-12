package ru.startandroid.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener {

    private TextView text;
    private Button ok;
    private Button cancel;

    private static final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Log.d(TAG, "MainActivity4: onCreate()");

        Log.d(TAG, "Найти информацию по id");
        text = findViewById(R.id.tvOut);
        ok = findViewById(R.id.btnOk);
        cancel = findViewById(R.id.btnCancel);

        Log.d(TAG, "Дать обработку кнопкам");
        ok.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "Распределение по условию нажатия кнопок");
        if (view.getId() == R.id.btnOk) {
            text.setText("Нажата кнопка ОК");
            Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_LONG).show();
        } else if (view.getId() == R.id.btnCancel) {
            text.setText("Нажата кнопка Cancel");
            Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity4: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity4: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity4: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity4: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity4: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity4: onDestroy()");
    }
}