import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        
        System.out.println("���إ����`�Τj��A�п�J�A���벼���(���X) : ");
        System.out.println(" ������ (1) ");
        int p1 = 0 ;
        System.out.println(" �����^ (2) ");
        int p2 = 0 ;
        System.out.println(" ������ (3) ");
        int p3 = 0 ;
        System.out.println(" �o��     (4) ");
        int p4 = 0 ;
        
        int count = 10;
        while( true ){
        	if ( count == 0 )
        		break;
        	
        System.out.println("�ثe�z�٦� " + count + " �� ");
            int num = input.nextInt();
            if (num == 1){
            	p1 ++ ;
            }
            if (num == 2){
            	p2 ++ ;
            }
            if (num == 3){
            	p3 ++ ;
            }
            if (num == 4){
            	p4 ++ ;
            }
            count--;
            
        }
        System.out.println("�j�ﵲ�G�έp: ");
        System.out.println(" ������ (1) " + p1 + " �� ");      
        System.out.println(" �����^ (2) " + p2 + " �� ");       
        System.out.println(" ������ (3) " + p3 + " �� ");     
        System.out.println(" �o��     (4) " + p4 + " �� ");
        
	}

}
