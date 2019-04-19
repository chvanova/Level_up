package task_number4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TestCalculatorDiv {

    private Calculator calc = new Calculator();

    @Test
    public void testSub() throws Exception {
        Assert.assertEquals(5, calc.sub(2,3));

    }

    @Test
    public void testSumLong() throws Exception {
        Assert.assertEquals(5, calc.sum(2l,3l));

    }
}
