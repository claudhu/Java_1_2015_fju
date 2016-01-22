public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7 };

		for (int i = 0; i < array.length - 1; i++) {
			int num = array[i];
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (num > array[j])
					num = array[i];
				array[i] = array[j];
				array[j] = num;
				index = i;
				i =j;

			}
			if(index != i)
				index = i;
			num = array[i];
				
		
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d", array[i]);
		
		}
	}

}