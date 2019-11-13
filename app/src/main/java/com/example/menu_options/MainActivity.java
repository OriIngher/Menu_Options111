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
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
Button second_activity;
LinearLayout ll;
    @Override
    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
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
            ll.setBackgroundColor(Color.BLACK);
        }
        else
            if (id==R.id.Blue)
            {
                ll.setBackgroundColor(Color.BLUE);
            }
            else
                if (id==R.id.Yellow)
                {
                    ll.setBackgroundColor(Color.YELLOW);
                }


        return true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        second_activity= (Button) findViewById(R.id.second_activity);
        ll = (LinearLayout) findViewById(R.id.ll);

    }

    /**
     * @param view
     */
    public void second_activity(View view) {
        Intent si = new Intent(this,Extra_Color.class);
        startActivity(si);

    }
}
