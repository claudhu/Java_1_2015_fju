import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int[] num = new int[3];
System.out.print("Please enter the three numbers:");
for(int i = 0 ; i < num.length ; i ++){
	num[i] = input.nextInt();
}
for(int i = 0 ; i < num.length ; i++){
	int b = i ;
	int temp = num[i];
	for(int j = i ; j < num.length ; j++){
		if(num[j] < temp ){
			temp = num[j];
			b = j ;
		}
	}
	num[b] = num[i];
	num[i] = temp;
	
}
System.out.print("the sorting result is:");
for(int i = 0 ; i < num.length ; i++){
	System.out.print(num[i] + " ");
}
		
	}

}
