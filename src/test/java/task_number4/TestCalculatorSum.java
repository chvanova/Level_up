package task_number4;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TestCalculatorSum extends Assert {

    private Calculator calc = new Calculator();

    @AfterSuite
    public void tearDown(){
        calc = null;
    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSumlong() {
        long addent1 = 2L;
        long addent2 = 3L;
        assertEquals(5L, calc.sum(addent1, addent2));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSumlongNullFirstAddent() {
        long addent1 = 0L;
        long addent2 = 3L;
        assertEquals(3L, calc.sum(addent1, addent2));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSumlongNullTwoAddent() {
        long addent1 = 0L;
        long addent2 = 0L;
        assertEquals(0, calc.sum(addent1, addent2));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSumDouble() {
        double addent1 = 2d;
        double addent2 = 3d;
        assertEquals(5d, calc.sum(addent1, addent2));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSumDoubleNullFirstAddent(){
        double addent1 = 0d;
        double addent2 = 3d;
        assertEquals(3d, calc.sum(addent1, addent2));

    }

    @Test(groups = {"all_tests", "sum_sub"})
    public void testSumDoubleNullTwoAddent() {
        double addent1 = 0d;
        double addent2 = 0d;
        assertEquals(0d, calc.sum(addent1, addent2));

    }
}

