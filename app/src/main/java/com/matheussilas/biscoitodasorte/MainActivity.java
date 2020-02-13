package com.matheussilas.biscoitodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public TextView txtPhrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPhrase = findViewById(R.id.txtPhrase);

    }

    Phrase phrase = new Phrase();

    public void newPhrase(View view) {
        String phraseText = phrase.newPhrase();
        txtPhrase.setText(phraseText);
    }

    public void sharedButton(View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, txtPhrase.getText().toString());
        intent.setType("text/plain");
        startActivity(intent.createChooser(intent, "Compartilhar"));

    }
}