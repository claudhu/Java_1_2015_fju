
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("請輸入你的投票選擇(1~4)");
		int choose = input.nextInt();
		
		int one = 0 ;//朱阿倫
		int two = 0 ;//蔡阿英
		int three = 0 ;//宋阿魚
		int four = 0 ;//廢票
		
		for(int i = 9; i>0;i--){
			
			
				switch(choose){
				
				case 1 : one++;
				break;
				case 2 : two++;
				break;
				case 3 : three++;
				break;
				case 4 : four++;
				

				}
		System.out.println("中國民總統大選，請輸入你的投票選擇，目前你還有 "+i+ "張投票");
		System.out.println("請輸入你的投票選擇(1~4)");
		choose = input.nextInt();
		
		
		}
		
		
			
			
			System.out.println("(一).朱阿倫 " + one++ + "票");
			
			System.out.println("(二).蔡阿英 " + two++ + "票");
			
		    System.out.println("(三).宋阿魚 " + three++ + "票");
			
		    System.out.println("(四).廢票     " + four++ + "票");
		}
		}
		
		
		
	


