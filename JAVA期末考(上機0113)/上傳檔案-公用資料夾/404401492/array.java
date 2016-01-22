
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] myList = {20,8,7,50,30,90,78,15,12,100,7};
    int key = 78;
    for (int i = 0 ; i<myList.length-1;i++){
    	if(key==myList[i])
    			System.out.println("在第"+(i+1)+"次找到");

    }
    for (int i =0 ; i<myList.length;i++){
    	int currentMin =myList[i];
    	int currentMinindex = i;
    	for(int j = i+1 ; j <myList.length;j++ ){
    	if(currentMin>myList[j])
    		currentMin = myList[j];
    		currentMinindex = j;
    		

    	   	
        	
        	}if (currentMinindex != i){
        		currentMinindex = i;

        	
        	}
	
	
        System.out.print(currentMin+" ");
    	
    }

    
    
	}

	}
