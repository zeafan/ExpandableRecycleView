package com.example.mohamed.expandablerecycleview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.mohamed.expandablerecycleview.Model.TitleChild;
import com.example.mohamed.expandablerecycleview.Model.TitleParent;
import com.example.mohamed.expandablerecycleview.R;
import com.example.mohamed.expandablerecycleview.ViewHolders.TitleChildViewHolder;
import com.example.mohamed.expandablerecycleview.ViewHolders.TitleParentViewHolder;

import java.util.List;

/**
 * Created by mohamed on 3/2/2018.
 */

public class MyAdapter extends ExpandableRecyclerAdapter<TitleParentViewHolder,TitleChildViewHolder> {
    LayoutInflater inflater;
    public MyAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater=LayoutInflater.from(context);
    }

    @Override
    public TitleParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.lst_parent,viewGroup,false);
        return new TitleParentViewHolder(view);
    }

    @Override
    public TitleChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.lst_child,viewGroup,false);
        return new TitleChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(TitleParentViewHolder titleParentViewHolder, int i, Object o) {
        TitleParent titleParent=(TitleParent)o;
        titleParentViewHolder.ParentTitleTxtV.setText(titleParent.getTitle());
    }

    @Override
    public void onBindChildViewHolder(TitleChildViewHolder titleChildViewHolder, int i, Object o) {
        TitleChild titleChild=(TitleChild) o;
        titleChildViewHolder.ChildTitleTxtV1.setText(titleChild.getOption1());
        titleChildViewHolder.ChildTitleTxtV2.setText(titleChild.getOption2());
    }
}
