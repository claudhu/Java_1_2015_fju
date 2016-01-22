

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] myList = {20,8,7,50,30,90,78,15,12,100,7};
        int key = 0;
        for(int i = 0 ; i <myList.length;i++){
        	if(key == myList[i])
        		System.out.println("在第" + i + "次找到");
        	
        		
        }
        for(int i = 0 ; i < myList.length ; i++){
        	int currentmin = myList[i];
        	int currentminindex = i;
        	for(int j = i+1; j<myList.length;j++){
        		if(currentmin > myList[j]){
        			currentmin = myList[j];
        			currentminindex = j;
        		}
        		
        		
        	
        	System.out.print(myList[i]+ " ");
        	
        	}
        	
        	
        	
        }
        
	}

}
