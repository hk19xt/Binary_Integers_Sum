package Sum_Binary;

/*This class is the Sum_Binary class. The sum of two integers will be calculated based on binary without using + or - operations. 
  The sum will be calculated by xor, carry, and &. 
  The input values will be inserted by users in the main class. */

public class Sum_Binary {

    public int sum_binary (int first_value, int second_value){

        int zero = 0;
        if(second_value==0){ //When the second value is zero, then just return the first value because there is no need to calculate.
            return first_value;
        }
        if(first_value==0){ //When the first value is zero, then return the second value as there is no need to calculate more.
            return second_value;
        }
        if(first_value==0&&second_value==0){ //When the first value and the second value are equal to zero, then result will be just zero.
            return 0;
        }

        //Until the second value hit the zero, shift the second value to the left.
        while(second_value!=zero){

            int carry_value = first_value & second_value; //If there is carry from the sum of two integers, then it stores the carry value to a variable.
            first_value = first_value^second_value; //In order to sum the two integers, the xor operation will be used.
            second_value = carry_value<<1; //After shifting the second value to the left, and again add two integers, carry_value and the second value.

        if(second_value==zero){ //If the second value hits the zero after all shifting the carries, then the sum of the output will be shown.
            return first_value;
        }
        }
        return first_value;
    }
}//Sum_Binary
