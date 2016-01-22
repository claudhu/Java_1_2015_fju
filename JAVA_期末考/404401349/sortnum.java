import java.util.Scanner;
public class sortnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("please enter three numbers");
		int n1 =input.nextInt();
		int n2 =input.nextInt();
		int n3 =input.nextInt();
		System.out.println("the sorting result is as follows");
		int array [] ={n1,n2,n3};
		for (int i=0;i<=array.length-1;i++){
			int min=array[i];
			int index=i;
			for (int j=1+i;j<array.length;j++){
			if(min>array[j]){
				min=array[j];
				index=j;
			}
			}
			if(index!=array[i]){
			array[index]=array[i];
			array[i]=min;
			}
			System.out.print(" "+array[i]);
		}
		input.close();
	}

}
