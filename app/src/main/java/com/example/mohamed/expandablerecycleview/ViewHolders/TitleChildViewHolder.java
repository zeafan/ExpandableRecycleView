package com.example.mohamed.expandablerecycleview.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.example.mohamed.expandablerecycleview.R;

/**
 * Created by mohamed on 3/2/2018.
 */

public class TitleChildViewHolder extends ChildViewHolder{
    public TextView ChildTitleTxtV1;
    public TextView ChildTitleTxtV2;
    public TitleChildViewHolder(View itemView) {
        super(itemView);
        ChildTitleTxtV1=itemView.findViewById(R.id.option1);
        ChildTitleTxtV2=itemView.findViewById(R.id.option2);
    }
}
