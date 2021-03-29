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
public class nilaimahasiswaTest {
    
    public nilaimahasiswaTest() {
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
     * Test of Nilai method, of class nilaimahasiswa.
     */
    @Test
    public void testNilai() {
        System.out.println("Nilai");
        nilaimahasiswa instance = new nilaimahasiswa();
        instance.Nilai();
       
    }

    /**
     * Test of CetakNilai method, of class nilaimahasiswa.
     */
    @Test
    public void testCetakNilai() {
        System.out.println("CetakNilai");
        nilaimahasiswa instance = new nilaimahasiswa();
        instance.CetakNilai();
        
    }

    /**
     * Test of main method, of class nilaimahasiswa.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        nilaimahasiswa.main(args);
        
    }    
}
