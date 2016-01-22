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
public class CheckNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 9 digits: ");
        int d1= input.nextInt();
        int d2= input.nextInt();
        int d3= input.nextInt();
        int d4= input.nextInt();
        int d5= input.nextInt();
        int d6= input.nextInt();
        int d7= input.nextInt();
        int d8= input.nextInt();
        int d9= input.nextInt();
       
        int d10 = (d1+(2*d2)+(3*d3)+(4*d4)+(5*d5)+(6*d6)+(7*d7)+(8*d8)+(9*d9))%11;
        if(d10==10){
            System.out.print("The checksum is:X");
            System.out.printf("The ISBN is:%d%d%d%d%d%d%d%d%dX " ,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
        }
        else if(d10!=10) {
            System.out.print("The checksum is:" +d10);
            System.out.printf("The ISBN is:%d%d%d%d%d%d%d%d%d " ,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
        }
    }
    
}
