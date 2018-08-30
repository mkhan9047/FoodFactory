package com.foodapp.foodfactory.AdapterPackage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.foodapp.foodfactory.ItemClickListener;
import com.foodapp.foodfactory.R;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.List;

public class MenuIndicatorAdapter extends RecyclerView.Adapter<MenuIndicatorAdapter.MenuIndicatorHolder> {

    private List<String> list = new ArrayList<>();
    private Context context;
    private int row_index = 0;
    private ItemClickListener listener;

    public MenuIndicatorAdapter(Context context, ItemClickListener listener) {
        list.add("DESSERT");
        list.add("SOUP");
        list.add("BURGER");
        list.add("COFFEE");
        list.add("PASTY");
        list.add("THAI");
        list.add("CHINESE");
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MenuIndicatorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_indicator_recyler, parent, false);
        return new MenuIndicatorHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MenuIndicatorHolder holder, final int position) {
    holder.textView.setText(list.get(position));
    holder.linearLayout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            row_index = holder.getAdapterPosition();
            notifyDataSetChanged();
            listener.onItemClick(list.get(row_index), row_index);
        }
    });


    if(row_index == position){
        holder.linearLayout.setBackgroundResource(R.drawable.menu_indicator_shape);
        holder.textView.setTextColor(context.getResources().getColor(R.color.color_white));
    }else{
        holder.linearLayout.setBackgroundResource(R.drawable.menu_indicator_white_shape);
        holder.textView.setTextColor(context.getResources().getColor(R.color.color_balck));
    }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MenuIndicatorHolder extends  RecyclerView.ViewHolder  {
        LinearLayout linearLayout;
        TextView textView;

        public MenuIndicatorHolder(View itemView ) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.menu_indicator_root);
            textView = itemView.findViewById(R.id.menu_indicator_text);


        }

    }




}
