package com.foodapp.foodfactory.FragmentPackage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.foodapp.foodfactory.AdapterPackage.FeaturedFoodAdapter;
import com.foodapp.foodfactory.AdapterPackage.RecommendedFoodAdapter;
import com.foodapp.foodfactory.ModelPackage.FoodModel;
import com.foodapp.foodfactory.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView recommendedFood;

    List<FoodModel> foodModelList;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        InitView();

        foodModelList = new ArrayList<>();


        FoodModelBuilder();
        setRecylerViewOptions();


        FeaturedFoodAdapter featuredFoodAdapter = new FeaturedFoodAdapter(foodModelList);
        RecommendedFoodAdapter recommendedFoodAdapter = new RecommendedFoodAdapter(foodModelList, 4);

        recommendedFood.setAdapter(recommendedFoodAdapter);
        recyclerView.setAdapter(featuredFoodAdapter);
    }

    private void InitView(){
        View view = getView();
        if(view != null){
            recyclerView = view.findViewById(R.id.feature_food_recyler);
            recommendedFood = view.findViewById(R.id.recommended_items_recycler);
        }
    }

    private void FoodModelBuilder(){
        foodModelList.add(new FoodModel("Burger","Lorem Ipsum is simply dummy text of the printing and typesetting industry", 40.23, R.drawable.choclate_bread, 4.2f, 20,"THAI"));
        foodModelList.add(new FoodModel("Icecream","Lorem Ipsum is simply dummy text of the printing and typesetting industry", 20.23, R.drawable.icecream, 5.0f, 52, "THAI"));
        foodModelList.add(new FoodModel("Cookie","Lorem Ipsum is simply dummy text of the printing and typesetting industry", 4.23, R.drawable.cooke, 4.2f, 20, "THAI"));
        foodModelList.add(new FoodModel("Choclate Breat","Lorem Ipsum is simply dummy text of the printing and typesetting industry", 40.23, R.drawable.choclate_bread, 5.2f, 20, "THAI"));
        foodModelList.add(new FoodModel("Burger","Lorem Ipsum is simply dummy text of the printing and typesetting industry", 40.23, R.drawable.choclate_bread, 4.2f, 20, "THAI"));
        foodModelList.add(new FoodModel("Burger","Lorem Ipsum is simply dummy text of the printing and typesetting industry", 40.23, R.drawable.choclate_bread, 4.2f, 20, "THAI"));
        foodModelList.add(new FoodModel("Burger","Lorem Ipsum is simply dummy text of the printing and typesetting industry", 40.23, R.drawable.choclate_bread, 4.2f, 20, "THAI"));
    }

    private void setRecylerViewOptions(){

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        recommendedFood.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);

        recommendedFood.setLayoutManager(gridLayoutManager);

        recommendedFood.setNestedScrollingEnabled(false);




    }

}
