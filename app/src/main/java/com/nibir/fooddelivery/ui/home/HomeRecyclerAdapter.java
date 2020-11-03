package com.nibir.fooddelivery.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nibir.fooddelivery.R;
import com.nibir.fooddelivery.model.Restaurant;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.viewHolder> {

    List<Restaurant> allRestaurants;

    public HomeRecyclerAdapter(List<Restaurant> allRestaurants) {
        this.allRestaurants = allRestaurants;

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_recycler_item,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Restaurant current= allRestaurants.get(position);
        holder.restaurantName.setText(current.getRestaurantName());
        holder.restaurantDescription.setText(current.getRestaurantDescription());
        Picasso.get().load(current.getRestaurantImgUrl()).fit().into(holder.restaurantImage);

    }

    @Override
    public int getItemCount() {
       if (allRestaurants==null||allRestaurants.size()==0){
           return 0;
       }else
           return allRestaurants.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView restaurantImage;
        TextView restaurantName,restaurantDescription;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            restaurantImage= itemView.findViewById(R.id.restaurantImageView);
            restaurantName=itemView.findViewById(R.id.restaurantNameTextView);
            restaurantDescription=itemView.findViewById(R.id.restaurantDescriptionTextview);
        }
    }


}
