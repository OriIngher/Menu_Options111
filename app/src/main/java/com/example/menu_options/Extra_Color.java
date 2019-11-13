package com.example.menu_options;
/**
 * @author Ori Ingher
 */

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Extra_Color extends AppCompatActivity {
Intent gi = getIntent();
LinearLayout ll2;
    @Override
    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.extracolor, menu);

        return true;
    }

    /**
     *
     * @param item
     * @return the function sets the background color to the chosen one and returns true
     */
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id =item.getItemId();
        if(id==R.id.Black)
        {
            ll2.setBackgroundColor(Color.BLACK);
        }
        else
        if (id==R.id.Blue)
        {
            ll2.setBackgroundColor(Color.BLUE);
        }
        else
        if (id==R.id.Yellow)
        {
            ll2.setBackgroundColor(Color.YELLOW);
        }
        else
        if (id==R.id.Green)
        {
            ll2.setBackgroundColor(Color.GREEN);
        }

        return true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra__color);
        ll2 = (LinearLayout) findViewById(R.id.ll2);

    }

    /**
     *
     * @param view
     */
    public void first_activity(View view) {
        finish();
    }
}
