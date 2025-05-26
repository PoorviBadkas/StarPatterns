/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starpattern;

/**
 *
 * @author HP
 */

//*       *
// *     * 
//  *   *  
//   * *   
//    *    
//   * *   
//  *   *  
// *     * 
//*       *


public class XPattern {
    
    public static void main(String[] args) {
        
        int n = 5;
        
        for(int i=1;i<n*2;i++)
        {
            for(int j=1;j<n*2;j++)
            {
                System.out.print( (i==j || i+j == n*2) ? "*" : " ");
            }
            System.out.println();
        }
    }
    
}
