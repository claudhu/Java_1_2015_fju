

import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter the number : ");
		int num = input.nextInt();
		int rn = (int) (100 + Math.random() * 999);
		int a = 0, b = 0, c = 0, rn2 = rn, num2 = num;
		if (rn - num == 0)
			a = 1;
		else if (Math.abs(rn - num) % 100 == 0)
			a = 2;
		else {
			for (int i = 0; i < 3; i++) {
				c = num2 % 10;
				for (int j = 0; j < 3; j++) {
					b = rn2 % 10;
					if (b - c == 0) {
						a++;
						break;
					}
					rn2 /= 10;
				}
				num /= 10;
			}
		}
		System.out.printf("The random number is :%d\n", rn);
		switch (a) {
		case 1:
			System.out.printf("You win the third peize, money award is 10000");
			break;
		case 2:
			System.out.printf("You win the third peize, money award is 6000");
			break;
		case 3:
			System.out.printf("You win the third peize, money award is 8000");
			break;
		}
		if(a!=1 || a!=2 || a!=3)
			System.out.printf("Sorry!");

	}
}
