import java.util.Scanner;


public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input =new Scanner(System.in);
    int []num = new int[3];
    System.out.println("Please enter three numbers: ");
    for(int i = 0; i < num.length;i++){
    	num[i] = input.nextInt();
    }
    for(int i = 0;i < num.length;i++){
    	int currentMin = num[i];
    	int currentMinIndex = i;
    	for(int j = i + 1;j < num.length;j++){
    		if(currentMin > num[j]){
    			currentMin = num[j];
    			currentMinIndex = j;
    		}
    	}
    	if(currentMinIndex != i)
    		currentMinIndex = i;
    	    num[i] = currentMin;
    }
    System.out.println("The sorting result is as follows:\n"+num+" ");
	}

}
