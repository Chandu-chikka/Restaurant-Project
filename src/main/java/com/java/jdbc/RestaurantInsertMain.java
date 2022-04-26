package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class RestaurantInsertMain {

	public static void main(String[] args) {
		Restaurant restaurant= new Restaurant();
		try (Scanner sc = new Scanner(System.in)) {
			//System.out.println("Enter Restaurant Id  ");
			//restaurant.setRestaurantId(sc.nextInt());
			System.out.println("Enter Restaurant Name  ");
			restaurant.setRestaurantName(sc.next());
			System.out.println("Enter Restaurant City  ");
			restaurant.setRestaurantCity(sc.next());
			System.out.println("Enter Mobile   ");
			restaurant.setMobile(sc.next());
		}
		RestaurantDAO dao = new RestaurantDAO();
		try {
			System.out.println(dao.addRestaurant(restaurant));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
