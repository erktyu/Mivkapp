package com.example.android.miwokapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, List<Word> objects) {
        super(context,0,objects);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWordObj= getItem(position);

        TextView textView1= (TextView) listItemView.findViewById(R.id.miwok_text_view);
        textView1.setText(currentWordObj.getMiwokTranslation());

        TextView textView2= (TextView) listItemView.findViewById(R.id.default_text_view);
        textView2.setText(currentWordObj.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if (currentWordObj.isThereImage()) {
            imageView.setImageResource(currentWordObj.getmResouce());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}
