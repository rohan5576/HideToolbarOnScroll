package com.example.admin.hidetoolbaronscroll;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.example.admin.hidetoolbaronscroll.adapter.RecyclerAdapter;
import com.example.admin.hidetoolbaronscroll.model.ModelItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private ArrayList<ModelItem> requestsItemArrayList;
    LinearLayoutManager linearLayoutManager;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviewById();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(getString(R.string.app_name));
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));




    }
    private void setListValues(){

        requestsItemArrayList = new ArrayList<ModelItem>();
        requestsItemArrayList.add(new ModelItem("1", "Happy Coding", R.drawable.images));
        requestsItemArrayList.add(new ModelItem("1", "Happy Coding", R.drawable.images));
        requestsItemArrayList.add(new ModelItem("1", "Happy Coding", R.drawable.images));
        requestsItemArrayList.add(new ModelItem("1", "Happy Coding", R.drawable.images));
        requestsItemArrayList.add(new ModelItem("1", "Happy Coding", R.drawable.images));

        recyclerAdapter = new RecyclerAdapter(this,requestsItemArrayList);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayout.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerAdapter);

        recyclerView.setOnScrollListener(new MyScrollListeneView(this) {
            @Override
            public void onMoved(int distance) {
                toolbar.setTranslationY(-distance);
            }
        });


    }

    private void findviewById(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this);

    }
    @Override
    public void onResume() {
        super.onResume();
        setListValues();
    }
}
