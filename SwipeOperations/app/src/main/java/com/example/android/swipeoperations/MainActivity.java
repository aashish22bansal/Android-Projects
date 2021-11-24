package com.example.android.swipeoperations;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewClickInterface{
    private static final String TAG = "MainActivity";

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    List<String> moviesList;

    SwipeRefreshLayout swipeRefreshLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        moviesList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(moviesList, this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(recyclerAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        moviesList.add("1");
        moviesList.add("2");
        moviesList.add("3");
        moviesList.add("4");
        moviesList.add("5");
        moviesList.add("6");
        moviesList.add("7");
        moviesList.add("8");
        moviesList.add("9");
        moviesList.add("10");
        moviesList.add("11");
        moviesList.add("12");
        moviesList.add("13");
        moviesList.add("14");
        moviesList.add("15");
        moviesList.add("16");
        moviesList.add("17");
        moviesList.add("18");
        moviesList.add("19");
        moviesList.add("20");
        moviesList.add("21");
        moviesList.add("22");
        moviesList.add("23");
        moviesList.add("24");




        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                moviesList.add("25");
                moviesList.add("26");
                moviesList.add("27");
                moviesList.add("28");
                moviesList.add("29");
                moviesList.add("30");

                recyclerAdapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
            }
        });

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

    // Creating a String to hold the deleted movie
    String deletedMovie = null;

    // Creating a List for archieving
    List<String> archievedMovies = new ArrayList<>();

    // Creating a simple callback
    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            // used to rearrange specific rows
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
            // getting position
            int position = viewHolder.getAdapterPosition();
            switch (direction){
                case ItemTouchHelper.LEFT: // Swiping right to left
                    //getting the movie to be deleted
                    deletedMovie = moviesList.get(position);
                    moviesList.remove(position);
                    recyclerAdapter.notifyItemRemoved(position);
                    Snackbar.make(recyclerView, deletedMovie, BaseTransientBottomBar.LENGTH_LONG).setAction("Undo", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            moviesList.add(position, deletedMovie);
                            recyclerAdapter.notifyItemInserted(position);
                        }
                    }).show();
                    break;
                case ItemTouchHelper.RIGHT: // Swiping left to right
                    String movieName = moviesList.get(position);
                    archievedMovies.add(movieName);
                    moviesList.remove(position);
                    recyclerAdapter.notifyItemRemoved(position);
                    Snackbar.make(recyclerView, movieName + ", Archieved.", BaseTransientBottomBar.LENGTH_LONG).setAction("Undo", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            archievedMovies.remove(archievedMovies.lastIndexOf(movieName));
                            moviesList.add(position, movieName);
                            recyclerAdapter.notifyItemInserted(position);
                        }
                    }).show();
                    break;
            }
        }
    };

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this, moviesList.get(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLongItemClick(int position) {
//        moviesList.remove(position);
//        recyclerAdapter.notifyItemRemoved(position);
    }
}