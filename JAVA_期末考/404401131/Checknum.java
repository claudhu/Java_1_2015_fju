

import java.util.Scanner;

public class Checknum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("please enter 9 digits :");
		int list[]=new int[9];
		for(int i =0;i<list.length;i++){
			list[i]=input.nextInt();
		}
		int x = ((list[0]*1)+(list[1]*2)+(list[2]*3)+(list[3]*4)+(list[4]*5)+(list[5]*6)+(list[6]*7)+(list[7]*8)+(list[8]*9))%11;
		if(x==10){
			System.out.println("the checksum is : x ");
			System.out.print("the ISBN is :");
			for(int i =0;i<list.length;i++){
				System.out.print(list[i]);}
				System.out.print("x");
		}
		else{
		System.out.println("the checksum is : "+x);
		System.out.print("the ISBN is :");
		for(int i =0;i<list.length;i++){
		System.out.print(list[i]);}
		System.out.print(x);
		}
	}
}