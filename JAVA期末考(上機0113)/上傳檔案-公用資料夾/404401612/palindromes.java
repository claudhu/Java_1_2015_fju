import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.println("�п�J�@�ӳ�r�A�˴���O�_���^��? ");
        String voc = input.next();
        
        boolean yes = true;
        for ( int i = 0 ; i < voc.length() ; i ++){
        	if ( voc.charAt(i) == voc.charAt( voc.length()- 1 - i )){
        		yes = true;
        	}
        	else 
        		yes = false;
        }
        if ( yes )
        	System.out.println("�ӵ��J���^��");	
	    else
	    	System.out.println("�ӵ��J���O�^��");
	}

}
