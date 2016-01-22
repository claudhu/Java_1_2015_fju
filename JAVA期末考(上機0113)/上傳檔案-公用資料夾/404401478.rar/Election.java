

import java.util.Scanner;

public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("(一)、朱阿倫代號是1");
	    System.out.println("(二)、蔡阿英代號是2");
		System.out.println("(三)、宋阿漁代號是3");
		System.out.println("(四)、廢票代號是4");
		System.out.println("請輸入你所支持候選代號");
		int i = input.nextInt();
		int count = 10;
		int a= 0;
		int b= 0;
		int c= 0;
		int d= 0;
		
			if(i==1){
			count--;
			count=count--;
			a++;
			System.out.println("朱阿倫"+ a+"票");
			System.out.println("剩餘"+count+"票");
			
			}else if(i==2){
				count--;
				count=count--;
				b++;
				System.out.println("蔡阿英"+ b+"票");
				System.out.println("剩餘"+count+"票");
			}else if(i==3){
				count--;
				count=count--;
				c++;
				System.out.println("宋阿漁"+ c+"票");
				System.out.println("剩餘"+count+"票");
		}else if(i==4){
			count--;
			count=count--;
			d++;
			System.out.println("廢票"+ d+"票");
			System.out.println("剩餘"+count+"票");
			
}

}
	}