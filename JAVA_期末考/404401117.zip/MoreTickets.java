
import java.util.Scanner;
public class MoreTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] myList = new int[5];
		while(true){
				
		System.out.println("�п�J�����N�X");
		int number = input.nextInt();
		
		switch(number){
		case 1 : {
			System.out.println("�п�J�ƶq");
			int number2 = input.nextInt();
			myList[0] += number2 * 3000 ;
			System.out.println("���B��:" + myList[0]);}break;
		case 2 : {
			System.out.println("�п�J�ƶq");
			int number2 = input.nextInt();
			myList[1] += number2 * 2500 ;
			System.out.println("���B��:" + myList[1]);}break ;
		case 3 : {
			System.out.println("�п�J�ƶq");
			int number2 = input.nextInt();
			myList[2] += number2 * 2000 ;
			System.out.println("���B��:" +myList[2]);}break ;
		case 4 : {
			System.out.println("�п�J�ƶq");
			int number2 = input.nextInt();
			myList[3] += number2 * 1000 ;
			System.out.println("���B��:" + myList[3]);}break ;
		case 5 : {
			System.out.println("�п�J�ƶq");
			int number2 = input.nextInt();
			myList[4] += number2 * 500 ;
			System.out.println("���B��:" + myList[4]);}break;
		}	
		if(number == 0){
			System.out.println("�`�@���B��:");
			System.out.println(myList[0]+myList[1]
							  +myList[2]+myList[3]);
					break;}
					
		}
		
		
	}	
}

