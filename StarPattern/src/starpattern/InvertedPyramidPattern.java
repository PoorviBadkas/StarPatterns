/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starpattern;

/**
 *
 * @author HP
 */


//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 


public class InvertedPyramidPattern {
    
    public static void main(String[] args)
    {
        int n = 5;
       // my way starts
//        for(int row=n;row>=1;row--)
//        {
//            // to skip star
//            for(int space =1;space<= n-row;space++)
//            {
//                System.out.print("  ");
//            }
//            
//            for(int star=1;star<= 2 * row -1;star++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//      my way end  
        
        for(int row=n;row>=1;row--)
        {
            // to skip star
            System.out.print("  ".repeat(n-row));
            System.out.println("* ".repeat( 2 * row -1));
        }
    }
    
    
//    O(n²) in time complexity
//   O(1) in space complexity
    
}
