import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[4];
		System.out.printf("中国民国总统大选\n(一) 朱阿伦\n(二) 蔡阿英\n(三) 宋阿 渔\n(四) 废票\n");
		int a;
		for (int i=0; i<10; i++) {
			System.out.printf("目前你还有%d张选票,请输入你的投票选择:",Math.abs(i-10));
			a = input.nextInt();
			switch (a) {
			case 1: array[0]++; break;
			case 2: array[1]++;	break;
			case 3: array[2]++; break;
			case 4: array[3]++;
		}
		}	
			System.out.printf("大选结果统计:\n(一) 朱阿伦 %d票\n(二) 蔡阿英%d票\n(三) 宋阿 渔%d票\n(四) 废票%d票",array[0],array[1],array[2],array[3]);
		
	}
}
