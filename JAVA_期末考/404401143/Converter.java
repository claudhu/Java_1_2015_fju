import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input=new Scanner(System.in);
   
   
   int kg = input.nextInt();
   double pound =kg*2.20462 ;
      
     System.out.printf("Kilogram: "+"%2d",kg);
     System.out.println();
     System.out.printf("pound: "+"%4.2f",pound);
	}

}
