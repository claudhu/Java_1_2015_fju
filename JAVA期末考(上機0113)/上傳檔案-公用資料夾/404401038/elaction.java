import java.util.Scanner;
public class elaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("������`�Τj��A�п�J�A������:");
int num = input.nextInt();
System.out.println("(�@)�B������ \n(�G)�B�����^\n(�T)�B������ \n(�|)�B�o��");
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
System.out.println("�j�ﵲ�G�έp�G �j�ﵲ�G�έp�G\n" + "(�@)�B������  " + a + "\n(�G)�B�����^ " + b + "\n(�T)�B������  " + c + "\n(�|)�B�o�� " + d);
	}

}
