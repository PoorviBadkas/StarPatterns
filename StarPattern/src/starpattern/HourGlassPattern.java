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
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 


public class HourGlassPattern {
    public static void main(String[] args) {
        
        int n=5;
        
//        for(int row=n;row>=1;row--)
//        {
//            for(int space=1;space <= n-row;space++)
//            {
//                System.out.print("  ");
//            }
//            
//            for(int star=1;star <= 2 * row -1;star++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        
//        for(int row=2;row<=n;row++)
//        {
//            for(int space=1;space <= n-row;space++)
//            {
//                System.out.print("  ");
//            }
//            
//            for(int star=1;star <= 2 * row -1;star++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        
//    }
    

        for(int row=n;row>=1;row--)
        {
            System.out.print("  ".repeat(n-row));
            System.out.println("* ".repeat(2 * row -1));
        }
        
        for(int row=2;row<=n;row++)
        {
            System.out.print("  ".repeat(n-row));
            System.out.println("* ".repeat(2 * row -1));
        }
        
    }
}
