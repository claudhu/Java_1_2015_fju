import java.util.Scanner;
public class election {

	public election() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 10;
			System.out.println("中華民國粽統大選，請輸入你的抔票選擇，目前你還剩"+ count+"張選票  : "); 
		    System.out.println("(一)、 朱阿倫\n(二)、蔡阿英\n(三)、宋阿漁\n(四)、廢票"); 
		    
		    Scanner input = new Scanner(System.in);
		    int vote = input.nextInt();
			 switch(vote){case 1 :System.out.println("(一)、 朱阿倫 "+vote) ;break;
			case 2 : System.out.println("(二)、蔡阿英");break;
			case 3 : System.out.print("(三)、宋阿漁");break;
			case 4 : System.out.println("(四)、廢票");}
	for( count = 10;count<=0;count--){  
		System.out.print("請輸入你的選票號 : ");
		
		count--;continue;}
			
			}

}
