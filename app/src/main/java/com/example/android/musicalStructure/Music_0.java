/*
+ * Copyright (C) 2016 The Android Open Source Project
+ *
+ * Licensed under the Apache License, Version 2.0 (the "License");
+ * you may not use this file except in compliance with the License.
+ * You may obtain a copy of the License at
+ *
+ *      http://www.apache.org/licenses/LICENSE-2.0
+ *
+ * Unless required by applicable law or agreed to in writing, software
+ * distributed under the License is distributed on an "AS IS" BASIS,
+ * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
+ * See the License for the specific language governing permissions and
+ * limitations under the License.
+ */

package com.example.android.musicalStructure;

/**
 * {@link Music_0} represents the music that is currently playing.
 * It contains an artist and a song for the music.
 */

public class Music_0{

    /**artist transition for the music*/
    private String m_Artist;

    /**song transition for the music*/
    private String m_Song;

    /**Drawable resource ID*/
    private int m_ImageId;

    /**
     * Create a new music object
     * @param artist is the name of the artist.
     * @param song is the name of the song.
     * @param image is the now_playing_image jpg.
     */
    public Music_0(String artist, String song,int image){
        m_Artist = artist;
        m_Song = song;
        m_ImageId = image;
    }

    /**
     * Get the artist name.
     */
    public String get_Artist(){
        return m_Artist;
    }

    /**
     * Get the song name.
     */
    public String get_Song(){
        return m_Song;
    }

    /**
     *Get the image ID
     */

    public int get_ImageId() {
        return m_ImageId;
    }

}
