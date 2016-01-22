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
        Scanner input = new Scanner(System.in);
        System.out.println("enter three points for a triangle");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double i = Math.pow(a-c, 2)+Math.pow(b-d, 2);
        double slide1 = Math.pow(i, 0.5);
        double j = Math.pow(c-e, 2)+Math.pow(d-f, 2);
        double slide2 = Math.pow(j, 0.5);
        double k = Math.pow(a-e, 2)+Math.pow(b-f, 2);
        double slide3 = Math.pow(k, 0.5);
        double s = (slide1 + slide2 + slide3)/2;
        double g = s*(s-slide1)*(s-slide2)*(s-slide3);
        double area = Math.pow(g, 0.5);
        System.out.println("the area of the triangle:"+area);
        
    }
    
}
