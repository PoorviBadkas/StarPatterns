/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starpattern;

/**
 *
 * @author HP
 */

//*                 * 
//* *             * * 
//* * *         * * * 
//* * * *     * * * * 
//* * * * * * * * * * 
//* * * *     * * * * 
//* * *         * * * 
//* *             * * 
//*                 * 


public class ButterflyPattern {
    
    public static void main(String[] args) {
        
        int n = 5;
        // right aligned pyramid
//        for(int row=1;row<=n;row++)
//        {
//            for(int star=1;star<=row;star++)
//            {
//                System.out.print("* ");
//            }
//            
//            // space before new star pattern
//            for(int space=1;space<=n*2-row*2;space++)
//            {
//                System.out.print("  ");
//            }
//            
//            for(int star=1;star<=row;star++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        
//        
//        for(int row=n-1;row>=1;row--)
//        {
//            for(int star=1;star<=row;star++)
//            {
//                System.out.print("* ");
//            }
//            
//            // space before new star pattern
//            for(int space=1;space<=n*2-row*2;space++)
//            {
//                System.out.print("  ");
//            }
//            
//            for(int star=1;star<=row;star++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    
    
        for(int row=1;row<=n;row++)
        {
            System.out.print("* ".repeat(row));
            System.out.print("  ".repeat(n*2-row*2));
            System.out.println("* ".repeat(row));
        }
        
        
        for(int row=n-1;row>=1;row--)
        {
             System.out.print("* ".repeat(row));
            System.out.print("  ".repeat(n*2-row*2));
            System.out.println("* ".repeat(row));
        }
    }
    
}
