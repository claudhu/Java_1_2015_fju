/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class PerfectNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("the perfect numbers that are less than 10000 are");
        for (int i = 1; i <= 10000; i++) {
            int a = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    a += j;
                }
            }
            if (a == i) {

                System.out.println("" + i);
            }
        }
    }

}
