import java.util.Scanner;


public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter the three numbers :");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d=0;
    if (a>b){
    	 d =b;
    	 b =a;
    	 a=d;}
    if(b>c){
    	d=c;
    	c=b;
        b=d;}
    if(a>c){
    	d=c;
    	c=a;
    	a=d;
    }
    if (a>b){
   	 d =b;
   	 b =a;
   	 a=d;}
	System.out.println("The sorting result is as follows");
    	System.out.println(a+" "+b+" "+c);
    }
    
	}


