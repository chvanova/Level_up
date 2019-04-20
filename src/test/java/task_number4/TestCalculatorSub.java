package task_number4;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import ru.levelup.qa.at.calculator.Calculator;

public class TestCalculatorSub extends Assert {

    private Calculator calc = new Calculator();

    @AfterSuite
    public void tearDown(){
        calc = null;
    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubDouble() {
        double minuend = 3d;
        double subtrahend = 2d;
        assertEquals(1d, calc.sub(minuend, subtrahend));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubDoubleNullMinuend(){
        double minuend = 0d;
        double subtrahend = 3d;
        assertEquals(-3d, calc.sub(minuend, subtrahend));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubDoubleNullSubtrahend(){
        double minuend = 10d;
        double subtrahend = 0d;
        assertEquals(10d, calc.sub(minuend, subtrahend));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubDoubleNullTwoNumber(){
        double minuend = 0d;
        double subtrahend = 0d;
        assertEquals(0d, calc.sub(minuend, subtrahend));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubLong() {
        long minuend = 1000L;
        long subtrahend = 100L;
        assertEquals(900L, calc.sub(minuend, subtrahend));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubLongNullMinuend(){
        long minuend = 0L;
        long subtrahend = 3L;
        assertEquals(-3L, calc.sub(minuend, subtrahend));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubLongNullSubtrahend(){
        long minuend = 3L;
        long subtrahend = 0L;
        assertEquals(3L, calc.sub(minuend, subtrahend));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubLongNullTwoNumber(){
        long minuend = 0L;
        long subtrahend = 0L;
        assertEquals(0L, calc.sub(minuend, subtrahend));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubLongMaxLenghtNumber(){
        long minuend = -9223372036854775807L;
        long subtrahend = -9223372036854775807L;
        assertEquals(0L, calc.sub(minuend, subtrahend));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSubDoubleMaxLenghtNumber(){
        long minuend = -9223372036854775807L;
        long subtrahend = -9223372036854775807L;
        assertEquals(0L, calc.sub(minuend, subtrahend));

    }
}