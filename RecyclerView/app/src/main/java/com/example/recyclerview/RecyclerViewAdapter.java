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
    Activity mAct;

    public RecyclerViewAdapter(List<Student> List, Activity mAct) {
        this.studentList = List;
        this.mAct = mAct;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.student, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.data=studentList.get(position);
        holder.imageViewStd.setImageResource(holder.data.getImageID());
        holder.textViewStdName.setText(holder.data.getName());
        holder.textViewRollno.setText(String.valueOf(holder.data.getRollNo()));
        holder.textViewGender.setText(holder.data.getGender());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewStd;
        TextView textViewStdName;
        TextView textViewRollno;
        TextView textViewGender;
        Student data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewStd = itemView.findViewById(R.id.imageView);
            textViewRollno = itemView.findViewById(R.id.rollno);
            textViewStdName = itemView.findViewById(R.id.name);
            textViewGender = itemView.findViewById(R.id.gender);
        }
    }
}

