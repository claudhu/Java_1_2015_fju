
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ans = (int)(100+Math.random()*1000);
		System.out.println("�п�J�ֳz���X(�T���)");
		int guess = input.nextInt();
		
		int ansD1 = ans%100;
		int ansD2 = ans%10;
		int ansD3 = ans/10;
		
		int guessD1 = guess%100;
		int guessD2 = guess%10;
		int guessD3 = guess/10;
		
		if(ans==guess){
			System.out.println("�������X��:"+ans);
			System.out.println("���߱z���F10000��!");	
		}
		else if(ansD1==guessD2||ansD1==guessD3||ansD2==guessD1||ansD2==guessD3||ansD3==guessD1||ansD3==guessD2){
			System.out.println("�������X��:"+ans);
			System.out.println("���߱z���F8000��!");
		}
		else if(ansD2==guessD2&&ansD3==guessD3&&ansD1!=guessD1){
			System.out.println("�������X��:"+ans);
			System.out.println("���߱z���F6000��!");
		}
		else{
			System.out.println("�������X��:"+ans);
			System.out.println("Sorry!");
		}

	}

}
