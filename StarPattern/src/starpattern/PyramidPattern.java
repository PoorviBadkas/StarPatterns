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

public class PyramidPattern {
    
    
    public static void main(String[] args) {
        
        // my approach start
//        int n=5;
//        for(int j =0;j<n;j++)
//        {
//            for(int i=0;i<(n*2)+1;i++)
//            {
//                if( i == (n+1) || (i <= (n+1) + j && i >= (n+1) - j))
//                {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//                
//            }
//            System.out.println();
//        }
        // my approach end
        
        int n =5;
        for(int row =1;row<=n;row++)
        {
            // to skip space logic
            for(int space=1;space <= n-row;space++)
            {
                System.out.print("  ");
            }
            
            // to print number of start in a line after space
            for(int star=1;star<= 2 * row - 1; star ++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
