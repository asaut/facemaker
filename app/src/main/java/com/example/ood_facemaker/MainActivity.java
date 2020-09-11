/**Facemaker Project
 * Date 10 September 2020
 * author: Audrey Sauter
 * I have tested my code there are no bugs
 *
 */



package com.example.ood_facemaker;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    /** External Citation
     * Date 10 September 2020
     * Problem: I couldn't properly code the array for my
     * spinner
     *Resource: Prof. Nuxoll
     * Solution: I have written the code down below.
     */

    // this is my String array of my hairstyles for my spinner
    public static final String[] hairStyles = {"Long", "Medium", "Short"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * External Citation
         * Date 9 September 2020
         * Problem: I didn't know how to code the drop down menu
         * for the spinner.
         *
         * Resource:https://developer.android.com/guide/topics/ui/
         * controls/spinner
         * Solution: I used the example code from this post and changed it to match my code
         */
        // This is my spinner array to drop down my hairstyles
        Spinner spinner;
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this,
                android.R.layout.simple_spinner_dropdown_item,
                hairStyles);

        spinner.setAdapter(adapter);
    }


}


        /*    @Override
            public void onClick(View view) {
            }
        }*/



