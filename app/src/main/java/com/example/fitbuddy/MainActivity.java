package com.example.fitbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    List<Book> lstBook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book(R.drawable.abs));
        lstBook.add(new Book(R.drawable.back));
        lstBook.add(new Book(R.drawable.biceps));
        lstBook.add(new Book(R.drawable.chest));
        lstBook.add(new Book(R.drawable.legs));
        lstBook.add(new Book(R.drawable.shoulder));
        lstBook.add(new Book(R.drawable.thigh));
        lstBook.add(new Book(R.drawable.triceps));
        lstBook.add(new Book(R.drawable.workout));
        lstBook.add(new Book(R.drawable.workout1));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);



    }
}
