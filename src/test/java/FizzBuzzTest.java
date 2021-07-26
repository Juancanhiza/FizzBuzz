import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Test
    public void returnNumberTest(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.getNumberOrFizz(1));
    }

    @Test
    public void returnFizzTest(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizz", fizzBuzz.getNumberOrFizz(3));
    }

}
