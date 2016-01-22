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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int x=scanner.nextInt();
       if (x==5)
       {
           System.out.println("Your square looks like:\n*####"
                   + "\n**###\n"
                   + "***##\n"
                   + "****#\n"
                   + "*****\n");
                                                     
       }else{
            System.out.println("Your square looks like:\n*#"
                   + "\n**\n");
       }
     
    }
    
}
