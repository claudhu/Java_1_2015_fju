import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] list = new int[11];
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();
		int h = input.nextInt();
		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
for(int x = 0 ; x < list.length ; x++){
	double n = list[x];
	int m = x;

for(int w = x + 1 ; w < list.length ; w++){
	n = list[w];
	m = w;
	if(n != 1){
		n = list[j];
		m = j;
	}
	}
	
}System.out.printf("%5d", j);
	}

}
