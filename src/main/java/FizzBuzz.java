

public class FizzBuzz {

    public String getNumberOrFizz(int number){
        if(number%3==0){
            return "fizz";
        }
        return Integer.toString(number);
    }

}
