import java.io.*;
public class Converter {

	public Converter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Please enter the kilogram");
   BufferedReader   br = 
		   new BufferedReader(new InputStreamReader(System.in));
     String str = br.readLine();
     double  kilogram =  Double.parseDouble(str);
     double  POUND = 2.20462*kilogram;
     System.out.println("kilogram :"+kilogram+"\nPound :" +POUND);
     
	}

}
