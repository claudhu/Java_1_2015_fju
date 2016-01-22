import java.util.Scanner;
public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the three numbers :");
		int x=input.nextInt();
		int y=input.nextInt();
		int z=input.nextInt();
		System.out.println("The sorting result is as follows:");
		if(x>y&&x>z&&y>z)
			System.out.print(z+" "+y+" "+x);
		else if(x>y&&x>z&&y<z)
			System.out.print(y+" "+z+" "+x);
		else if(y>x&&y>z&&x>z)
			System.out.print(z+" "+x+" "+y);
		else if(y>x&&y>z&&x<z)
			System.out.print(x+" "+z+" "+y);
		else if(z>y&&z>x&&x>y)
			System.out.print(y+" "+x+" "+z);
		else if(z>y&&z>x&&x<y)
			System.out.print(x+" "+y+" "+z);

	}

}
