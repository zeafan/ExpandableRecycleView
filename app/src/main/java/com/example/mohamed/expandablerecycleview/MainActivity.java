package com.example.mohamed.expandablerecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.mohamed.expandablerecycleview.Adapter.MyAdapter;
import com.example.mohamed.expandablerecycleview.Model.TitleChild;
import com.example.mohamed.expandablerecycleview.Model.TitleCreator;
import com.example.mohamed.expandablerecycleview.Model.TitleParent;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter=new MyAdapter(this,initDate());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);
        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initDate() {
        TitleCreator titleCreator=TitleCreator.get(MainActivity.this);
        List<TitleParent>titleParents=titleCreator._titleParent;
        List<ParentObject> parentObjects=new ArrayList<>();
        for(TitleParent title:titleParents)
        {
            List<Object> childList=new ArrayList<>();
            childList.add(new TitleChild("Add to Contacts","Send Message"));
            title.setChildObjectList(childList);
            parentObjects.add(title);
        }
        return parentObjects;
    }
}
