package com.example.johnberry.jberryprogrammingassign6;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends ListActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        final ArrayAdapter myAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, CLEVELAND_LANDMARKS);

        final ListView listView = getListView();
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        setListAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, final int position, long id) {

                transitionDetail(CLEVELAND_LANDMARKS[position]);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private static final String[] CLEVELAND_LANDMARKS = {
            "Rock N Roll Hall of Fame",
            "Lakeview Cemetery",
            "Progressive Field",
            "Edgewater Park",
            "Capitol Theater",
            "Playhouse Square",
            "Little Italy"
    };

    public void transitionDetail(String selection){

        switch(selection){

            case "Rock N Roll Hall of Fame":{

                Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
                detailIntent.putExtra("SELECTION", selection);
                detailIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(detailIntent);
                break;
            }

            case "Lakeview Cemetery":{
                Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
                detailIntent.putExtra("SELECTION", selection);
                startActivity(detailIntent);
                break;

            }

            case "Progressive Field":{
                Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
                detailIntent.putExtra("SELECTION", selection);
                startActivity(detailIntent);
                break;

            }
            case "Edgewater Park":{
                Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
                detailIntent.putExtra("SELECTION", selection);
                startActivity(detailIntent);
                break;

            }

            case "Capitol Theater":{
                Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
                detailIntent.putExtra("SELECTION", selection);
                startActivity(detailIntent);
                break;

            }

            case "Playhouse Square":{
                Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
                detailIntent.putExtra("SELECTION", selection);
                startActivity(detailIntent);
                break;

            }

            case "Little Italy":{
                Intent detailIntent = new Intent(getApplicationContext(), DetailActivity.class);
                detailIntent.putExtra("SELECTION", selection);
                startActivity(detailIntent);
                break;
            }
        }
    }
}
