import java.util.Scanner;

public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 9 digit:");
		int arr[] = new int[9];
		int brr[] = new int[10];
		int checknum;
		for (int i = 0; i < 9; i++) {
			arr[i] = in.nextInt();

		}
		for (int i = 0; i < 10; i++) {
			checknum = (int) ((arr[0] * 1 + arr[1] * 2 + arr[2] * 3 + arr[3]
					* 4 + arr[4] * 5 + arr[5] * 6 + arr[6] * 7 + arr[7] * 8 + arr[9] * 9) % 11);

			if (checknum == 10) {
				checknum = 'X';
				brr[9] = checknum;
				System.out.println("checknum is  "+checknum);
				System.out.printf(" ",brr[i]);
			} else {
				brr[9] = checknum;
				System.out.println("checknum is  "+checknum);
				System.out.printf("%d",brr[i]);
			}
		}

	}

	/*public static int checknum(int arr[]) 
	{ 
		int checknum; 
		int sum=0;
		for(int i=0;i<arr.length;i++) 
		{ 
			sum+=arr[0]*1+arr[1]*2+arr[2]*3
		} 
		}*/

}
