/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starpattern;

/**
 *
 * @author HP
 */

//* * * * * 
//  * * * * 
//    * * * 
//      * * 
//        * 


public class InvertedRightAlignedTrianglePattern {
    
    public static void main(String[] args) {
        int n =5;
        for(int row=5;row>=1;row--)
        {
            for(int space=1;space<= n-row;space++)
            {
                System.out.print("  ");
            }
            for(int j =1;j<=row;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
