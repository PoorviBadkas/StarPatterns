/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starpattern;

/**
 *
 * @author HP
 *  
 */

//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
public class SquareStarPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // creative way starts
//        int n = 5;
//        int cnt = n;
//        for(int i=0;i<=n && cnt>0 ;i++)
//        {
//            if(i==n)
//            {
//                i=-1;
//                cnt--;
//                System.out.print("\n");
//            } else {
//                System.out.print("* ");
//            }
//        }
//        creative way end

        int n = 5; // Size of the square

        for (int i = 0; i < n; i++) {           // O(n)
//            for (int j = 0; j < n; j++) {       // O(n)
//                System.out.print("* ");
//            }
            System.out.println("* ".repeat(n)); //java 11 +
        }
//         Time Complexity: O(n²)
//           Space Complexity: O(1)
        
        
    }
    
}
