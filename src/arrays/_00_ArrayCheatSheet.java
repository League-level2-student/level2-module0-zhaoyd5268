package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] ArrayCheatSheet = { "Bobby", "Joey", "Samantha", "violet" };
		// 2. print the third element in the array
		System.out.println(ArrayCheatSheet[2]);
		// 3. set the third element to a different value
		ArrayCheatSheet[2] = "Ella";
		// 4. print the third element again
		System.out.println(ArrayCheatSheet[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String ArrayCheatSheets : ArrayCheatSheet) {
			System.out.println(ArrayCheatSheets);
		}
		int smallest = 101;
		int largest = -1;
		// 6. make an array of 50 integers

		int[] fiftyintegers = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 50; i++) {
			Random random = new Random();
			fiftyintegers[i] = random.nextInt(100);

		}

		// 8. without printing the entire array, print only the smallest number in the
		// array
		for (int fiftyInteger : fiftyintegers) {

			if (fiftyInteger < smallest) {
				smallest = fiftyInteger;
			}
			if (fiftyInteger > largest) {
				largest = fiftyInteger;
			}

			System.out.println(fiftyInteger);

		}
		System.out.println(smallest);
System.out.println(largest);
		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
	}
}
