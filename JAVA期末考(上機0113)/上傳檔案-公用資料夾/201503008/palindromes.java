


import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�п�J�@�ӳ���A�˴���O�_���^��H");
		String word = input.next();
		char array[] = word.toCharArray();
		int flag =0;
		for(int i =0; i<array.length ;i++)
		{
			if(array[i] != array[array.length-1-i])
			{
				flag =1;
			}
		}

		if(flag == 0)
		{
			System.out.println("�O�^��");
		}
		else
			System.out.println("���O�^��");
	}

}
