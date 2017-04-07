package com.example.admin.hidetoolbaronscroll.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.hidetoolbaronscroll.R;
import com.example.admin.hidetoolbaronscroll.model.ModelItem;


import java.util.ArrayList;

/**
 * Created by Admin on 22-03-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private ArrayList<ModelItem> requestItems;
    private Context context;

    public RecyclerAdapter(Context context, ArrayList<ModelItem> requestItems) {
        this.context = context;
        this.requestItems = requestItems;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView textView;
        public ImageView imageView;




        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.itemTextView);
            imageView = (ImageView) itemView.findViewById(R.id.imageview);

        }

        @Override
        public void onClick(View v) {

        }
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        final ModelItem modelItem = requestItems.get(position);

        holder.textView.setText(modelItem.getName());


        holder.imageView.setImageResource(modelItem.getProfilepic());

    }



    @Override
    public int getItemCount() {
        return requestItems.size();
    }


}
