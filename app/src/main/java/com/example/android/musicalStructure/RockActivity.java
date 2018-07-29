package com.example.android.musicalStructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //create a list of artists and songs
        ArrayList<Music> music = new ArrayList<>();
        music.add(new Music("Deep Purple", "Smoke On The Water", R.drawable.play));
        music.add(new Music("Led Zeppelin", "Stairway To Heaven", R.drawable.play));
        music.add(new Music("Queen", "Bohemian Rhapsody", R.drawable.play));
        music.add(new Music("Guns N Roses", "November Rain", R.drawable.play));
        music.add(new Music("Eagles", "Hotel California", R.drawable.play));
        music.add(new Music("Metallica", "One", R.drawable.play));
        music.add(new Music("Bruce Springsteen", "Born In The USA", R.drawable.play));
        music.add(new Music("Dire Straits", "Sultans Of Swing", R.drawable.play));
        music.add(new Music("Jimi Hendrix", "Hey Joe", R.drawable.play));
        music.add(new Music("Dio", "Holy Diver", R.drawable.play));

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
