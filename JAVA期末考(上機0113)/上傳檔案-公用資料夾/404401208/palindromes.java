import java.util.Scanner;


public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("�п�J�@�ӳ���A�˴���O�_���^�� �H");
    String letter = input.nextLine();
    for(int i = 0 ; i < letter.length();i++){
    	char l1 = letter.charAt(i);
    	char l2 = letter.charAt(letter.length()-i-1);
    	if(l1 == l2){
    	System.out.println("�ӵ��J���^��");
    	break;
    	}
    	else 
    		System.out.println("�ӵ��J���O�^��");
    	    break;
    	}
        
    }
	}


