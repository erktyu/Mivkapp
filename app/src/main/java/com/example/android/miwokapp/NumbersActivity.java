package com.example.android.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(0));
//        wordView.setPadding(16, 16, 0, 0);
//        rootView.addView(wordView);
        ArrayList<TextView> textViewArrayList= new ArrayList<TextView>();
        for(int i=0;i<words.size(); i++) {
            TextView newTextView = new TextView(this);
            textViewArrayList.add(newTextView);
            textViewArrayList.get(i).setText(words.get(i));
            rootView.addView(textViewArrayList.get(i));
        }

        /*
        normalde for loop su sekilde de yazilabilir fakat sonra gelir refere edilemio
        for(int i=0;i<words.size(); i++) {
            TextView newTextView = new TextView(this);
            newTextView.setText(words.get(i));
            rootView.addView(newTextView);
        }
        */

    }
}
