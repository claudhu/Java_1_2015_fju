
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int G=0;
		for(int i=1;i<=10000;i++){
			for(int j=2;j<=i/2;j++){
				G = i%j;
				if(G==0){
					System.out.print(G);
				}
			}
		}

	}

}
