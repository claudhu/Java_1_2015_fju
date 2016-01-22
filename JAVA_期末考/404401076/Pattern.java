import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn");
		int n=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i>=j)
					System.out.print("*");
				else
					System.out.print("#");
			}
		System.out.println();
		}
	}

}
