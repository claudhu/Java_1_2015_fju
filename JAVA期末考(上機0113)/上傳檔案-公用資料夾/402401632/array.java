

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int[] arr = { 20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7 };

		linearSearch(arr, 78);
		SelectionSort(arr);
	}

	// linearSearch
	public static void linearSearch(int[] list, int key) {

		int count = 0;

		for (int i = 0; i < list.length; i++) {
			count += 1;

			if (key == list[i])
				break;

		}
		if (count > 10)
			System.out.println("¨S¦³§ä¨ì");
		else
			System.out.println(count);

	}

	// SelectionSort
	public static void SelectionSort(int[] list) {
		Arrays.sort(list);
		for (int j = 0; j < list.length; j++) {
			if (j == list.length - 1)
				System.out.printf("%d", list[j]);
			else
				System.out.printf("%d, ", list[j]);
		}

	}

}
