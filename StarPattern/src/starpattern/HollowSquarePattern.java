package starpattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

//*****
//*   *
//*   *
//*   *
//*****


public class HollowSquarePattern {
    
    public static void main(String[] args) {
        int n =5;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.print((row == n || col ==5)  || (row ==1 || col ==1) ? "* " : "  ");
            }
            System.out.println();
        }
        
    }
}
