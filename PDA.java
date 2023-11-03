/**
 * Permissible Dating Age program
 *
 * @author D1teri or Dima K.
 * @version 2021-06-22 Version 1.0.0
 */

import java.util.Scanner;
import java.util.InputMismatchException;



public class PDA
{
    
    /**This is the main event loop for our PDA program**/
    
    public void runEventLoop() {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int LOWER_BOUND = 0;
        while(true){
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND) {
                    System.out.println(age+" is too young!!");
                } else {
                    System.out.println("Computations go here");                
                }

            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }
    }

    
    /**The main method instantiates and runs the program**/
    
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

