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
//* * * * 
//* * * 
//* * 
//* 

public class InvertedLeftAlignedTrianglePattern {
    
    public static void main(String[] args) {
        int n =5;
        // my way starts
//        for(int row=n;row>=1;row--)
//        {
//            for(int j=1;j<=row;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
           // my way ends
           
        for (int row = n; row >= 1; row--) {
            System.out.println("* ".repeat(row));
        }
    }
}
