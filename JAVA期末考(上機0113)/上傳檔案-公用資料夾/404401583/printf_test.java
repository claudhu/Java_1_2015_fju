import java.util.Scanner;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter 8 numbers");
     int[]myList= new int[8];
     int count = 0;
 
     for(int i=0;i < myList.length;i++){
    	
    	 myList[i]=input.nextInt();
    	 count++;
    	 System.out.print("  "+myList[i]);
    	 if(count%4==0){
    		 System.out.println();
    	 }
    	
     }
	}

}
