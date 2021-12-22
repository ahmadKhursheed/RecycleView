package com.example.recyclerview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<Student> studentList;
    Activity mainActivity;

    public RecyclerViewAdapter(List<Student> List, Activity mainActivity) {
        this.studentList = List;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student, parent, false);
        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.data=studentList.get(position);
        holder.imageViewStd.setImageResource(holder.data.getImageID());
        holder.textViewStdName.setText(holder.data.getName());
        holder.textRollNoView.setText(String.valueOf(holder.data.getRollNo()));
        holder.textGenderView.setText(holder.data.getGender());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewStd;
        TextView textViewStdName;
        TextView textRollNoView;
        TextView textGenderView;
        Student data;
        public MyViewHolder(@NonNull View item) {
            super(item);
            imageViewStd = item.findViewById(R.id.imageView);
            textRollNoView = item.findViewById(R.id.rollno);
            textViewStdName = item.findViewById(R.id.name);
            textGenderView = item.findViewById(R.id.gender);
        }
    }
}

