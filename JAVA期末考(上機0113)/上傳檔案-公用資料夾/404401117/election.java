
import java.util.Scanner;
public class election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 10 ;
		int a = 0 ;
		int b = 0 ;
		int c = 0 ;
		int d = 0 ;
		while(true){
		System.out.println("中華民國總統大選,請輸入你的投票選擇,目前你還有"+number+"張票選擇"
				+ "(一)朱阿倫(二)蔡阿英(三)宋阿漁(四)廢票");
		
		int i = input.nextInt();
		switch(i){
		case(1):{ a++ ; number-- ;} break ;
		case(2):{ b++ ; number-- ;} break ;
		case(3):{ c++ ; number-- ;} break ;
		case(4):{ d++ ; number-- ;} break ;
		}
		if(number == 0 )
			break ;
		
		}
		System.out.println("大選結果統計: (一)朱阿倫"+ a +"票"
				+"(二)蔡阿英" + b + "票"+
				"(三)宋阿漁  " + c +"票"+
				"(四)廢票" + d + "票");
	}
}
