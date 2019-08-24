package br.edu.ifsp.scl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "CDV";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Executou on Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "Executou onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Executou onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Executou onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "Executou onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Executou onStop");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        EditText editText = findViewById(R.id.et);
        outState.putString("texto", editText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String texto = savedInstanceState.getString("texto");
        EditText editText = findViewById(R.id.et);
        editText.setText(texto);
    }

}
