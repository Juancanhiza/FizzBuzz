import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Test
    public void returnNumberTest(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.getNumberOrFizzOrBuzz(1));
    }

    @Test
    public void returnFizzTest(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("fizz", fizzBuzz.getNumberOrFizzOrBuzz(3));
    }

    @Test
    public void returnBuzzTest(){
        fizzBuzz = new FizzBuzz();
        Assert.assertEquals("buzz", fizzBuzz.getNumberOrFizzOrBuzz(5));
    }
}
