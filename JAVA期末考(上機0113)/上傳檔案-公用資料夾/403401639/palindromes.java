
import java.util.*;
public class palindromes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("�п�J�@�ӳ���A�˴���O�_���^��?\n");
		String a = input.nextLine();
		boolean p=true;
		for(int i=0; i<a.length(); i++){
			if(a.charAt(i)==a.charAt(a.length()-(i+1)))
				p=true;
				else{
					p=false;
					break;
				}
				
		
	}
		if(p==true)
			System.out.printf("%s�O�^��",a);
		else
			System.out.printf("%s���O�^��",a);
	}
}
