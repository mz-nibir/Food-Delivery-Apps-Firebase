package com.nibir.fooddelivery.ui.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nibir.fooddelivery.R;
import com.nibir.fooddelivery.model.MenuItem;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.viewHolder> {

    List<MenuItem> allMenuItems;

    public MenuAdapter(List<MenuItem> allRestaurants) {
        this.allMenuItems = allRestaurants;

    }

    @NonNull
    @Override
    public MenuAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item,parent,false);

        return new MenuAdapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.viewHolder holder, int position) {
        MenuItem current= allMenuItems.get(position);

    }

    @Override
    public int getItemCount() {
        if (allMenuItems ==null|| allMenuItems.size()==0){
            return 0;
        }else
            return allMenuItems.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView menuItemName, menuDescription,priceTextview;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            menuItemName =itemView.findViewById(R.id.itemNametextview);
            menuDescription =itemView.findViewById(R.id.itemDescriptiontextview);
            priceTextview=itemView.findViewById(R.id.itemPrice);

        }
    }

}
