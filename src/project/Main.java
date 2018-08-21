package project;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] names = new String[4];
		names[0] = "Francis";
		
		String[] items =  {"Shirt", "Clothes", "Books"};
		
		String message = "There are " + items.length + " items that Mary wants to purchase.";
		
		System.out.println(items.length);
		
		for(int i = 0; i <= 2; i++) {
			System.out.println(items[i] + ",");
			if((i + 1) == items.length) {
				System.out.println(items[i] + ".");
			}
		}
		
		int passmark = 12;
		boolean passed = false;
		int[] scores = {4,6,2,8,12,35,9};
		for (int unitScore : scores) {
			if (unitScore >= 12) {
				passed = true;
				break;
			}
		}
		
		System.out.println("At least one passed: " + passed);
		
		int[] numbers = {3,2,7,1,8};
		Arrays.fill(numbers, 0, 2, 2);
		String numberStrings = Arrays.toString(numbers);
		System.out.println(numberStrings);
		for(int number : numbers) {
			System.out.println(number);
		}
	}
}
