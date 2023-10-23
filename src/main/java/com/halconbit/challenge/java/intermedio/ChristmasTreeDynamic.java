package com.halconbit.challenge.java.intermedio;

/**
 *
 * @author Brayan Esteves
 * 
 * Example:
 * Matrix 4 x 5:
 * 
 *    *
 *   ***
 * *******
 *   |||
 */
public class ChristmasTreeDynamic {

    public static void main(String[] args) {
        
        // Declare the height of the tree.
        int height = 4;
        
        // Loop to go through all rows (Height).
        for(int row = 0; row < height; row++) {
            // Loops for the spaces.
            /**
             * Example
             * Show (height - row -1):
             * 0) 4 - 0 - 1 = 3
             * 1) 4 - 1 - 1 = 2
             * 2) 4 - 2 - 1 = 1
             * 3) 4 - 3 - 1 = 0
             */
            for(int space = 0; space < (height - row -1); space++) {
                System.out.print(" ");
            }
            // Loop for the asterisks.
            /**
             * Example:
             * Show (row * 2) + 1:
             * 0) 0 * 2 + 1 = 1
             * 1) 1 * 2 + 1 = 3
             * 2) 2 * 2 + 1 = 5
             * 3) 3 * 2 + 1 = 7
             */
            for(int astrisk = 0; astrisk < (row * 2) + 1; astrisk++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
        // Trunk.            
        int longTrunk = 1;
        for(int base = 0; base < longTrunk; base++) {
            // Loops for the spaces.
            /**
             * Example:
             * Show (height - 2):
             * 1) 4 - 2 = 2
             * 2) 4
             */
            for(int space = 0; space < (height - 2); space++) {
                System.out.print(" ");
            }
            // Trunk bars (|)                
            for(int trunk = 0; trunk < 3; trunk++) {
                System.out.print("|");
            }
            System.out.println("");
                
        }
        
    }
    
}
