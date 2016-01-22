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
public class Lottery {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Please enter the number: ");
         int n =input.nextInt();
         double c =Math.random();
         System.out.print("The random number is: " +c);
         if(n==c){
             System.out.println("You win the third prize, money award is 100000");
         }
     }
}
