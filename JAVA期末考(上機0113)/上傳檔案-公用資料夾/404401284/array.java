import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		// ���@�}�C�p�U [20,8,7,50,30,90,78,15,12,100,7]
		// 2. �N�W�z�}�C�H��ܱƧ� (Selection Sort) �Ѥp�ܤj�ƦC�A����ܡH
		// 3. �H�G���j�M �k�A78 �ɡA�i��X���j�M�L�{�H

		System.out.println("���@�}�C�p�U [20,8,7,50,30,90,78,15,12,100,7]");

		int arr[] = { 20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7 };

		int key = 78;

		for (int i = 0; i <= arr.length - 1; i++) {
			int j = i + 1;
			if (arr[i] == key) {
				System.out.println("1. �Q�νu�ʷj�M��M 78 �ɡA�ݭn" + j + "���j�M");
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
		System.out.println("2. �W�z�}�C�H��ܱƧǥѤp�ܤj�ƦC�G" + Arrays.toString(arr));

		//�аݳo�O�ѩ�ĤG�D��sorting�����~�ҥH�ɭP�ĤT�D�L�k���`�B�@��?!
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
				System.out.println("3. �H�G���j�M�k��M78 �ɡA�i��" + count + "���j�M�L�{");
				break;
			} 
			else {
				low = mid + 1;
			}

	}
}
