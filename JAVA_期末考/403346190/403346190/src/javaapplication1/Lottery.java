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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the numbers:");
        int x = input.nextInt();
        if (x>999 ) {
            System.out.println("error");
        }else if ( x < 100 ){
            System.out.println("error");
        }else{
        
        int c = (int)(Math .random()*900)+9;
        System.out.printf("The random number is %d",c);
        
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
        num1 = x % 100;
        num2 = x % 100 / 10;
        num3 = x /10;
        num4 = c % 100;
        num5 = c %100 /10;
        num6 = c/10;
        
        if( num1 == num4 &&  num2 == num5 && num3 == num6){
            System.out.println("You win the first prize,money award is 10000 ");
        }else 
                System.out.println("Sorry");
    
}
｝
