package com.java.jdbc;

import java.util.Scanner;
import java.sql.SQLException;

public class RestaurantUpdateMain {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Restaurant Name   ");
			restaurant.setRestaurantName(sc.next());
			System.out.println("Enter Restaurent city  ");
			restaurant.setRestaurantCity(sc.next());
			System.out.println("Enter Mobile   ");
			restaurant.setMobile(sc.next());
		}
		RestaurantDAO dao = new RestaurantDAO();
		
		try {
			System.out.println(dao.updateRestaurant(restaurant));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}