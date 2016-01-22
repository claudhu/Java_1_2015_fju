

import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入一個單詞,檢測其是否為回文?");
		
		boolean isPalindromes = true ;
		String word = input.nextLine();
		char word1 = word.charAt(0);
		char word2 = word.charAt(1);
		char word3 = word.charAt(2);
		char word4 = word.charAt(3);
		
		while (word1!=word4){
			isPalindromes = false;
			break;
		}
		
		System.out.println(isPalindromes);
		
		
		
		
		
		
		
		

}}
