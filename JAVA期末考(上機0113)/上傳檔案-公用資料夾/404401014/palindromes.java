import java.util.Scanner;
public class palindromes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("请输入一个单字,检查其是否迴文\n");
		String word = input.nextLine();
		int array[] = new int[word.length()];
		for (int i=0; i<array.length; i++)
			array[i]=word.charAt(i);
		for (int i=0; i<array.length/2; i++) {
			if (array[i]!=array[(array.length-1)-i]) {
				System.out.printf("%s不是迴文",word);
				break;
			}
			if (i==(array.length/2)-1)
				System.out.printf("%s是迴文",word);
		}
		
	}
}
