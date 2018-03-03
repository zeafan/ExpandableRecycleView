package com.example.mohamed.expandablerecycleview.Model;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

/**
 * Created by mohamed on 3/2/2018.
 */

public class TitleParent  implements ParentObject{
   private List<Object> mChilderentList;
    private UUID _id;
    private String title;
    @Override
    public List<Object> getChildObjectList() {
        return mChilderentList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChilderentList=list;
    }

    public TitleParent(String title) {
        this.title = title;
        _id=UUID.randomUUID();
    }

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
