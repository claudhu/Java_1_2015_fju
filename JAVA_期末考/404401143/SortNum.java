import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int [] a=new int[3];
		System.out.println("Please enter the three number : ");
		
		
		for(int i=0;i<3;i++){
		a[i]=input.nextInt();
		}
		
		for(int i=0;i<2;i++){
		int temp=a[i];
		int tempnum=i;
		
		for(int j=i+1;j<3;j++){
			if(temp>a[j]){
				temp=a[j];
				tempnum=j;
			}
		}
			if(tempnum!=i){
				a[tempnum]=a[i];
				a[i]=temp;
						
			}	
		}
		System.out.println("The sorting result is as follows:");
		for(int i=0;i<3;i++){
		System.out.print(a[i]+" " );
		}
	}

}
