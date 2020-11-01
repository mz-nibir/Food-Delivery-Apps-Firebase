package com.nibir.fooddelivery.model;

import java.util.List;

public class Restaurant {
    String restaurentName;
    String restaurentDescription;
    String restaurentImgUrl;
    String restaurentLocation;

    List<MenuItem> restaurentMenuList;

    public Restaurant() {
    }

    public String getRestaurentName() {
        return restaurentName;
    }

    public void setRestaurentName(String restaurentName) {
        this.restaurentName = restaurentName;
    }

    public String getRestaurentDescription() {
        return restaurentDescription;
    }

    public void setRestaurentDescription(String restaurentDescription) {
        this.restaurentDescription = restaurentDescription;
    }

    public String getRestaurentImgUrl() {
        return restaurentImgUrl;
    }

    public void setRestaurentImgUrl(String restaurentImgUrl) {
        this.restaurentImgUrl = restaurentImgUrl;
    }

    public String getRestaurentLocation() {
        return restaurentLocation;
    }

    public void setRestaurentLocation(String restaurentLocation) {
        this.restaurentLocation = restaurentLocation;
    }

    public List<MenuItem> getRestaurentMenuList() {
        return restaurentMenuList;
    }

    public void setRestaurentMenuList(List<MenuItem> restaurentMenuList) {
        this.restaurentMenuList = restaurentMenuList;
    }
}
