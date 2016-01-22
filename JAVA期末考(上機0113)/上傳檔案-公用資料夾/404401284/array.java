import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// 有一陣列如下 [20,8,7,50,30,90,78,15,12,100,7]
		// 2. 將上述陣列以選擇排序 (Selection Sort) 由小至大排列，並顯示？
		// 3. 以二元搜尋 法，78 時，進行幾次搜尋過程？

		System.out.println("有一陣列如下 [20,8,7,50,30,90,78,15,12,100,7]");

		int arr[] = { 20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7 };

		int key = 78;

		for (int i = 0; i <= arr.length - 1; i++) {
			int j = i + 1;
			if (arr[i] == key) {
				System.out.println("1. 利用線性搜尋找尋 78 時，需要" + j + "次搜尋");
				break;
			}
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = i;
				if (arr[j] < arr[i]) {
					arr[i] = arr[j];
					arr[j] = arr[temp];
				}
			}
		}
		System.out.println("2. 上述陣列以選擇排序由小至大排列：" + Arrays.toString(arr));

		//請問這是由於第二題的sorting有錯誤所以導致第三題無法正常運作嗎?!
		System.out.println(Arrays.binarySearch(arr, key));

		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) / 2;

		for (int count = 0; count < arr.length; count++)
			if (arr[mid] > arr[key]) {
				high = mid - 1;
			} 
			else if (arr[mid] == arr[key]) {
				count++;
				System.out.println("3. 以二元搜尋法找尋78 時，進行" + count + "次搜尋過程");
				break;
			} 
			else {
				low = mid + 1;
			}

	}
}
