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
        double side1, side2, side3, s, area;
        System.out.println("請輸入三座標:");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        double y3 = input.nextDouble();
        side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        s = (side1+side2+side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.print("面積:");
        System.out.printf("%.2f",area);

    }

}
