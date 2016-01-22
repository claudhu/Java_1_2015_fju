import java.util.Scanner;


public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("Please enter the three numbers");
		for(int i=0;i<a.length;i++){
			a[i]=input.nextInt();			
		}
		for(int b=0;b<a.length;b++){
			int min=b;
			for(int j=b+1;j<a.length;j++){
				if(a[j]<a[min]){
					a[min]=a[j];
					min=j;
				}
			}
			int temp=a[b];
			a[b]=a[min];
			a[min]=temp;
			
			
		}
		for(int k=0;k<=a.length-1;k++){
			System.out.print(a[k]+" ");
		}
		
		input.close();

	}



}
