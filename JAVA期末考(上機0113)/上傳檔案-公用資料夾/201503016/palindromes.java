
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�@�ӳ���A�˴���O�_���^��H ");
		String word = input.next();
		char array[] = word.toCharArray();
		int k=0;
				for(int i=0; i<array.length;i++)
				{
					if(array[i]!=array.length-1-i)
					{
				     k=1;
					}
				}
		if (k == 1)
			System.out.println("�O�j�� ");
			
		else
		    System.out.println("���O�j�� ");
			

	}

}
