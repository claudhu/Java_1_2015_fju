import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 9 digits : ");
		int array[]=new int [9];

		array[0]=input.nextInt();
		array[1]=input.nextInt();
		array[2]=input.nextInt();
		array[3]=input.nextInt();
		array[4]=input.nextInt();
		array[5]=input.nextInt();
		array[6]=input.nextInt();
		array[7]=input.nextInt();
		array[8]=input.nextInt();
		
		int checksum = (array[0]*1+array[1]*2+array[2]*3+array[3]*4+array[4]*5+array[5]*6+array[6]*7+array[7]*8+array[8]*9)%11;
		if(checksum==10){
			
			System.out.println("The checksum is : X " );
		System.out.println("The ISBN is : "+ array[0]+""+array[1]+""+array[2]+""+array[3]+""+array[4]+""+array[5]+""+array[6]+""+array[7]+""+array[8]+""+"X");
		}
		else{
		System.out.println("The checksum is : "+ checksum);
		System.out.println("The ISBN is : "+ array[0]+""+array[1]+""+array[2]+""+array[3]+""+array[4]+""+array[5]+""+array[6]+""+array[7]+""+array[8]+""+checksum);
		}

	}

}
