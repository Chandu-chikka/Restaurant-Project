package com.java.jdbc;


import java.sql.SQLException;
import java.util.List;

public class RestaurantShowMain {


	public static void main(String[] args) {
		RestaurantDAO dao = new RestaurantDAO();
		try {
			List<Restaurant> restaurantList = dao.showRestaurant();
			for (Restaurant restaurant : restaurantList) {
				System.out.println(restaurant);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}