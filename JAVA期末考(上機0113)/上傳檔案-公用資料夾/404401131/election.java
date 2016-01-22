

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int list[]=new int[10];
		int count=10;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("い地チ瓣羆参匡叫块щ布匡拒");
		System.out.println("1.Χ");
		System.out.println("2.讲璣");
		System.out.println("3.Ш寒");
		System.out.println("4.紀布");

		for(int i =0;i<list.length;i++){
			
			list[i]=input.nextInt();
			if(list[i]==1){
				a++;
			}
			else if(list[i]==2){
				b++;}
			else if(list[i]==3){
				c++;
			}
			else if(list[i]==4){
				d++;
			}
		int x=0;
		x=count-(i+1);
			System.out.println("ヘ玡临Τ"+x+"布");
			
		}
		System.out.println("1.Χ"+a+"布");
		System.out.println("2.讲璣"+b+"布");
		System.out.println("3.Ш寒"+c+"布");
		System.out.println("4.紀布"+a+"布");




	}

}
