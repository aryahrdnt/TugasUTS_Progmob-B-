package com.example.film;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.ListviewHolder> {
    private ArrayList<film> listFilm;

    public ListFilmAdapter(ArrayList<film> list) {
        this.listFilm = list;
    }
    @NonNull
    @Override
    public ListviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_film, parent, false);
        return new ListviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListviewHolder holder, int position) {
        film film = listFilm.get(position);
        Glide.with(holder.itemView.getContext())
                .load(film.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvNama.setText(film.getNama());
        holder.tvDetail.setText(film.getDetail());

    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }

    class ListviewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;

        ListviewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.img_item_film);
            tvNama = itemview.findViewById(R.id.tv_item_nama);
            tvDetail = itemview.findViewById(R.id.tv_detail);
        }
    }
}





