package Java_Questions;

import java.util.Arrays;

public class a_ShuffleArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 3;

		int[] result = shuffle(arr, n);
		System.out.println(Arrays.toString(result));
	}

	private static int[] shuffle(int[] arr, int n) {
		int[] ans = new int[arr.length];
		int end = n;
		int k = -1;
		int j = n;
		for (int i = 0; i < arr.length; i++) {
			if (i < end) {
				ans[++k] = arr[i];
				ans[++k] = arr[j++];
			}

			if (i == arr.length - 1)
				ans[k] = arr[i];
		}
		return ans;
	}

}
