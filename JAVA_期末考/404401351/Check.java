import java.util.Scanner;
public class Check {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("Please enter 9 digits:");
    int num1=input.nextInt();
    int num2=input.nextInt();
    int num3=input.nextInt();
    int num4=input.nextInt();
    int num5=input.nextInt();
    int num6=input.nextInt();
    int num7=input.nextInt();
    int num8=input.nextInt();
    int num9=input.nextInt();
    int a=(num1*1+num2*2+num3*3+num4*4+num5*5+num6*6+num7*7+num8*8+num9*9)%11;
    if(a!=10){
    System.out.print(num1+""+num2+""+num3+""+num4+""+num5+""+num6+""+num7+""+num8+""+num9+""+a);
	}
    if(a==10){
        System.out.print(num1+""+num2+""+num3+""+num4+""+num5+""+num6+""+num7+""+num8+""+num9+""+"X");
    	}
	}
}
