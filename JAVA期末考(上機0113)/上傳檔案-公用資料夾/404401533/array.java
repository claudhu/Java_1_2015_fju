import java.util.Scanner;


public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c , n ,search ,array;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		n = input.nextline();
		array = new line[n];
	
		System.out.println("Enter "+n+ "intergers" );
		 for(c=0 ; c<n ;c++){
			 array[c]=input.nextInt();
			 System.out.println("Enter value to find");
			 search=input.nextInt();
			 for(c=0 ; c <n ; c++){
				 if(array[c]==search){
					 System.out.println(search+"is present location"+(c +1));
					 break;
				 }
				 if(c == n ){
					 System.out.println(search+"is "+);
					 
				 }
			 }
		}
}
}