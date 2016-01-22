import java.util.Scanner;

public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 10;
		int count;
		int sy;
		System.out.println("zhong guo min guo zong tong da xuan ,Plases enter your choiced number,at now you have 10  piao");
		System.out.println("(1).zhu a lun");
		System.out.println("(2).cai a ying");
		System.out.println("(3).song a yu");
		System.out.println("(4).fei piao");
		System.out.println("da xuan jie guo tong ji ru xia:");
		for (int i = 0; i < 10; i++) {
			int choiNum = input.nextInt();
			switch (choiNum) {
			case 1:
				System.out.println("Plase choice your number:");
				count = input.nextInt();
				sy = sum - count;
				System.out.println("(1).zhu a lun " + count + " piao");
				break;
			case 2:
				System.out.println("Plase choice your number:");
				count = input.nextInt();
				sy = sum - count;
				System.out.println("(2).cai a ying " + count + " piao");
				break;
			case 3:
				System.out.println("Plase choice your number:");
				count = input.nextInt();
				sy = sum - count;
				System.out.println("(3).song a ying " + count + " piao");
				break;
			default:
				count =input.nextInt();
				sy=sum-count;
				System.out.println("(4).feipiao "+sy  + "piao");
			}

		}
	}

}
