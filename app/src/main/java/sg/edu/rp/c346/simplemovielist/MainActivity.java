package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1b)Create a listView Variable
    ListView lvMovie;

    //Step 2a: Create ArrayList variable
    ArrayList<String> alMovieList;

    //Step 3a:Create array adapter
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 1c: Bind the elements to the java variable
        lvMovie = findViewById(R.id.listViewMovie);

        //Step2b:Initialize the ArrayList
        alMovieList = new ArrayList<>();

        //Step 2c: Add data into Array List
        alMovieList.add("Avengers Infinity War  Release Date: 2018.04");
        alMovieList.add("Justice League  Release Date: 2017.11");


        //Step 3b: initialize the arrayadaper and bind it to the arrayadapter
        aaMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alMovieList);

        //Step 4: Find the listview to the arrayadapter
        lvMovie.setAdapter(aaMovie);
    }
}
