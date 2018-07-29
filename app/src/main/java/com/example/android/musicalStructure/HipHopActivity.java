package com.example.android.musicalStructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //create a list of artists and songs
        ArrayList<Music> music = new ArrayList<>();
        music.add(new Music("Busta Rhymes", "Pass The Courvoisier", R.drawable.play));
        music.add(new Music("Big Boi", "Lookin' 4 Ya", R.drawable.play));
        music.add(new Music("TI", "Big himgs Poppin", R.drawable.play));
        music.add(new Music("Junior Mafia", "Get Money", R.drawable.play));
        music.add(new Music("Terror Squad", "Lean Back", R.drawable.play));
        music.add(new Music("Timbaland", "The Way I Are", R.drawable.play));
        music.add(new Music("Chingy", "Right Thurr", R.drawable.play));
        music.add(new Music("Missy Elliott", "Work It", R.drawable.play));
        music.add(new Music("Ludacris", "Stand Up", R.drawable.play));
        music.add(new Music("Black Eyed Peas", "I Gotta Feeling", R.drawable.play));

        // Create an {@link MusicAdapter}, whose data source is a list of {@link music}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
