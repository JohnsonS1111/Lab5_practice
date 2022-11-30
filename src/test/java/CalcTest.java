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
    public void testTimes(){
        assertEquals(24, myCalc.Times(4,6));
    }

    @After
    public void tearDown(){
    }
}