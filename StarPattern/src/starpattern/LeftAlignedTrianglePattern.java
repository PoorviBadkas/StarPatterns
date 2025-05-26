/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starpattern;

/**
 *
 * @author HP
 */


//* 
//* * 
//* * * 
//* * * * 
//* * * * *

public class LeftAlignedTrianglePattern {
    
    public static void main(String[] args) {
        int n =5;
        // my way starts
//        for(int row =1;row<=n;row++)
//        {
//            for(int j =1;j<=row;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // my way ends
        
        for(int row =1;row<=n;row++)
        {
            System.out.println("* ".repeat(row)); // java 11 +
        }
    }
    
}
