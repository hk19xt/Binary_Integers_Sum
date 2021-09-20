package Sum_Binary;

public class Sum_Binary {

    public int sum_binary (int first_value, int second_value){

        int zero = 0;
        if(second_value==0){
            return first_value;
        }
        if(first_value==0){
            return second_value;
        }
        if(first_value==0&&second_value==0){
            return 0;
        }

        //Until the second value hit the zero, shift the second value to the left.
        while(second_value!=zero){

            int carry_value = first_value & second_value;
            first_value = first_value^second_value;
            second_value = carry_value<<1;

        if(second_value==zero){
            return first_value;
        }
        }
        return first_value;
    }
}//Sum_Binary
