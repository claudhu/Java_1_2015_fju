

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [20,8,7,50,30,90,78,15,12,100,7]
		
		int list[] = {20,8,7,50,30,90,78,15,12,100,7};
		int key = 78;
		
		//1
		for(int i = 0 ;i<11;i++){
			int j =list[i];
			
			if(key == j){
				System.out.println("總共找了"+i+"次");
			}
			
		}
		//2
		for(int m = 0;m<11;m++){
			int currentmin = list[m];
			int currentminindex = m;
			for(int n=m;n<11;n++){
				if(currentmin > list[n]){
					currentmin = list[n];
					currentminindex = n;
				}
			}
			if(currentminindex != m){
			currentminindex = m;
			currentmin = list[m];
			System.out.print(list[m]);
			}
	
	}
	

	}
	}

		
	


