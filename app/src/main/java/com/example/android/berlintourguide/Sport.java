package com.example.android.berlintourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Sport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("Ice Hoky", "Adress: Reinickendorf", R.mipmap.icehokey));
        Words.add(new Word("Golf", "Adress: Spandau ", R.mipmap.golf));
        Words.add(new Word("Tennis", "Adress: Steglitz", R.mipmap.tennis));
        Words.add(new Word("jogging", "Adress: Tier Garten", R.mipmap.jogging));


        WordAdapter adapter = new WordAdapter(this, Words,R.color.category_sport);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);}}