
public class PerfectNum {

	public static void main(String[] args) {
		int array[] = new int[10];
		int count=0;
		for (int i=1; i<=10000; i++) {
			int a=0;
			for(int j=1; j<=i/2; j++) {
				if (i%j==0)
					a+=j;
				if (i==a) {
					count++;
					array[count]=i;
					break;
				}
			}
		}
		System.out.printf("The perfect numbers that are less than 10000 are: \n");
		for(int i=0; i<array.length; i++)
			if (array[i]!=0)
				System.out.printf("%d \n", array[i]);
	}
}
