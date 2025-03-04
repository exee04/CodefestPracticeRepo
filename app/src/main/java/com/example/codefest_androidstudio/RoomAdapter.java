package com.example.codefest_androidstudio;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView room_number_textview, room_type_textview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            room_number_textview = itemView.findViewById(R.id.room_number_textView);
            room_type_textview = itemView.findViewById(R.id.room_type_textView);

        }
    }
}
