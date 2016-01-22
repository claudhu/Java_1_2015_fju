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
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int n = input.nextInt();
        System.out.println("your square looks like:");
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print("*");
            }
            for(int k = i;k < n-1;k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
