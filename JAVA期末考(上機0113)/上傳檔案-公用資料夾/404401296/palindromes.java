

import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("�п�J�^��r ");
		String a=input.next();
		boolean v=true;
		int high=a.length()-1;
		int low=0;
		
		for(;;high--,low++)
		{
			if(high<low)
				break;
			if(a.charAt(high)!=a.charAt(low))
			{
				v=false;

				break;
			}
			
			
		}
		
		if(v==false)
			System.out.println(a+"���O�^��");
		else
			System.out.println(a+"�O�^��");
	}

}
