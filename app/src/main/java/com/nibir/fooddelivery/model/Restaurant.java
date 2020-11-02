package com.nibir.fooddelivery.model;

import java.util.List;

public class Restaurant {
    String restaurantName;
    String restaurantDescription;
    String restaurantImgUrl;
    String restaurantLocation;

    List<MenuItem> restaurantMenuList;

    public Restaurant() {
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }

    public String getRestaurantImgUrl() {
        return restaurantImgUrl;
    }

    public void setRestaurantImgUrl(String restaurantImgUrl) {
        this.restaurantImgUrl = restaurantImgUrl;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public List<MenuItem> getRestaurantMenuList() {
        return restaurantMenuList;
    }

    public void setRestaurantMenuList(List<MenuItem> restaurantMenuList) {
        this.restaurantMenuList = restaurantMenuList;
    }
}
