
import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = ((int)(Math.random()*1001));
		System.out.println("��J�@�Ӥ���100��999����");
        Scanner input = new Scanner(System.in);
		int j = input.nextInt();
	
		if(j != i )
			System.out.println("sorry");
		else if(j == i)
			System.out.println("�A�骺�O"+j+"�H���Ʀr�O"+i);
		}
		}
	
