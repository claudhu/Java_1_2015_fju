import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("(一)、朱阿倫 :1");
		System.out.println("(二)、蔡阿英 :2");
		System.out.println("(三)、宋阿瑜 :3");
		System.out.println("(四)、廢票 :4");
		System.out.println("目前您有10張選票");
		System.out.println("請輸入候選人代號:");
		
		
		int D=0,C=0,S=0,O=0;
		for(int i=1;i<=10;i++){
			
		
		int t = input.nextInt();
		switch(t){
			case 1:D++;
				System.out.println("您還有"+(10-i)+"選票");
				break;
			case 2:C++;
				System.out.println("您還有"+(10-i)+"選票");
				break;
			case 3:S++;
				System.out.println("您還有"+(10-i)+"選票");
				break;
			case 4: O++;
				System.out.println("您還有"+(10-i)+"選票");
				break;
		}
		}
		System.out.println();
		System.out.println("大選結果統計:");
		System.out.println("(一)、朱阿倫"+D+"票");
		System.out.println("(二)、蔡阿英"+C+"票");
		System.out.println("(三)、宋阿瑜 "+S+"票");
		System.out.println("(四)、廢票 "+O+"票");
		

	}

}
