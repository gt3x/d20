/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class DiceTest {
    
    public DiceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumberOfDice method, of class Dice.
     */
    @Test
    public void testGetNumberOfDice() {
        Dice instance = new Dice(1, 6, 10);
        int expResult = 1;
        int result = instance.getNumberOfDice();
        System.out.println("getNumberOfDice: "+String.format("Expected Result is %d, real result: %d",expResult,result));        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail(String.format("Expected Result is %d, real result: %d",expResult,result));
    }

    /**
     * Test of setNumberOfDice method, of class Dice.
     */
    @Test
    public void testSetNumberOfDice() {
        System.out.println("setNumberOfDice");
        int numberOfDice = 0;
        Dice instance = null;
        instance.setNumberOfDice(numberOfDice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDieMax method, of class Dice.
     */
    @Test
    public void testGetDieMax() {
        System.out.println("getDieMax");
        Dice instance = null;
        int expResult = 0;
        int result = instance.getDieMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDieMax method, of class Dice.
     */
    @Test
    public void testSetDieMax() {
        System.out.println("setDieMax");
        int dieMax = 0;
        Dice instance = null;
        instance.setDieMax(dieMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBonus method, of class Dice.
     */
    @Test
    public void testGetBonus() {
        System.out.println("getBonus");
        Dice instance = null;
        int expResult = 0;
        int result = instance.getBonus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBonus method, of class Dice.
     */
    @Test
    public void testSetBonus() {
        System.out.println("setBonus");
        int bonus = 0;
        Dice instance = null;
        instance.setBonus(bonus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPool method, of class Dice.
     */
    @Test
    public void testGetPool() {
        System.out.println("getPool");
        Dice instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getPool();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of randomize method, of class Dice.
     */
    @Test
    public void testRandomize() {
        System.out.println("randomize");
        Dice instance = new Dice(1, 6, 0);
        instance.randomize();
        System.out.println(String.format("result: %d",instance.roll(false)));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of roll method, of class Dice.
     */
    @Test
    public void testRoll() {
        System.out.println("roll");
        boolean reset = false;
        Dice instance = null;
        int expResult = 0;
        int result = instance.roll(reset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rollSingle method, of class Dice.
     */
    @Test
    public void testRollSingle() {
        System.out.println("rollSingle");
        boolean reset = false;
        Dice instance = null;
        int expResult = 0;
        int result = instance.rollSingle(reset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rollMany method, of class Dice.
     */
    @Test
    public void testRollMany() {
        System.out.println("rollMany");
        boolean reset = false;
        Dice instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.rollMany(reset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
