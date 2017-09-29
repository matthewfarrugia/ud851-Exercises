package com.example.android.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by admin on 29/09/2017.
 */

public class NumberViewHolder extends RecyclerView.ViewHolder {

    private TextView listItemNumberView;

    public NumberViewHolder(View itemView){
        super(itemView);
        listItemNumberView = (TextView) findViewById();
    }

    void bind (int listIndex){
        listItemNumberView.setText(listIndex.);
    }
}
