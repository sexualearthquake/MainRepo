package com.sexualearthquake.ds.lab1;

/**
 * Created by Daniel @dukerozen on 07.10.2015.
 */
public class RestaurantApp {


    public class Dish {
        int price;
        int nutritious;
        String name;

        public Dish(int price, int nutritious, String name) {
            this.price = price;
            this.nutritious = nutritious;
            this.name = name;

        }
    }

    public String toString() {
        return String.format(
                "x dollars, Dish: y, Nutritious: z"
        );
    }
}