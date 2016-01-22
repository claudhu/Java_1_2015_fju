

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 10;
		int pt;
		int people1 = 0, people2 = 0, people3 = 0, people4 = 0;

		System.out
				.printf("%s%s%s%s", "Χ\n", "讲璣\n", "Ш寒\n", "紀布\n");
		for (int i = -8; i <= count; i++) {
			System.out.println("い瓣チ羆参匡叫块щ布ヘ玡眤临Τ " + count + " 眎匡布");
			pt = input.nextInt();
			switch (pt) {
			case 1:
				people1 +=1;
				break;
			case 2:
				people2 +=1;			
				break;
			case 3:
				people3 +=1;
				break;
			case 4:
				people4 +=1;
				break;

			default:
				break;
			}
			count -= 1;
		}
		System.out.println("Χ" + people1 +"布\n"+ "讲璣" + people2
				+"布\n"+ "Ш寒" + people3 +"布\n"+ "紀布" + people4+"布");
	}
}
