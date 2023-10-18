package Java_Questions;

import java.util.HashMap;
import java.util.Map;

public class b_RomanNumbers {

	public static void main(String[] args) {

		String roman = "XL";
		int value = romanValue(roman.toUpperCase());
		System.out.println(value);
	}

	private static int romanValue(String roman) {

		Map<Character, Integer> map = storedRomanValues();
		char[] arr = roman.toCharArray();
		int sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			int val = map.get(arr[i]);
			if (i < arr.length - 1 && val < map.get(arr[i + 1])) {
				sum -= val;
			} else {
				sum += val;
			}
		}
		return sum;
	}

	private static Map<Character, Integer> storedRomanValues() {

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		return map;

	}

}
