package com.example.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillInMeme();
    }

    private void fillInMeme() {
        DtoMeme dtoMeme1 = new DtoMeme();

        dtoMeme1.setImageMeme(R.drawable.meme1);
        dtoMeme1.setDescription("Pensa Jogador");
        dtoMeme1.setDateCreating("2020");

        DtoMeme dtoMeme2 = new DtoMeme();

        dtoMeme2.setImageMeme(R.drawable.meme2);
        dtoMeme2.setDescription("Tropa do Vixi");
        dtoMeme2.setDateCreating("2021");

        DtoMeme dtoMeme3 = new DtoMeme();

        dtoMeme3.setImageMeme(R.drawable.meme3);
        dtoMeme3.setDescription("Lá ele mil vez");
        dtoMeme3.setDateCreating("2022");


        ArrayList<DtoMeme> memeArrayList = new ArrayList<>();
        memeArrayList.add(dtoMeme1);
        memeArrayList.add(dtoMeme2);
        memeArrayList.add(dtoMeme3);


        CustomListAdapter adapter = new CustomListAdapter(MainActivity.this, memeArrayList);

        ListView listView = findViewById(R.id.listViewMeme);
        listView.setAdapter(adapter);
    }

}