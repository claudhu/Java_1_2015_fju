
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("�п�J�@�ӳ���A�˴���O�_���^��");
    String a=input.nextLine();
    boolean z;
    for(int i=0;i<a.length();i++){
    	if(a.charAt(i)==a.charAt(a.length()-i-1)){
    		z=true;
    	}	
    	else{
    		z=false;
    	}
    }
    if(z=true)
    	System.out.print("�ӵ��J���^��");
    if(z=false)
    	System.out.print("���O�^��");
    }
	}