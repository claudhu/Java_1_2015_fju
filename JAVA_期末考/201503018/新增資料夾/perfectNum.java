

public class perfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The perfect numbers that are less than 10000 are: ");
for(int n =1;n<=10000;n++){
	if(perfect(n)){
		System.out.println(n);
	}
}
	}
public static boolean perfect(int n){
	int total=0;
	for(int i=1;i<n;i++){
		if(n%i==0)
			total=total+i;
	}

if (total==n)
	return true;
else 
		return false;
}
}
