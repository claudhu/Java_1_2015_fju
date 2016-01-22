
import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("Please enter the three numbers: ");
int []a=new int [3];
for(int i=0;i<a.length;i++){
int n=input.nextInt();
}
for (int m=0;m<a.length-1;m++){
	int currentMin=a[m];
	int currentMinIndex=m;
for(int j=m+1;m<a.length;j++){
	if(a[j]<currentMin){
		currentMin=a[j];
		currentMinIndex=j;
	
	}
}
if(currentMinIndex!=m){
	a[currentMin]=a[m];
	currentMinIndex=m;
    
	
}
}
System.out.print(a[m]);
	}

}
