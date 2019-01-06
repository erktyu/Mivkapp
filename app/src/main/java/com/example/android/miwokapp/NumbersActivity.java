package com.example.android.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("one", "lutti",R.mipmap.ic_launcher_round));
        words.add(new Word("two", "otiiko",R.mipmap.ic_launcher_round));
        words.add(new Word("three", "tolookosu",R.mipmap.ic_launcher_round));
        words.add(new Word("four", "oyyisa",R.mipmap.ic_launcher_round));
        words.add(new Word("five", "massokka",R.mipmap.ic_launcher_round));
        words.add(new Word("six", "temmoskka",R.mipmap.ic_launcher_round));
        words.add(new Word("seven", "kenekaku",R.mipmap.ic_launcher_round));
        words.add(new Word("eight", "kawinta",R.mipmap.ic_launcher_round));
        words.add(new Word("nine", "wo'e",R.mipmap.ic_launcher_round));
        words.add(new Word("ten", "na'aacha",R.mipmap.ic_launcher_round));



        WordAdapter itemAdapter = new WordAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(itemAdapter);

//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(0));
//        rootView.addView(wordView);

        //only a command added just to be able to commit and tell that there is an extrabrach that will
        //be left back in future

    }
}
