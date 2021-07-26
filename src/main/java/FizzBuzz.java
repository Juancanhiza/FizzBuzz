

public class FizzBuzz {

    public String getNumberOrFizzOrBuzz(int number){
        if(number%3==0){
            return "fizz";
        } else if (number%5 == 0){
            return "buzz";
        }
        return Integer.toString(number);
    }

}
