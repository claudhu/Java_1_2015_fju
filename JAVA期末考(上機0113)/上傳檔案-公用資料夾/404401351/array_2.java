

public class array_2 {
	public static void main(String[] args) {
		int a[]={20,8,7,50,30,90,78,15,12,100,7};
		int min=a[0];
		int minindex=0;
		for(int x=1;x<a.length;x++){
			
			if(a[x]<min){
				min=a[x];
				minindex=x;
			}
			if(minindex!=0){
				a[minindex]=a[x];
				a[x]=min;
			}
			
		}
		for(int x=0;x<a.length;x++){
		System.out.print(a[x]+" ");
		}
	}
	}