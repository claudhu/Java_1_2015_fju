import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    
    String a = input.next();
    String b = input.next(a);
    System.out.println("�п�J�@�ӳ���A�˴���O�_���^��? "+a);
    
    for(int i = 0; i <= 26; i++){
    	if(a == b){
    		System.out.print("�ӵ����^��");
    	}
    	else
    		System.out.print("�o���O�^��");
    }
    
    
    
	}

}
