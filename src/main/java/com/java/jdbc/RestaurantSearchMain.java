package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class RestaurantSearchMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		RestaurantDAO dao = new RestaurantDAO();
		int RestaurantId;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter RestaurantId  ");
			RestaurantId = sc.nextInt();
		}
		Restaurant restaurant = null;
		restaurant = dao.searchRestaurant(RestaurantId);
		if (restaurant!=null) {
			System.out.println(restaurant);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
