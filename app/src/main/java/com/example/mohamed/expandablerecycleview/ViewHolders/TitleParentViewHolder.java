package com.example.mohamed.expandablerecycleview.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.example.mohamed.expandablerecycleview.R;

/**
 * Created by mohamed on 3/2/2018.
 */

public class TitleParentViewHolder extends ParentViewHolder {
   public TextView ParentTitleTxtV;
   public ImageButton imageButton;
    public TitleParentViewHolder(View itemView) {
        super(itemView);
        ParentTitleTxtV=itemView.findViewById(R.id.ParentTitle);
        imageButton=itemView.findViewById(R.id.imageBtn);
    }
}
