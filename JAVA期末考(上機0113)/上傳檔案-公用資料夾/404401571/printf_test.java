
import java.util.Scanner;
public class printf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		int enter[]={100,1000,100000,10,200000,2,2000,200000};
		int count =0;
		
		for(int i=0;i<8;i++){
			
			System.out.printf("%10d",enter[i]);
			count++;
			if(count%4==0){
				System.out.println();
			
			}
		
		}
		
		

	}

}
