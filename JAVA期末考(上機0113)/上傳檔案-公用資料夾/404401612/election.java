import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        
        System.out.println("中華民國總統大選，請輸入你的投票選擇(號碼) : ");
        System.out.println(" 朱阿倫 (1) ");
        int p1 = 0 ;
        System.out.println(" 蔡阿英 (2) ");
        int p2 = 0 ;
        System.out.println(" 宋阿漁 (3) ");
        int p3 = 0 ;
        System.out.println(" 廢票     (4) ");
        int p4 = 0 ;
        
        int count = 10;
        while( true ){
        	if ( count == 0 )
        		break;
        	
        System.out.println("目前您還有 " + count + " 票 ");
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
        System.out.println("大選結果統計: ");
        System.out.println(" 朱阿倫 (1) " + p1 + " 票 ");      
        System.out.println(" 蔡阿英 (2) " + p2 + " 票 ");       
        System.out.println(" 宋阿漁 (3) " + p3 + " 票 ");     
        System.out.println(" 廢票     (4) " + p4 + " 票 ");
        
	}

}
