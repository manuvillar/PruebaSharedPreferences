package com.example.pruebasharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.pruebasharedpreferences.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.idBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences =
                        getSharedPreferences("misPreferencias",
                                Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("texto",binding.idEditTexto.getText().toString());
                editor.putInt("numero",
                        Integer.parseInt(binding.idEditNumero.getText().toString()));
                editor.commit();

                startActivity(new Intent(
                        v.getContext(), SegundoActivity.class));
            }
        });
    }
}