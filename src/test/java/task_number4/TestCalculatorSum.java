package task_number4;
import org.testng.annotations.Test;
import org.testng.Assert;
import ru.levelup.qa.at.calculator.Calculator;

public class TestCalculatorSum {

    private Calculator calc = new Calculator();

    @Test
    public void testSumDouble() throws Exception {
        Assert.assertEquals(5, calc.sum(2,3));

    }

    @Test
    public void testSumLong() throws Exception {
        Assert.assertEquals(5, calc.sum(2l,3l));

    }
}