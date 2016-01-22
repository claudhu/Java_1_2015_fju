import java.util.Scanner;
public class elaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("中國民總統大選，請輸入你的票數:");
int num = input.nextInt();
System.out.println("(一)、朱阿倫 \n(二)、蔡阿英\n(三)、宋阿漁 \n(四)、廢票");
System.out.println("Please enter your choice:");
int[] array = new int[num];
for(int i = 0 ; i < num ; i++){
	array[i] = input.nextInt();
}
int a = 0 , b = 0 , c =- 0 , d = 0 ;
for(int i = 0 ; i < num ; i++){
	if(array[i] == 1 ){
		a++ ;
	}
	if(array[i] == 2 ){
		b++ ;
	}
	if(array[i] == 3 ){
		c++ ;
	}
	if(array[i] == 4 ){
		d++ ;
	}
	
}
System.out.println("大選結果統計： 大選結果統計：\n" + "(一)、朱阿倫  " + a + "\n(二)、蔡阿英 " + b + "\n(三)、宋阿漁  " + c + "\n(四)、廢票 " + d);
	}

}
