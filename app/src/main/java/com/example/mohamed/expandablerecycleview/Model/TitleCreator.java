package com.example.mohamed.expandablerecycleview.Model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohamed on 3/2/2018.
 */

public class TitleCreator {
   private static TitleCreator titleCreator;
   public List<TitleParent> _titleParent;

    public TitleCreator(Context context) {
        _titleParent = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            TitleParent titleParent = new TitleParent(String.format("Call #%d", i));
            _titleParent.add(titleParent);
        }
    }

    public static  TitleCreator get(Context context) {
        if (titleCreator == null) {
            titleCreator = new TitleCreator(context);
        }
        return titleCreator;

    }

}
