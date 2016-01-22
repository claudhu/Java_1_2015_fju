import java.util.Scanner;
public class multi_dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
         int arry[][]=new int [4][2];
         int sum1=0;
         double av1;
         int sum2=0;
         double av2;
         int sum3=0;
         double av3;	 
         System.out.println("Enter socre:");
         for(int i=0;i<arry.length;i++)
         {
        	 for(int j=0 ;j<arry[i].length;j++)
        	 {
        		 arry[i][j]=input.nextInt();
        	 }
         }
         for(int i=0;i<arry.length;i++)
         {
        	 for(int j=0 ;j<arry[i].length;j++)
        	 {
        		 sum1+=arry[2][j];
        		
        	 } 
        	 
         }
         av1=sum1/2.;
         System.out.println("yi de ping jun fen shi "+av1);
         for(int i=0;i<arry.length;i++)
         {
        	 for(int j=0 ;j<arry[i].length;j++)
        	 {
        		 sum2+=arry[i][0];
        	 } 
         }
         av2 =sum2/4.;
         System.out.println("guowen cheng ji ping jun fen "+av2);
         for(int i=0;i<arry.length;i++)
         {
        	 for(int j=0 ;j<arry[i].length;j++)
        	 {
        		 sum3+=arry[i][j];
        	 } 
         }
         av3= sum3/8.;
         System.out.println("quan ban  ping jun fen "+av3);
	}

}
