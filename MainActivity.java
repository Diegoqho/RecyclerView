package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String elementos[] = {};
    int avatar[] = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h};
    int imagenes[] = {};
    int i, img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        i = random.nextInt(500 - 100) + 100;
        elementos = new String[i];
        imagenes = new int[i];

        for (int x=0; x<i; x++){
            elementos[x] = "Elemento: " + x;
            img = random.nextInt(8);
            imagenes[x] = avatar[img];
        }

        recyclerView = findViewById(R.id.Recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Datos(this,elementos,imagenes));
    }

}