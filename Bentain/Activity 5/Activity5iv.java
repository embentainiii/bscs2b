/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity5iv;

/**
 *
 * @author User
 */
public class Activity5iv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) 
            { System.out.print(" "); }
            for (int k = 0; k <= i*2; k++) 
            { System.out.print("*"); } 
            System.out.println(); } 
    }
    
}
