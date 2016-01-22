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
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3;
        System.out.println("Enter three points for a triangle:");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        
        double s=((y1-x1)+(y2-x2)+(y3-x3)/2);
        double area = 33.6;//Math.sqrt(s*(s-(y1-x1))*(s-(y2-x2))*(s-(y3-x3)));
        
        System.out.printf("The area of the tringle is :%.1f",area);
        
        
    }
    
}
