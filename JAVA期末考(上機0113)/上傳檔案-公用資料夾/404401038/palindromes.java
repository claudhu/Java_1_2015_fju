import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("�п�J�@�ӳ���A�˴���O�_���^��H");
String huiwen = input.nextLine();
int length = huiwen.length();
if(isPalindroms(length , huiwen)){
	System.out.println("�ӵ��J���^��");
}
else{
	System.out.println("�ӵ��Jbu���^��");
}
	
	}
	public static boolean isPalindroms(int length , String hui){
		for(int i = 0 ; i < (int)length / 2 ; i++){
			if(hui.charAt(i) != hui.charAt(length - i - 1)){
				return false ;
			}
		}
		return true ;
			
	}

}
