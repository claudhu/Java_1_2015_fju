public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 20, 8, 7, 50, 30, 90, 78, 15, 12, 100, 7 };
		System.out.println("第一題:");
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			count++;
			if (x[i] == 78) {
				System.out.println("got the number !");
				System.out.println("You find " + count + "times");
			}

		}
		System.out.println("第二題:");
		int currentMin = x[0];
	    int currentIndex = 0 ;
		for(int i = 0 ; i < x.length - 1 ; i++){
			for(int j = i + 1 ; j < x.length ; j++){
				if(currentMin > x[j]){
					currentMin = x[j];
					currentIndex = j ;
					
				}
			}System.out.printf("%3d",x[i]);
		}
		//捐捐同情分,救救小簡立!
		System.out.println();
		System.out.println("第三題:");
		int high = x.length;
		int low = 0 ;
		while(high > low){
			break;
		}
		//我會好好學陣列的!
	}

}
