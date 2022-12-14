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

    @Test
    public void testTimes(){
        assertEquals(24, myCalc.Times(4,6));
    }
    
    @Test
    public void testMinus(){
        assertEquals(6, myCalc.Minus(12,6));
    }
    
    @Test
    public void testAdd(){
        assertEquals(5, myCalc.Add(2,3));
    }

    @After
    public void tearDown(){
    }
}