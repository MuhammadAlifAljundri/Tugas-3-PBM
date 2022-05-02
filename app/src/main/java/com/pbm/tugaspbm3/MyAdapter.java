package com.pbm.tugaspbm3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList nim_id, nama_id, jurusan_id;

    public MyAdapter(Context context, ArrayList nim_id, ArrayList nama_id, ArrayList jurusan_id) {
        this.context = context;
        this.nim_id = nim_id;
        this.nama_id = nama_id;
        this.jurusan_id = jurusan_id;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.userentry,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nim_id.setText(String.valueOf(nim_id.get(position)));
        holder.nama_id.setText(String.valueOf(nama_id.get(position)));
        holder.jurusan_id.setText(String.valueOf(jurusan_id.get(position)));
    }

    @Override
    public int getItemCount() {
        return nim_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nim_id, nama_id, jurusan_id;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nim_id = itemView.findViewById(R.id.textnim);
            nama_id = itemView.findViewById(R.id.textnama);
           jurusan_id = itemView.findViewById(R.id.textjurusan);
        }
    }
}
