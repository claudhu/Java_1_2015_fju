import java.util.Scanner;
public class prinf_test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�п�J�K�Ӽ�:");
		int[] arr=new int[8];
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
		}
		System.out.println("��X���G:");
		for(int i=1;i<=arr.length;i++){
			System.out.print(arr[i-1]+"\t");
			if(i%4==0){
				System.out.print("\n");
			}
		}

	}

}
