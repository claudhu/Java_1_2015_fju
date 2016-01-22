
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double elec[] = new double [10];
		int count =10;
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		int t4 = 0;
		
		for(int i=0;i<10;i++){
			
			System.out.println("中華民國總統大選，請輸入你的投票選擇，目前您還有"+ count +"張選票");
			System.out.println("(一)朱阿倫");
			System.out.println("(二)蔡阿英");
			System.out.println("(三)宋阿漁");
			System.out.println("(四)廢票");
			
			elec[i]=input.nextDouble();
			count--;
			if(elec[i]==1){
				t1 += 1;
			}
			else if (elec[i]==2){
				t2 += 1;
			}
			else if(elec[i]==3){
				t3 += 1;
			}
			else 
				t4 += 1;
			
			
		}
	
		
		System.out.println("大選結果統計:");
		System.out.println("(一)朱阿倫"+t1);
		System.out.println("(二)蔡阿英"+t2);
		System.out.println("(三)宋阿漁"+t3);
		System.out.println("(四)廢票"+t4);
		
	}
	
	
	

}
