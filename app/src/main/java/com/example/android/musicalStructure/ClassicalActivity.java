package com.example.android.musicalStructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //create a list of artists and songs
        ArrayList<Music> music = new ArrayList<>();
        music.add(new Music("Beethoven", "Symphony No. 5", R.drawable.play));
        music.add(new Music("Tchaikovsky", "1812 Overture", R.drawable.play));
        music.add(new Music("Mozart", "Eine Kleine Nachtmusik: Allegro", R.drawable.play));
        music.add(new Music("Bach", "Toccata And Fugue In D Minor", R.drawable.play));
        music.add(new Music("Rossini", "William Tell Overture", R.drawable.play));
        music.add(new Music("Pachelbel", "Canon In D", R.drawable.play));
        music.add(new Music("Strauss", "Blue Danube", R.drawable.play));
        music.add(new Music("Orff", "Carmina Burana: O Fortuna", R.drawable.play));
        music.add(new Music("Offenbach", "Orpheus In The Underworld: Informal Galop", R.drawable.play));
        music.add(new Music("Handel", "Messiah: Hallelujah Chorus", R.drawable.play));

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
