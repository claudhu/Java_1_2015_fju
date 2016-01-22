

import java.util.Scanner;

public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int[]myList = new int [8];
        for (int i = 0; i < myList.length;i++)
    	   myList[i]= input.nextInt();
        {
    	   
        }
        System.out.printf("%5d %5d %5d %5d", myList[0], myList[1], myList[2], myList[3]);
        System.out.println();
        System.out.printf("%5d %5d %5d %5d", myList[4], myList[5], myList[6], myList[7]);
        
        
        
        
        
        
        
        
        
        
        
	}

}
