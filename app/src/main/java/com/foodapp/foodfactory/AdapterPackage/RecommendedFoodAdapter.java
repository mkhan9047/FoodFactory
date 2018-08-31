package com.foodapp.foodfactory.AdapterPackage;

import android.annotation.SuppressLint;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.foodapp.foodfactory.ModelPackage.FoodModel;
import com.foodapp.foodfactory.R;

import java.util.ArrayList;
import java.util.List;

public class RecommendedFoodAdapter extends RecyclerView.Adapter<RecommendedFoodAdapter.RecommendedViewHolder>{

    private List<FoodModel> models = new ArrayList<>();
    private int Count;


    public RecommendedFoodAdapter(List<FoodModel> models, int count) {
        this.models = models;
        this.Count = count;
    }

    @NonNull
    @Override
    public RecommendedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recommended_item_recycler_row,parent,false);
        return new RecommendedViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull RecommendedViewHolder holder, int position) {

        holder.name.setText(models.get(position).getName());
        holder.ratingBar.setRating(models.get(position).getRating());
        holder.rating_count.setText(String.format("(%d)",models.get(position).getRatingCount()));
        holder.imageView.setImageResource(models.get(position).getImage());
        holder.desc.setText(models.get(position).getDes());
        holder.price.setText(String.format("$%.2f", models.get(position).getPrice()));



    }

    @Override
    public int getItemCount() {
        return Count;
    }


    class RecommendedViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView name, price, rating_count, desc;
        RatingBar ratingBar;

        public RecommendedViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.recommended_image);
            name = itemView.findViewById(R.id.recommended_name);
            price = itemView.findViewById(R.id.recommended_price);
            rating_count = itemView.findViewById(R.id.recommended_rating_count);
            desc = itemView.findViewById(R.id.recommended_desc);
            ratingBar = itemView.findViewById(R.id.recommended_rating);
        }
    }
}
