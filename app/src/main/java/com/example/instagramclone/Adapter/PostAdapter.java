package com.example.instagramclone.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagramclone.Posts.Post;
import com.example.instagramclone.databinding.FeedactRecyclerRowBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {
    ArrayList<Post> postArrayList;

    public  PostAdapter (ArrayList<Post> postArrayList){
        this.postArrayList = postArrayList;

    }

    @NonNull
    @Override
    public PostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FeedactRecyclerRowBinding feedactRecyclerRowBinding = FeedactRecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new PostHolder(feedactRecyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PostHolder holder, int position) {
        holder.feedactRecyclerRowBinding.recyclerUserEmailText.setText(postArrayList.get(position).userEmail);
        holder.feedactRecyclerRowBinding.recyclerCommentText.setText(postArrayList.get(position).comment);
        Picasso.get().load(postArrayList.get(position).downloadUrl).into(holder.feedactRecyclerRowBinding.recyclerImageView);


    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }

    class PostHolder extends RecyclerView.ViewHolder{

        FeedactRecyclerRowBinding feedactRecyclerRowBinding;
        public PostHolder(FeedactRecyclerRowBinding feedactRecyclerRowBinding) {
            super(feedactRecyclerRowBinding.getRoot());
            this.feedactRecyclerRowBinding =feedactRecyclerRowBinding;
        }
    }


}
