

public class array {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = new int[11];
		myList[0] = 20 ;
		myList[1] = 8 ;
		myList[2] = 7 ;
		myList[3] = 50 ;
		myList[4] = 30 ;
		myList[5] = 90 ;
		myList[6] = 78 ;
		myList[7] = 15 ;
		myList[8] = 12 ;
		myList[9] = 100 ;
		myList[10] = 7 ;
		
		for(int i = 0 ; i < myList.length ; i++){
			
			if(myList[i]== 78){
				System.out.println("78找了"+ i+"次") ;
				
			}
		}
		System.out.println("大小順序是");
		for(int i = 0 ; i < myList.length ; i++){
			int currentmin = myList[i];
			int currentminindex = i ;
			
			for(int j = i+1 ; j < myList.length ; j++){
				if(currentmin > myList[j]){
					currentmin = myList[j];
					currentminindex = j ;
			}
			}
			if(currentminindex != i){
				myList[currentminindex] =myList[i];
				myList[i] = currentmin ; }
			System.out.printf("%4d",currentmin);
		}
		
		
		
 	}

}
