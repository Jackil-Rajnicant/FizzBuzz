import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    @Test
    public void naturalNumberGreaterThanZero(){

        FizzBuzz FBInstance = new FizzBuzz();

        String result = FBInstance.fizzBuzz(28);

        assertThat(result, equalTo("28"));

    }

    @Test
    public void ifTheNumberIsDividableByThreeThenRetureFizz(){

        FizzBuzz FBInstance = new FizzBuzz();

        String result = FBInstance.fizzBuzz(6);

        assertThat(result, equalTo("fizz"));

    }

    @Test
    public void ifTheNumberIsDividableByFiveThenRetureFizz(){

        FizzBuzz FBInstance = new FizzBuzz();

        String result = FBInstance.fizzBuzz(10);

        assertThat(result, equalTo("buzz"));

    }

    @Test
    public void ifTheNumberIsDividableByFithteenThenRetureFizz(){

        FizzBuzz FBInstance = new FizzBuzz();

        String result = FBInstance.fizzBuzz(45);

        assertThat(result, equalTo("fizzbuzz"));

    }
}
