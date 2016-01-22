import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num[]=new int[11];
		int count=0;
		System.out.println("請輸入數字:");
		for(int i=0;i<num.length;i++){
			num[i]=input.nextInt();
		}
		System.out.println("Search");
		int key=input.nextInt();
		int find=0;
		boolean notfound=true;
		for(int j=0;j<num.length;j++){
			find++;
			if(key==num[j]){
				System.out.println(key+"在第"+j+"個");
				System.out.println("共找了"+find+"次");
				notfound=false;
				break;
			}
		}
		if(notfound){
			System.out.println("not found");
		}
		
		

	}

}
