package com.example.android.musicalStructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_0);

        //create a list of the artist and song that is currently playing
        ArrayList<Music_0> music_0 = new ArrayList<>();
        music_0.add(new Music_0("Marshmello", "Friends", R.drawable.now_playing_image));

        // Create an {@link Music0Adapter}, whose data source is a list of {@link music_0}s. The
        // adapter knows how to create list items for each item in the list.
        Music0Adapter adapter = new Music0Adapter(this, music_0);

        // Find the {@link ListView_0} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView_0} with the view ID called list_0, which is declared in the
        // activity_main.xml layout file.
        ListView listView_0 = (ListView) findViewById(R.id.list_0);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView_0.setAdapter(adapter);

    }
}
