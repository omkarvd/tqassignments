//. Create a hashmap of Customer and Order and sort by ordrer price.
package com.question8;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Order o1 = new Order(50);
		Order o2 = new Order(70);
		Order o3 = new Order(40);
		Order o4 = new Order(60);
		HashMap<Customer, Order> cust = new HashMap<>();
		cust.put(new Customer("omkar"), o1);
		cust.put(new Customer("virat"), o3);
		cust.put(new Customer("sachin"), o2);
		cust.put(new Customer("rohit"), o4);
		for (Map.Entry<Customer, Order> en : cust.entrySet()) {
			System.out.println(en.getKey() + "  >>" + en.getValue());
		}
	}

}