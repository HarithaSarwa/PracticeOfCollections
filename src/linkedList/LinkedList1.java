package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<String>();

		cities.add("Hyderabad");
		cities.add("Delhi");
		cities.add("Banglore");
		cities.add("Chennai");
		cities.add("Mumbai");
		cities.add("Visakhapatnam");
		cities.add("Jaipur");
		cities.add("Gurgaon");
		cities.add("Pondicherry");
		cities.add("Goa");

		System.out.println(cities);

		for (String i : cities) {
			System.out.println(i);
		}
		cities.addFirst("Washington");
		cities.addLast("Dallas");
		System.out.println(cities);

		Iterator p = cities.listIterator(3);

		while (p.hasNext()) {
			System.out.println(p.next());
		}

		ListIterator i = cities.listIterator(cities.size());
		System.out.println("The LinkedList elements in the reverse direction are: ");
		while (i.hasPrevious()) {
			System.out.println(i.previous());
		}
		System.out.println(cities);
		cities.add(2, "Jammu");
		System.out.println(cities);

	}

}
