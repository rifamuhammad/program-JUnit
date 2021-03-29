/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author Arni
 */
import junit.framework.TestCase;
public class junitt extends TestCase {
    public void testAdd(){
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result);
    }
    
    
}
