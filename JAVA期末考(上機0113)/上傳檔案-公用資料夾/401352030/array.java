import java.util.Scanner;


public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a[]={20,8,7,50,30,90,78,15,12,100,7};
		System.out.println("利用線性搜尋尋找78；請輸入78");
		int q=input.nextInt();
		int count=0;
		for(int i=0;i<=a.length-1;i++){
			if(q==a[i]){
				break;
			}
				count++;
		}
		System.out.println("1.搜尋78需要"+count+"次搜尋");
		System.out.println("PS.此搜尋結果為從0開始計算故會少算1次");
		
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
		System.out.println("2.排序後姊果為");
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
		
		
		System.out.println("利用二元搜尋尋找78；請輸入78");
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
			System.out.println("78在"+mid+"個");
			break;
			}
			else{
				low=mid+1;
			}
			count1++;
			}
		System.out.println("1.搜尋78需要"+count1+"次搜尋");
		System.out.println("PS.此搜尋結果為從0開始計算故會少算1次");
		
	}
	
}
	

		

		
	
