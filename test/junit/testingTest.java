/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arni
 */
public class testingTest {
    
    public testingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SymSub method, of class testing.
     */
    @Test
    public void testSymSub() {
        System.out.println("SymSub");
        int x1 = 4;
        int x2 = 5;
        int expResult = 10;
        int result = testing.SymSub(x1, x2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class testing.
     */
    @Test
    public void testMain() {
       
    }
    
}
