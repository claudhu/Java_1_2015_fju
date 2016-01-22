

import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		
		int c1=0,c2=0,c3=0,c4=0;
		Scanner input=new Scanner(System.in);
		System.out.println("請輸入投票選項:(一)、朱阿倫 (二)、蔡阿英 (三)宋楚瑜(四)廢票你有 10 張選票 ，可以重複投 ");
		for(int i=1;i<=10;i++)
		{
			System.out.println("請輸入投票選項");
			int a=input.nextInt();
			switch(a){
				
			case 1:c1++;
				break;
				case 2:c2++;
				break;
				case 3:c3++;
				break;
				case 4:c4++;
				break;

						}


			
			System.out.println("你還有:"+(10-i)+"票");
		}
		
		System.out.println("\n投票結果");
		System.out.println("(一)、朱阿倫:"+c1);
		System.out.println("(二)、蔡阿英"+c2);
		System.out.println("(三)宋楚瑜:"+c3);
		System.out.println("(四)廢票:"+c4);

	}

}
