
import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Enter the word: ");
String a=input.next();
char arr[]=a.toCharArray();
int m=0;
for(int i=0;i<arr.length;i++){
	if(arr[i]!=arr[arr.length-1-i])
		m=1;
}
if (m==1)
	System.out.print("it is not palindromes");
else
	System.out.print("it is palindromes");

	}

}
