import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Test
    public void printNumberTest(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals(1, fizzBuzz.printNumber(1));
    }

    @Test
    public void printFizzTest(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizz", fizzBuzz.printFizz(3));
    }

}
