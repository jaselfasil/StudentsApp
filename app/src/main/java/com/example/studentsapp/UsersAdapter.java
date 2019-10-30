package com.example.studentsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UsersViewHolder> {

    Context context;
    List<Post> userListResponseData;

    public UsersAdapter(Context context, List<Post> userListResponseData) {
        this.userListResponseData = userListResponseData;
        this.context = context;
    }
    @Override
    public UsersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.user_list_items, null);
        UsersViewHolder usersViewHolder = new UsersViewHolder(view);
        return usersViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UsersAdapter.UsersViewHolder holder, final int position) {
        holder.name.setText("Name: " + userListResponseData.get(position).getName());
        holder.email.setText("Email: " + userListResponseData.get(position).getEmail());
        holder.age.setText("age: " + userListResponseData.get(position).getAge());
        // implement setONCLickListtener on itemView
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with user name
                Toast.makeText(context, userListResponseData.get(position).getId(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return userListResponseData.size();
    }
    class UsersViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name, email,age;

        public UsersViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.name);
            email = (TextView) itemView.findViewById(R.id.email);
            age = (TextView) itemView.findViewById(R.id.age);
        }
    }
}

