import java.util.Scanner;


public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a[]={20,8,7,50,30,90,78,15,12,100,7};
		System.out.println("�Q�νu�ʷj�M�M��78�F�п�J78");
		int q=input.nextInt();
		int count=0;
		for(int i=0;i<=a.length-1;i++){
			if(q==a[i]){
				break;
			}
				count++;
		}
		System.out.println("1.�j�M78�ݭn"+count+"���j�M");
		System.out.println("PS.���j�M���G���q0�}�l�p��G�|�ֺ�1��");
		
		for(int i=0;i<a.length-1;i++){
			int min=a[i];
			int mini=i;
			for(int j=i+1;j<a.length;j++){
				if(min>a[j]){
					min=a[j];
					mini=j;
				}
			}
			if(mini!=i){
				a[mini]=a[i];
				a[i]=min;
			}
		}
		System.out.println("2.�Ƨǫ�n�G��");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		
		
		System.out.println("�Q�ΤG���j�M�M��78�F�п�J78");
		int key=input.nextInt();
		int low=0;
		int high=a.length-1;
		int count1=0;
		for(int i=0;i<a.length;i++){
			int mid=(low+high)/2;
			if(key<a[mid]){
				high=mid-1;						
			}
			else if (key==a[mid]){
			System.out.println("78�b"+mid+"��");
			break;
			}
			else{
				low=mid+1;
			}
			count1++;
			}
		System.out.println("1.�j�M78�ݭn"+count1+"���j�M");
		System.out.println("PS.���j�M���G���q0�}�l�p��G�|�ֺ�1��");
		
	}
	
}
	

		

		
	
