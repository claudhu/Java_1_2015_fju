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
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double a2 = input.nextDouble();
        double b2= input.nextDouble();
        double a3 = input.nextDouble();
        double b3= input.nextDouble();
        
        double S1 = ((a1-a2)*(a1-a2))+((b1-b2)*(b1-b2));
        double s1 = Math.pow(S1, 1/2);
        double S2 = ((a1-a3)*(a1-a3))+((b1-b3)*(b1-b3));
        double s2 = Math.pow(S2, 1/2);
        double S3 = ((a3-a2)*(a3-a2))+((b3-b2)*(b3-b2));
        double s3 = Math.pow(S3, 1/2);
        
        double s = (s1+s2+s3)/2;
        
        double h = (s*(s-s1)*(s-s2)*(s-s3));
        double area;
        area = Math.pow(h, 1/2);
        
        System.out.printf("The area of the triangle is %.2f", area);
    }
    
}
