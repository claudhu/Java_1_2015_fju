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
        System.out.println("Please enter a numbers:");
        int x = input.nextInt();
        for (int i=1;i<=x;i++){
            
            for(int j=1 ;j<=i;j++){
                System.out.printf(" *");
            
            for(int k=1;k<=i;k++){
                System.out.printf(" #");
            }
        }
            System.out.println();
    }
        
    
}
}
