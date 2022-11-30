import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    Calc myCalc;

    @Before
    public void setUp() {
        myCalc = new Calc();
    }

    @Test
    public void testDivide(){
        assertEquals(7, myCalc.Divide(21,3));
    }

    @After
    public void tearDown(){
    }
}