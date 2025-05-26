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
//      *   *       
//    *       *     
//  *           *   
//*               * 
//  *           *   
//    *       *     
//      *   *       
//        *


public class HollowDiamondPattern {
    
    public static void main(String[] args) {
        
        int n=5;
        
        for(int row =0;row<n;row++)
        {
            for(int col=1;col<=n*2 -1;col++)
            {
                System.out.print(col == n - row || col == n + row ? "* " : " ");
            }
            System.out.println();
        }
        
        
        for(int row = n-2;row>=0;row--)
        {
            for(int col=1;col<=n*2 -1;col++)
            {
                System.out.print(col == n - row || col == n + row ? "* " : " ");
            }
            System.out.println();
        }
    }
//    
}
