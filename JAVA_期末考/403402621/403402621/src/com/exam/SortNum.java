
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the three numbers:\n");
		int[] array1=new int[3];
		for(int i=0;i<3;i++){
			array1[i]=input.nextInt();
		}
		sort(array1);

	}
	public static int[] sort(int[] array2){
		int max=array2[0];
		int mini;
		for(int j=1;j<3;j++){
			if(array2[j]>array2[j-1]){
				max=array2[j];
				mini=array2[j-1];
			}
			else if(array2[j]<array2[j-1]){
				max=array2[j-1];
				mini=array2[j];
			}
		}
		return array2;
	}

}
