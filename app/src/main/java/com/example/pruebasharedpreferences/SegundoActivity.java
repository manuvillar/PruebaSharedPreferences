package com.example.pruebasharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.pruebasharedpreferences.databinding.ActivityMainBinding;
import com.example.pruebasharedpreferences.databinding.ActivitySegundoBinding;

public class SegundoActivity extends AppCompatActivity {
    private ActivitySegundoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySegundoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SharedPreferences sharedPreferences =
                getSharedPreferences("misPreferencias", Context.MODE_PRIVATE);

        binding.idTextViewTexto.setText(sharedPreferences.getString("texto", ""));
        binding.idTextViewNumero.setText(sharedPreferences.getInt("numero", 0));
    }
}