import  java.io.*;
public class OneTicket {

	public OneTicket() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
System.out.print("Please enter the tickets you want   ");
BufferedReader br =
new BufferedReader(new  InputStreamReader(System.in));
String str = br.readLine();
int num = Integer.parseInt(str);
System.out.print("Please enter  the number of it ");
String  str1 = br.readLine();
int num1 = Integer.parseInt(str1);
switch(num){    case   1 :System.out.print("the total is :" +(3000*num1));break;
case   2 :System.out.print("the total is :"+(2500*num1));break;  
case   3 :System.out.print("the total is :"+(2000*num1));break;
case   4 :System.out.print("the total is :"+(1000*num1));break; 
case   5 :System.out.print("the total is :"+(500*num1));


}
	}

}
