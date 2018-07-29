package com.example.android.musicalStructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * {@link MusicAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Music} objects.
 */
public class MusicAdapter extends ArrayAdapter<Music> {

    private static final String LOG_TAG = MusicAdapter.class.getSimpleName();

    /**
     * custom constructor does not mirror a superclass constructor
     *
     * @param context The current context. Used to inflate the layout file.
     * @param objects   A list of Word objects to display in a list.
     */

    public MusicAdapter(Context context, List<Music> objects) {
        //We initialize the ArrayAdapter's internal storage for the context and the list.
        //The second argument is used when the ArrayAdapter is populating a single TextView.
        //Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        //going to use the second argument, so it can be any value. Here, we used 0.
        super(context,0, objects);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView
     */


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check of the existing view is being reused , otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the {@link music} object located at this position in the list
        Music currentMusic = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID artist_text_view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        //Get the Miwok name from the current Word object and
        //set this text on the name TextView
        artistTextView.setText(currentMusic.getArtist());

        //Find the TextView in the list_item.xml layout with the ID song_text_view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        //Get the song text from the current Word object and
        //set this text on the default TextView
        songTextView.setText(currentMusic.getSong());

        //Find the imageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        //Get the image resource ID from the current music object and
        //set the image to iconView
        iconView.setImageResource(currentMusic.getImageId());

        //return the whole list item layout (containing 2 TextViews and an ImageView)
        //so that it can be shown in the ListView
        return listItemView;

    }

}