package com.foodapp.foodfactory.AdapterPackage;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
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

public class FeaturedFoodAdapter extends RecyclerView.Adapter<FeaturedFoodAdapter.FeaturedFoodViewHolder> {

    private List<FoodModel> foodModelList = new ArrayList<>();

    public FeaturedFoodAdapter(List<FoodModel> foodModelList) {
        this.foodModelList = foodModelList;
    }

    @NonNull
    @Override
    public FeaturedFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feature_recyler_row, parent, false);
        return new FeaturedFoodViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull FeaturedFoodViewHolder holder, int position) {

        holder.foodname.setText(foodModelList.get(position).getName());
        holder.imageView.setImageResource(foodModelList.get(position).getImage());
        holder.price.setText(String.format("$%.2f", foodModelList.get(position).getPrice()));
        holder.des.setText(foodModelList.get(position).getDes());
        holder.ratingCount.setText(String.format("(%d)", foodModelList.get(position).getRatingCount()));
        holder.ratingBar.setRating(foodModelList.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return foodModelList.size();
    }


    class FeaturedFoodViewHolder extends RecyclerView.ViewHolder{

        TextView foodname, des, price, ratingCount;
        RatingBar ratingBar;
        ImageView imageView;

        public FeaturedFoodViewHolder(View itemView) {
            super(itemView);
            foodname = itemView.findViewById(R.id.food_name);
            des = itemView.findViewById(R.id.food_des);
            price = itemView.findViewById(R.id.food_price);
            ratingBar = itemView.findViewById(R.id.food_rating);
            ratingCount = itemView.findViewById(R.id.foodrating_count);
            imageView = itemView.findViewById(R.id.food_image);
        }
    }
}
