

public class array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={20,8,7,50,30,90,78,12,12,100,7};
java.util.Arrays.sort(a);

int low=0;
int high=a.length-1;
int count=0;
while(high>=low){
	count++;
	int mid=(high+low)/2;
	if (a[mid]>78){
		high=mid-1;}
	else if(a[mid]==78){
		System.out.print(count);}
	else if(a[mid]<78){
		low=mid+1;}
		
}
	}

}
