
public class polindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("請輸入一個單詞，檢測其是否為回文?");
		
		String x = input.nextLine();
		boolean is = true;
		for(int i=x.length()-1,k=0 ; i>k ; i--,k++){
			if(x.charAt(i) != x.charAt(k)){
				is = false;
				break;
			}
			
		}
		if(is)
			System.out.println("該詞彙是回文");
		else
		    System.out.println("該詞彙不是回文");
		

	}

}
