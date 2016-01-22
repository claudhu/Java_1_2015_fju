import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("輸入1選(一)朱阿倫 輸入2選(二)蔡阿英 輸入3選(三)宋阿漁 ");
		int i =10;
		int u1=0,u2=0,u3=0,u4=0;
		for(i=10;i>0;i--)
		{
		System.out.print("你剩"+i+"張選票"+" 請輸入投票對象:");
		int u = input.nextInt();
		switch (u)
		{
		case 1:u1++;break;
		case 2:u2++;break;
		case 3:u3++;break;
		default:u4++;break;
		} 
		if(i==1){
			System.out.println("大選結果統計:");
			System.out.println("(一)朱阿倫"+u1+"票");
			System.out.println("(二)蔡阿英"+u2+"票");
			System.out.println("(三)宋阿漁"+u3+"票");
			System.out.println("(四)廢票"+u4+"票");
			}
		}


	}

}
