package com.example.hanny.recyclerviewjson.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hanny.recyclerviewjson.R;
import com.example.hanny.recyclerviewjson.model.Restaurant;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Hanny on 1/11/2017.
 */

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantHolder> {

    private ArrayList<Restaurant> mData;
    private Activity mActivity;

    public RestaurantAdapter(ArrayList<Restaurant> data, Activity activity) {
        this.mData = data;
        this.mActivity = activity;
    }

    @Override
    public RestaurantHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_restaurant, parent, false);
        return new RestaurantHolder(view);
    }

    @Override
    public void onBindViewHolder(RestaurantHolder holder, int position) {
        Restaurant restaurant = mData.get(position);

        holder.setName(restaurant.getName());
        holder.setAddress(restaurant.getAddress());
        holder.setCost("Average cost for 2: " + restaurant.getCurrency() + restaurant.getCost());
        holder.setRating(restaurant.getRating());

        Glide.with(mActivity)
                .load(restaurant.getRating())
                .into(holder.restaurantImageView);
    }

    @Override
    public int getItemCount() {
        if(mData == null)
        {
            return 0;
        }
        return mData.size();
    }

    public class RestaurantHolder extends RecyclerView.ViewHolder{

        ImageView restaurantImageView;
        TextView restaurantNameTextView;
        TextView restaurantAddressTextView;
        TextView restaurantRatingTextView;
        TextView costTextView;
        TextView distanceTextView;

        public RestaurantHolder(View itemView) {
            super(itemView);

            restaurantImageView = (ImageView) itemView.findViewById(R.id.imageview_restaurant);
            restaurantNameTextView = (TextView) itemView.findViewById(R.id.tv_restaurant_name);
            restaurantAddressTextView = (TextView) itemView.findViewById(R.id.restaurant_address_textview);
            restaurantRatingTextView = (TextView) itemView.findViewById(R.id.rating);
            costTextView = (TextView) itemView.findViewById(R.id.cost_for_two_textview);
            distanceTextView = (TextView) itemView.findViewById(R.id.restaurant_distance_textview);

        }

        public void setName (String name){restaurantNameTextView.setText(name);}
        public void setAddress (String address) {restaurantAddressTextView.setText(address);}
        public void setRating (String rating){restaurantRatingTextView.setText(rating);}
        public void setCost (String cost) {costTextView.setText(cost);}
        public void setDistance (String distance) {distanceTextView.setText(distance);}


    }
}
