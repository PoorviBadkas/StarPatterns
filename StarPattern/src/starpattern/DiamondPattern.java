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
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 


public class DiamondPattern {
    
    public static void main(String[] args) {
        int n =5;
//        for(int row=1;row<=n;row++)
//        {
////            space before star
//            for(int space=1;space<=n-row;space++)
//            {
//                System.out.print("  ");
//            }
//            
//            for(int star=1;star<= 2* row -1;star++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        
//        // inverted 
//        for(int row=n-1;row>=1;row--)
//        {
////            space before star
//            for(int space=1;space<=n-row;space++)
//            {
//                System.out.print("  ");
//            }
//            
//            for(int star=1;star<= 2* row -1;star++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for(int row=1;row<=n;row++)
        {
//            space before star
            System.out.print("  ".repeat(n-row));
            System.out.println("* ".repeat(2* row -1));
        }
        
        // inverted 
        for(int row=n-1;row>=1;row--)
        {
//            space before star
            System.out.print("  ".repeat(n-row));
            System.out.println("* ".repeat(2* row -1));
        }

            
    }
    
}
