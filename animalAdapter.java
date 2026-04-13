package com.example.myapplication;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class animalAdapter extends RecyclerView.Adapter<animalAdapter.ViewHolder> {

    private List<animal> animals;

    public animalAdapter(List<animal> animals) {
        this.animals = animals;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textName);
        }
    }

    @Override
    public animalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_animal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(animalAdapter.ViewHolder holder, int position) {
        animal animal = animals.get(position);

        holder.textView.setText(animal.getName());

        holder.itemView.setOnClickListener(v -> {
            MediaPlayer mp = MediaPlayer.create(v.getContext(), animal.getSoundResId());
            mp.start();
        });
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
