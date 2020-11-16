package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class My_Adapter extends RecyclerView.Adapter <My_Adapter.ViewHolder> {

    public  static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView name,desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            desc = itemView.findViewById(R.id.desc);

        }
    }
    private  Context context;
    private  List<post> Post;
    public My_Adapter (Context c , List<post> PostList){
        this.context = c;
        this.Post = PostList;
    }

    @Override
    public My_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.post,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        post p = Post.get(position);
        holder.name.setText(p.getName());
        holder.desc.setText(p.getDesc());
    }

    @Override
    public int getItemCount() {
        return Post.size();
    }
}
