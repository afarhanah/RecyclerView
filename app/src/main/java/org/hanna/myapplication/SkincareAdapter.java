package org.hanna.myapplication;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class SkincareAdapter extends RecyclerView.Adapter<SkincareAdapter.SkincareViewHolder> {
    private Context mContext;
    private ArrayList<Skincare> listSkincare;

    public SkincareAdapter(Context mContext, ArrayList<Skincare> listSkincare) {
        this.mContext = mContext;
        this.listSkincare = listSkincare;
    }

    private SkincareViewHolder.OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(SkincareViewHolder.OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public SkincareViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_skincare_item, parent, false);
        return new SkincareViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SkincareViewHolder holder, int position) {
        Skincare skincare = listSkincare.get(position);
        Glide.with(holder.itemView.getContext())
                .load(skincare.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(skincare.getNama());
        holder.tvDetail.setText(skincare.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listSkincare.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listSkincare.size();
    }

    public static class SkincareViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        public SkincareViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }

        public interface OnItemClickCallback {
            void onItemClicked(Skincare data);
        }
    }


}
