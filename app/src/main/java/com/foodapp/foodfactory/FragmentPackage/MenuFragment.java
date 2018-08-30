package com.foodapp.foodfactory.FragmentPackage;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.foodapp.foodfactory.AdapterPackage.MenuAdapter;
import com.foodapp.foodfactory.AdapterPackage.MenuIndicatorAdapter;
import com.foodapp.foodfactory.ItemClickListener;
import com.foodapp.foodfactory.ModelPackage.FoodModel;
import com.foodapp.foodfactory.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    RecyclerView menuRecycler;
    RecyclerView menuIndicatorRecycler;

    List<FoodModel> foodModels = new ArrayList<>();
    
    
    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        InitView();
        SetRecylerViewOptions();
        FoodModelBuilder();

        MenuAdapter adapter = new MenuAdapter(foodModels, foodModels.size());
        menuRecycler.setAdapter(adapter);

        MenuIndicatorAdapter indicatorAdapter = new MenuIndicatorAdapter(getActivity(), getListerner());
        menuIndicatorRecycler.setAdapter(indicatorAdapter);

        
    }

    private void InitView(){
        View view  = getView();
        if(view != null){
            menuRecycler  = view.findViewById(R.id.menu_recycler);
            menuIndicatorRecycler = view.findViewById(R.id.menu_indicator_recycler);
        }
    }
    
    private void SetRecylerViewOptions(){
        menuRecycler.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        menuRecycler.setLayoutManager(gridLayoutManager);

        menuIndicatorRecycler.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        menuIndicatorRecycler.setLayoutManager(linearLayoutManager);

    }

    private void FoodModelBuilder(){

        //burger
        foodModels.add(new FoodModel("Burger","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.choclate_bread, 4.2f, 20, "BURGER"));
        foodModels.add(new FoodModel("Burger","Lorem Ipsum is simply\ntext of the printing", 22.23, R.drawable.icecream, 5.0f, 52, "BURGER"));
        foodModels.add(new FoodModel("Burger","Lorem Ipsum is simply\ntext of the printing", 4.23, R.drawable.cooke, 4.2f, 20, "BURGER"));
        foodModels.add(new FoodModel("Burger","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.choclate_bread, 5.2f, 20, "BURGER"));
        foodModels.add(new FoodModel("Burger","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.choclate_bread, 4.2f, 20, "BURGER"));
        foodModels.add(new FoodModel("Burger","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.choclate_bread, 4.2f, 20, "BURGER"));

        //desert
        foodModels.add(new FoodModel("ChoclateBread","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.choclate_bread, 4.2f, 20, "DESSERT"));
        foodModels.add(new FoodModel("ChocalteBread","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.choclate_bread, 4.2f, 20, "DESSERT"));
        foodModels.add(new FoodModel("Icecream","Lorem Ipsum is simply\ntext of the printing", 22.23, R.drawable.icecream, 5.0f, 52, "DESSERT"));
        foodModels.add(new FoodModel("Icecream","Lorem Ipsum is simply\ntext of the printing", 4.23, R.drawable.icecream, 4.2f, 20, "DESSERT"));
        foodModels.add(new FoodModel("Icecream","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.icecream, 5.2f, 20, "DESSERT"));
        foodModels.add(new FoodModel("Icecream","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.icecream, 4.2f, 20, "DESSERT"));
        foodModels.add(new FoodModel("Choclate Bread","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.choclate_bread, 4.2f, 20, "DESSERT"));
        foodModels.add(new FoodModel("Choaclate Bread","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.choclate_bread, 4.2f, 20, "DESSERT"));

        //soup
        foodModels.add(new FoodModel("Soup","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.soup, 4.2f, 20, "SOUP"));
        foodModels.add(new FoodModel("Soup","Lorem Ipsum is simply\ntext of the printing", 22.23, R.drawable.soup, 5.0f, 52, "SOUP"));
        foodModels.add(new FoodModel("Soup","Lorem Ipsum is simply\ntext of the printing", 4.23, R.drawable.soup, 4.2f, 20, "SOUP"));
        foodModels.add(new FoodModel("Soup","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.soup, 5.2f, 20, "SOUP"));
        foodModels.add(new FoodModel("Soup","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.soup, 4.2f, 20, "SOUP"));
        foodModels.add(new FoodModel("Soup","Lorem Ipsum is simply\ntext of the printing", 40.23, R.drawable.soup, 4.2f, 20, "SOUP"));
    }


    private ItemClickListener getListerner(){

        return new ItemClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onItemClick( Object item, int i) {
                Toast.makeText(getContext(), String.format("Clciked : %s", item), Toast.LENGTH_SHORT).show();
            }
        };
    }


}
