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
public class SortNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the three numbers:");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        
        if(x<y && x<z){
            System.out.printf("The sotting result is as follows: %d  %d  %d",x,y,z);
        }
            else if(x>y && x<z ){
               System.out.printf("The sotting result is as follows: %d  %d  %d",y,x,z);
            }
            else if ( x<z && z<y){
                System.out.printf("The sotting result is as follows: %d  %d  %d",x,z,y);
            }
            else if (y<z && z<x ){
                System.out.printf("The sotting result is as follows: %d  %d  %d",y,z,x);
            }
                else if (z <x && x<y){
                        System.out.printf("The sotting result is as follows: %d  %d  %d",z,x,y);
                        
                        }else if( z<y && y<x ){
                            System.out.printf("The sotting result is as follows: %d  %d  %d",z,y,x);
            }
        
    }
    
}
