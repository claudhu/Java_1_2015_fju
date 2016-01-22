public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7 };
		int count = 0;
		for (int i = 0; i < 11; i++) {
			count++;
			if (array[i] == 78) {
				System.out.println("\nxu yao " + count + " ci sou xun");
			}
		}
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int minindex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					minindex = j;
				}
				if (j != i) {
					array[i] = array[minindex];
					array[i]=array[i+1];
				}
			}
			
			System.out.printf("%3d\t", array[i]);
		}
	}

}
