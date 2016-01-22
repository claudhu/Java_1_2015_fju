import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);	
        System.out.println("Enter the three numbers:");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if(a>b&&c<b){
        	System.out.println("The sorting result is as follows: "+a+" "+b+" "+c);
        }
        else if(c>a&&a>b){
        	System.out.println("The sorting result is as follows: "+c+" "+a+" "+b);
        }
        else if(b>a&&a>c){
        	System.out.println("The sorting result is as follows: "+b+" "+a+" "+c);
        }
        else if(c>b&&b>a){
        	System.out.println("The sorting result is as follows: "+c+" "+b+" "+a);
        }
        else if(a>c&&c>b){
        	System.out.println("The sorting result is as follows: "+a+" "+c+" "+b);
        }
        else{
        	System.out.println("The sorting result is as follows:"+b+" "+c+" "+a);
        }
        
	}

}
