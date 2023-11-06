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
        System.out.println("You can quit the program by entering 0"); 
        int age = 0;
        int LOWER_BOUND = 18;
        int lower = 0;
        int higher = 0;
        boolean shouldContinue = true;
        while(shouldContinue){
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND && age != 0) {
                    System.out.println(age+" is too young!!");
                } else if(age == 0){
                    shouldContinue = false;           
                }else{
                    lower = (age/2)+7;
                    if(lower < 18) lower = 18;
                    
                    higher = (age - 7) * 2;
                    
                    System.out.println("You can marry a person in the interval between "
                    + lower + " and " + higher +" years old."); 
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

