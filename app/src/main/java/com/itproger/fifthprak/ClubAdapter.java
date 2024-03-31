package com.itproger.fifthprak;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Club> states;

    ClubAdapter(Context context, List<Club> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public ClubAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ClubAdapter.ViewHolder holder, int position) {
        Club club = states.get(position);
        holder.flagView.setImageResource(club.getFlagResource());
        holder.nameView.setText(club.getName());
        holder.capitalView.setText(club.getCountry());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.country);
        }
    }
}