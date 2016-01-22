import java.util.Scanner;
public class CheckNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Please enter 9 digits:");
Scanner input = new Scanner(System.in);
int num = input.nextInt();
int yuanlai = num ;
int[] d = new int[9] ;
for(int i = 0 ; i < d.length ; i++){
	d[i] = (int)num % 10 ;
	num = (int)num / 10 ;
}
int check = 0;
for(int i = 0 ; i < d.length ; i++){
	check += d[i] * (d.length - i);
}
check = check % 11 ;
if(check == 10){
	System.out.println("The checksum is: X");
}
else{
	System.out.println("The checksum is: " + check);
}
if(check == 10){
	System.out.println("The ISBN is: " + yuanlai + "X");
}
else{
	System.out.println("The TSBN is: " + yuanlai + check);
}
		
	}

}
