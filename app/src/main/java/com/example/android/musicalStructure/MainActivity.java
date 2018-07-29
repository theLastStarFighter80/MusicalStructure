/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.musicalStructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the blues category
        TextView blues = (TextView) findViewById(R.id.blues);

        // Set a click listener on that View
        blues.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BluesActivity}
                Intent bluesIntent = new Intent(MainActivity.this, BluesActivity.class);

                // Start the new activity
                startActivity(bluesIntent);
            }
        });

        // Find the View that shows the classical category
        TextView classical = (TextView) findViewById(R.id.classical);

        // Set a click listener on that View
        classical.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(classicalIntent);
            }
        });

        // Find the View that shows the dance category
        TextView dance = (TextView) findViewById(R.id.dance);

        // Set a click listener on that View
        dance.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link DanceActivity}
                Intent danceIntent = new Intent(MainActivity.this, DanceActivity.class);

                // Start the new activity
                startActivity(danceIntent);
            }
        });

        // Find the View that shows the hiphop category
        TextView hiphop = (TextView) findViewById(R.id.hiphop);

        // Set a click listener on that View
        hiphop.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HipHopActivity}
                Intent hiphopIntent = new Intent(MainActivity.this, HipHopActivity.class);

                // Start the new activity
                startActivity(hiphopIntent);
            }
        });

        // Find the View that shows the rap category
        TextView rap = (TextView) findViewById(R.id.rap);

        // Set a click listener on that View
        rap.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RapActivity}
                Intent rapIntent = new Intent(MainActivity.this, RapActivity.class);

                // Start the new activity
                startActivity(rapIntent);
            }
        });

        // Find the View that shows the rock category
        TextView rock = (TextView) findViewById(R.id.rock);

        // Set a click listener on that View
        rock.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RockActivity}
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(rockIntent);
            }
        });

        // Find the View that shows the rock category
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);

        // Set a click listener on that View
        nowPlaying.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlaying_Intent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlaying_Intent);
            }
        });
    }
}
