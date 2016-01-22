/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
/**
 *
 * @author user
 */
public class SortNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0, max=0, mid=0;
        System.out.println("Please enter the three numbers :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if(a<b&&b<c){           
            min = a;
            mid = b;
            max = c;
            System.out.printf("The sorting result is as follows: %2d, %2d, %2d\n ", min,mid,max);
        }
        else if(a<c&&c<b){
            min = a;
            mid = c;
            max = b;
            System.out.printf("The sorting result is as follows: %2d, %2d, %2d\n ", min,mid,max);
        }
        else if(b<a&&a<c){
            min = b;
            mid = a;
            max = c;
            System.out.printf("The sorting result is as follows: %2d, %2d, %2d\n ", min,mid,max);
        }
        else if(b<c&&c<a){
            min = b;
            mid = c;
            max = a;
            System.out.printf("The sorting result is as follows: %2d, %2d, %2d\n ", min,mid,max);
        }
        else if(c<a&&a<b){
            min = c;
            mid = a;
            max = b;
            System.out.printf("The sorting result is as follows: %2d, %2d, %2d\n ", min,mid,max);
        }
        else if(c<b&&b<a){
            min = c;
            mid = b;
            max = a;
            System.out.printf("The sorting result is as follows: %2d, %2d, %2d\n ", min,mid,max);
        }
    }
    
}
