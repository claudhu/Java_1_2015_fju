
import java.util.Scanner;
public class SortNum {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("Please enter threes numbers:");
    int[]a=new int[3];
    int min=0;
    for(int i=0;i<a.length;i++){
    a[i]=input.nextInt();
    }
    java.util.Arrays.sort(a);
    System.out.println("The sorting result is as follows:");
    for(int i=0;i<a.length;i++){
    System.out.print(a[i]+" ");
	}
}
}