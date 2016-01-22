
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i = 1; i < 10000;i++){
    	for(int j = 1 ; j < i ;j++){
    		if( i % j == 0 && i != j){
    			System.out.println(i);
    		}
    	}
    }
	}

}
