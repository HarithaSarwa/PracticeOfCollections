package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>(); // 1. creating an array list
		colors.add("Green");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Indigo");
		colors.add("Violet");
		colors.add("Pink");
		colors.add("Orange");
		colors.add("Black");
		colors.add("Brown");

		System.out.println(colors);
		for (String j : colors) {
			System.out.println(j);
		}

//		for (int i = 0; i < colors.size(); i++) { // 2. iterate through all elements
//			System.out.println(colors.get(i));
//		}

		colors.add(0, "Red");// 3. inserting an element to first position
		System.out.println(colors);
		System.out.println(colors.get(6));// 4.retrive an element from a given list

		colors.set(4, "Sky Blue");
		System.out.println(colors);// 5. Updating an element in specific position

		String item = "Red"; // 6. to remove an element.... will remove first occurance of red
		int itemToRemove = colors.indexOf(item);
		colors.remove(item);
		System.out.println(colors);

		System.out.println(colors.contains("Pink")); // 7. Search an element

		System.out.println(colors);
		Collections.sort(colors); // 8. sorting an array list
		System.out.println(colors);

		Collections.reverse(colors);// 11. reverse elements in an arraylist
		System.out.println(colors);

		Collections.shuffle(colors); // 10. to shuffle an elements in arraylist
		System.out.println(colors);

		List<String> colors1 = new ArrayList<>(20);
		colors1.addAll(colors);
		System.out.println("New list colors1 = " + colors1); // 9. copying

		List<String> portionOfList = colors.subList(3, 6); // 12.extract a portion of array list
		System.out.println(colors);
		System.out.println(portionOfList);

		System.out.println(colors.equals(colors1));// 13. comparing two lists

		colors1.add("Maroon");

		System.out.println(colors.equals(colors1));

		System.out.println(colors);
		Collections.swap(colors, 3, 6); //14. Swap two elements
		System.out.println(colors);
		
		List<String> colors2 = new ArrayList<>();
		colors2.add("Yellow");
		colors2.add("Dark Green");
		colors2.add("Black");
		System.out.println(colors2);
		
		System.out.println(colors);
		System.out.println(colors2);
		Collections.copy(colors, colors2);//16. clone an arraylist
		System.out.println(colors);
		
		colors2.removeAll(colors2);//17. empty arraylist
		System.out.println(colors2);
		
		System.out.println("Is colors2 list is empty ? " + colors2.isEmpty());//18. is empty
		System.out.println("Is colors list is empty ? " + colors.isEmpty());
		
		System.out.println("Size of colors1 list is : "+ colors1.size());
		
//		((ArrayList<String>) colors1).trimToSize(); //
//		System.out.println("Size of colors1 after trimimg : "+ colors1.size());
//		colors1.add("xxxx");
//		System.out.println(colors1);
		
		System.out.println(colors);
		System.out.println("replacing 2nd element with dark red ");
		colors.set(1,"Dark Red");
		System.out.println(colors);
		
		colors.forEach(a -> System.out.println(a)); // lamda expression 22. 

	}

}
