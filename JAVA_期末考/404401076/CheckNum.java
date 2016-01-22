import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter 9 digits");
		Scanner input=new Scanner(System.in);
		int total=0;
		int array[]=new int[10];
		for(int i=0;i<9;i++)
		{
			int number=input.nextInt();
		    array[i]=number;
			total+=number*(i+1);
		}
	    
		array[9]=total%11;
		int checksum=total%11;
		System.out.println("The checksum is:"+checksum);
		System.out.print("The ISBN is:");
		if(total%11!=10)
		{for(int j=0;j<10;j++)
			System.out.print(array[j]);}
		else
			{for(int j=0;j<9;j++)
			System.out.print(array[j]);
			System.out.print("X");}
		
	}

}
