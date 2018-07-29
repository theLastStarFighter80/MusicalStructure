package com.example.android.musicalStructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //create a list of artists and songs
        ArrayList<Music> music = new ArrayList<>();
        music.add(new Music("Pharrell Williams", "Happy", R.drawable.play));
        music.add(new Music("David Guetta", "Flames", R.drawable.play));
        music.add(new Music("Enrique Iglesias", "Move To Miami", R.drawable.play));
        music.add(new Music("Cardi B", "I Like It", R.drawable.play));
        music.add(new Music("Calvin Harris", "One Kiss", R.drawable.play));
        music.add(new Music("Marshmello", "Friends", R.drawable.play));
        music.add(new Music("Drake", "Nice For What", R.drawable.play));
        music.add(new Music("Maroon 5", "Girls Like You", R.drawable.play));
        music.add(new Music("Bruno Mars", "Uptown Funk", R.drawable.play));
        music.add(new Music("Jennifer Lopez", "On The Floor", R.drawable.play));

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
