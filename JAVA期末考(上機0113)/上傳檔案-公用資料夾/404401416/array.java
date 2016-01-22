

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
		int[] mylist = {20,8,7,50,30,90,78,15,12,100,7};
		int key = 78;
		for ( int i=0 ; i<mylist.length-1 ;i++){
		 if(key==mylist[i])
		 System.out.println("在第"+(i+1)+"次找到");
			 
		}
		int currentmin = mylist[0];
		int currentminindex=0;
		for (int i = 0 ; i<mylist.length-1;i++){
	    currentmin=mylist[1];
	    currentminindex = i;
	    for (int j = 1 ; j<mylist.length ; j++){
	     if(mylist[i]>mylist[j]){
	    	 currentmin=mylist[j];
	    	 currentminindex = j;
	     }
	    }
		   
		
		}
		

	}}
