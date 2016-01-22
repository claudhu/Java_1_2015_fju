import java.util.Scanner;
public class printf_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = new int[8] ;
Scanner input = new Scanner(System.in);
System.out.print("Please enter 8 number:");
for(int i = 0 ; i < array.length ; i++){
	array[i] = input.nextInt();
}
for(int i = 0 ; i < array.length ; i++){
	System.out.printf("%8d",array[i]);
	if(i == 3){
		System.out.printf("\n");
	}
}
		
	}

}
