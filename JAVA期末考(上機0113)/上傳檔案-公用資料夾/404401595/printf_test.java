import java.io.*;
public class printf_test {

	public printf_test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
     System.out.print("Please enter 8 integer : ");
     BufferedReader  br = 
    		 new BufferedReader(new InputStreamReader(System.in));
     String  num1 = br.readLine();
     String  num2 = br.readLine();
     String  num3 = br.readLine();
     String  num4 = br.readLine();
     String  num5 = br.readLine();
     String  num6 = br.readLine();
     String  num7 = br.readLine();
     String  num8 = br.readLine();
     int number1 = Integer.parseInt(num1);
     int number2 = Integer.parseInt(num2);
     int number3 = Integer.parseInt(num3);
     int number4 = Integer.parseInt(num4);
     int number5 = Integer.parseInt(num5);
     int number6 = Integer.parseInt(num6);
     int number7 = Integer.parseInt(num7);
     int number8 = Integer.parseInt(num8);
     System.out.printf("%30d",   number1,  number2,  number3,      number4);
     System.out.printf("%30d",number5,     number6,    number7,  number8);
     
     
	}

}
