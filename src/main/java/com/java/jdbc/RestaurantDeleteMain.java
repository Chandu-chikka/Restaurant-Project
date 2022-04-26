package com.java.jdbc;


import java.sql.SQLException;
import java.util.Scanner;

public class RestaurantDeleteMain {

	public static void main(String[] args) {
		int RestaurantId ;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Restaurant id  ");
			RestaurantId=sc.nextInt();
		}
		RestaurantDAO dao= new RestaurantDAO();
		try {
			System.out.println(dao.deleteRestaurant(RestaurantId));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}