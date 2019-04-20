package task_number4;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import ru.levelup.qa.at.calculator.Calculator;

public class TestCalculatorDiv extends Assert{

    private Calculator calc = new Calculator();

    @AfterSuite
    public void tearDown(){
        calc = null;
    }

    @DataProvider
    public Object[][] testDataLong(){
        return new Object[][]{
                {10L, calc.div(-70L, -7L)},
                {-111L, calc.div(-999L, 9L)},
                {9223372036854775807L, calc.div(9223372036854775807L, 1)},
                {-9223372036854775807L, calc.div(-9223372036854775807L, 1)},
                {9223372036854775807L, calc.mult(-1, -9223372036854775807L)},

        };
    }

    @Test(dataProvider = "testDataLong", groups = {"all_tests", "mult_div"})
    public void testDivtLong(Long expected, Long actual) {
        assertEquals(expected, actual);
    }

    @DataProvider
    public Object[][] testDataDouble(){
        return new Object[][]{
                {1.0d, calc.div(0.0000000000000001d, 0.0000000000000001d)},
                {100d, calc.div(10.0d, 0.10d)},
                {-5.88235294117647e-309d, calc.div(-1d, 1.7E+308d)},
                {-1.7E+308d, calc.div(-1.7E+308d, 1d)},


        };
    }

    @Test(dataProvider = "testDataDouble", groups = {"all_tests", "mult_div"})
    public void testDivtDouble(Double expected, Double actual) {
        assertEquals(expected, actual);
    }
}