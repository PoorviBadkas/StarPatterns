/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starpattern;

/**
 *
 * @author HP
 */


//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 


public class RightAlignedTrianglePattern {
    
    public static void main(String[] args) {
        int n =5;
        
        // my way starts
//        for(int row=1;row<=n;row++)
//        {
//            for(int space=1;space<= n-row;space++)
//            {
//                System.out.print("  ");
//            }
//            for(int j =1;j<=row;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//          my way end

        for (int i = 1; i <= n; i++) {
            System.out.print("  ".repeat(n - i)); // java 11+
            System.out.println("* ".repeat(i));
        }
    }
    
}
