import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void printNumberTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(1, fizzBuzz.printNumber(1));
    }

}
