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
//* * * * * * * * *
//

public class HollowPyramidPattern {
    
    public static void main(String[] args) {
        
        
        int n=5;
        for(int row=0;row<n;row++)
        {
            for(int col=1;col<=n*2 -1;col++)
            {
                if(col == n-row || col == n+row || row == n -1)
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
