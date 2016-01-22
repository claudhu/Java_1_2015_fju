
import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[]num=new int[10];
    
    Scanner input =  new Scanner (System.in);
    System.out.print("Please enter 9 digits: ");
    
    for(int i=0;i<=num.length-2;i++)
    {num[i]= input.nextInt();
    }
  
    int total = 0;
    for(int i=0;i<=num.length-2;i++)
    {total += num[i];}
    
    if(total == num[9]&& total !=10)
    {System.out.print("The checksum is: "+ total);}
    else if (total == 10)
    {System.out.print("The checksum is: "+ "X");}
    
    
    for(int i=0;i<=num.length-1;i++)
    	System.out.print("The ISBN is: "+num[i]);
    
	}

}
