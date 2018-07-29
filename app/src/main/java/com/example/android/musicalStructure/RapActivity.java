package com.example.android.musicalStructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //create a list of artists and songs
        ArrayList<Music> music = new ArrayList<>();
        music.add(new Music("Beyonce & Jay Z", "Apeshit", R.drawable.play));
        music.add(new Music("Teyana Taylor", "Rose In Harlem", R.drawable.play));
        music.add(new Music("Meek Mill", "Stay Woke", R.drawable.play));
        music.add(new Music("Childish Gambino", "This Is America", R.drawable.play));
        music.add(new Music("J Balvin", "Peligrosa", R.drawable.play));
        music.add(new Music("Cardi B", "I Do", R.drawable.play));
        music.add(new Music("Juice World", "All Girls Are The Same", R.drawable.play));
        music.add(new Music("Lil Yachty", "66", R.drawable.play));
        music.add(new Music("Drake", "God's Plan", R.drawable.play));
        music.add(new Music("Migos", "Made Men", R.drawable.play));

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
