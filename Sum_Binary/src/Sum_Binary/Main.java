package Sum_Binary;

/*This is the main class.
The user can change the input integers in the hardcoded line.
The sum of two integers will be calculated without operations, such as + or -. This calculation will be implemented based on binary, xor, and carry. 
Author: Hyejin Kim
Date: 9/21/2021 */

public class Main {
    public static void main (String[] args){

        int first_v = 0; //Initialize the first integer value.
        int second_v = 0; //Initialize the second integer value.
        Sum_Binary SB = new Sum_Binary(); 
        int output = 0; //The initialization for the output sum of two integers.
        output = SB.sum_binary(2,3); //The user can change the input values here.

        System.out.println("The sum of two integers will be: " + output);

    }
}
