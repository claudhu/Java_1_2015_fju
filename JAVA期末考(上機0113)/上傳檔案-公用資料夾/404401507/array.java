public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7 };
		
		for(int i = 0; i < array.length; i ++){
			int num = 78;
			if(num == array[i]){
				System.out.println(i+1 + "¦¸");
				
			}
		}

		for (int i = 0; i < array.length; i++) {
			int currentMin = array[i];
			int currentMinIndex = i;

			for (int j = 0 + i; j < array.length; j++) {
				if( currentMin > array[j]){
					
					currentMin = array[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i){
				array[currentMinIndex] = array[i];
				array[i] = currentMin; 
			}
			
			System.out.printf("%d\f", array[i]);
		}
	}
}
