/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("請輸入一個正整數:");
        int num = input.nextInt();
        int i,j,k;
        for(i=1;i<=num;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(k=1;k<=num-i;k++){
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
    
}
