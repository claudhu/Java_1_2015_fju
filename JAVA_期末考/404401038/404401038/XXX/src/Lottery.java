import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int lottery =(int)( Math.random() * 1000);
String zhongjiang = "" + lottery;
System.out.print("Please enter the number:");
Scanner input = new Scanner(System.in);
String num = input.next();
char[] a = new char[3];
char[] b = new char[3];
for(int i = 0 ; i < a.length ; i ++){
	a[i] = zhongjiang.charAt(i);
}
for(int i = 0 ; i < a.length ; i ++){
	b[i] = num.charAt(i);
}
System.out.println("The random number is:" + zhongjiang);
if(zhongjiang.equals(num)){
	System.out.println("You win the first prize,money award is 10000");
}
else if(erdeng(a,b)){
	System.out.println("You win the second prize,money award is 8000");
}
else if(a[1] == b[1] && a[2] == b[2]){
	System.out.println("You win the therd prize,money award is 6000");
}
else{
	System.out.println("No win");
}
		
	}
	public static boolean erdeng(char[] a , char[] b){
		int temp;
		for(int i = 0 ; i < a.length ; i ++){
			int count = 0 ;
			for(int j = i ; j < b.length ; j++){
				if(a[i] == b[j]){
					count++ ;
					temp = b[i];
					b[i] = b[j];
					break;
					
				}
			}
			if (count == 0){
				return false ;
			}
		}
		return true; 
	}

}
