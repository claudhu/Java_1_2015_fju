
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("輸入三個數字:");
		
		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
	
		if(i > j && j > k)
			System.out.print(i +"\t"+ j +"\t"+ k);
		else if(i > k && k > j)
		    System.out.print(i +"\t"+ k +"\t"+ j);
		else if(j > i && i > k)
			System.out.print(j +"\t"+ i +"\t"+ k);
		else if(j > k && k > i)
			System.out.print(j +"\t"+ k +"\t"+ i);
		else if(k > i && i > j)
			System.out.print(k +"\t"+ i +"\t"+ j);
		else
			System.out.print(k +"\t"+ j +"\t"+ i);
	}
	
	
}
