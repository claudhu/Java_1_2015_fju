

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner input = new Scanner(System.in);

		int[] rndnum = new int[1];
		int[] inputnum = new int[1];

		System.out.print("Please enter the number¡G");

		for (int i = 0; i < rndnum.length; i++) {
			rndnum[i] = rnd.nextInt(899) + 100;
		}
		
		int rndstr = rndnum[0];
		
		for (int j = 0; j < rndnum.length; j++) {
			System.out.println(rndnum[j]);
		}
		
		for (int k = 0; k < inputnum.length; k++) {
			inputnum[k] = input.nextInt();
		}

	

		System.out.print("The random number is¡G ");
		for (int l = 0; l < rndnum.length; l++) {
			System.out.printf("%d\n", rndnum[l]);
		}
		
		if (rndnum[0] == inputnum[0]) {
			System.out.println("You win the third prize, money award is 10000");
		}
		

	}

}
