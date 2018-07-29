package com.example.android.musicalStructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BluesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //create a list of artists and songs
        ArrayList<Music> music = new ArrayList<>();
        music.add(new Music("B.B. King", "Three O' Clock Blues", R.drawable.play));
        music.add(new Music("John Lee Hooker", "I'm In The Mood", R.drawable.play));
        music.add(new Music("Robert Johnson", "Sweet Home Chicago", R.drawable.play));
        music.add(new Music("Howlin' Wolf", "Back Door Man", R.drawable.play));
        music.add(new Music("Lightnin' Slim", "The Things I Use To Do", R.drawable.play));
        music.add(new Music("Muddy Waters", "Hoochie Coochie Man", R.drawable.play));
        music.add(new Music("T-Bone Walker", "Stormy Monday", R.drawable.play));
        music.add(new Music("Elmore James", "Dust My Broom", R.drawable.play));
        music.add(new Music("Big Bill Broonzy", "Key To The Highway", R.drawable.play));
        music.add(new Music("Little Walter", "Juke", R.drawable.play));

        // Create an {@link MusicAdapter}, whose data source is a list of {@link Music}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link MusicAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
