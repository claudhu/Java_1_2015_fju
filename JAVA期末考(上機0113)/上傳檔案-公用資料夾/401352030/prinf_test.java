import java.util.Scanner;


public class prinf_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("½Ð¿é¤J100,1000,100000,10,200000,2,2000,200000");
		int a[]=new int [8];
		for(int i=0;i<=a.length-1;i++){
			a[i]=input.nextInt();
		}
		
		for(int i=0;i<=a.length-1;i++){
			if(a[i]%2!=0){
				System.out.printf("%12d",a[i]);	
				}
			}
		
		System.out.println(" ");
		
	
		for(int i=0;i<=a.length-1;i++){
			if(a[i]%2==0){
				System.out.printf("%12d",a[i]);
				}
			}
		
	}

}
