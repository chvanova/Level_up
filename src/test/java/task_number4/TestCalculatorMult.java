package task_number4;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import ru.levelup.qa.at.calculator.Calculator;

public class TestCalculatorMult extends Assert{

    private Calculator calc = new Calculator();

    @AfterSuite
    public void tearDown(){
        calc = null;
    }

    @DataProvider
    public Object[][] testDataLong(){
        return new Object[][]{
                {0L, calc.mult(0L, 0L)},
                {0L, calc.mult(1L, 0L)},
                {0L, calc.mult(0L, 0L)},
                {9223372036854775807L, calc.mult(1, 9223372036854775807L)},
                {-9223372036854775807L, calc.mult(1, -9223372036854775807L)},
                {9223372036854775807L, calc.mult(-1, -9223372036854775807L)},

        };
    }

    @Test(dataProvider = "testDataLong", groups = {"all_tests", "mult_div"})
    public void testMultLong(Long expected, Long actual) {
        assertEquals(expected, actual);
    }

    @DataProvider
    public Object[][] testDataDouble(){
        return new Object[][]{
                {0d, calc.mult(0d, 0d)},
                {0d, calc.mult(1d, 0d)},
                {0d, calc.mult(0d, 0d)},
                {0d, calc.mult(0.0000000000000001d, 0.0000000000000001d)},
                {1d, calc.mult(0.10d, 10d)},
                {1.7E+308d, calc.mult(1d, 1.7E+308d)},
                {-1.7E+308d, calc.mult(1d, -1.7E+308d)},
                {1.7E+308d, calc.mult(-1d, -1.7E+308d)},

        };
    }

    @Test(dataProvider = "testDataDouble", groups = {"all_tests", "mult_div"})
    public void testMultDouble(Double expected, Double actual) {
        assertEquals(expected, actual);
    }
}