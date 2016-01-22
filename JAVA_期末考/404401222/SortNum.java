import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three numbers:");
		int num[] = {50,30,10};
		num[0] = input.nextInt();
		int temp = 0;
		for(int i = 0 ; i < num.length-1 ; i++){
			for(int j = i + 1 ; j < num.length ; j++){
				if(num[i] > num[j])
				temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
		System.out.println("The sorting result is as follows:");
		for(int s = 0 ; s < num.length ; s++){
			System.out.print(num[s] + " ");
		}
	}

}
