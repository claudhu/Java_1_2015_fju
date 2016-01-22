import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int i,j,count=1,temp=0;
		int array[]={20,8,7,50,30,90,78,15,12,100,7};
		Scanner sc=new Scanner(System.in);
		int find=sc.nextInt();
		for(i=0;i<array.length;i++){
			if(find!=array[i])
				count++;
			else
				break;
		}
		System.out.println("找了"+count+"次找到");
		for(i=0;i<11;i++){
			for(j=i+1;j<11;j++){
			if(array[i]>array[j]){
				temp=array[i];
			    array[i]=array[j];
			    array[j]=temp;
			}
			}
		}
		for(i=0;i<array.length;i++)
		System.out.printf("%5d",array[i]);
		System.out.println();
		int high=10,mid,low=0;
		count=0;
		while(high>=low){
			
			mid=(low+high)/2;
			System.out.print(mid);
			if(array[mid]<find)
				{low=mid+1;
				count++;}
			else if(array[mid]>find)
				{high=mid-1;
			    count++;}
			else
				{mid=find;
			    count++;
			    break;}
		}
		System.out.println("二分法找了"+count+"次找到");
		

	}

}
