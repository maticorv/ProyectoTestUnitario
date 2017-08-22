/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotestunitario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProfesorTest {
    
    public ProfesorTest() {
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
     * Test of addList method, of class Profesor.
     */
/*    @Test
    public void testAddList() {
        System.out.println("addList");
        Profesor p = null;
        Profesor.addList(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfesor method, of class Profesor.
     */
  /*  @Test
    public void testGetProfesor() {
        System.out.println("getProfesor");
        int cuil = 0;
        Profesor expResult = null;
        Profesor result = Profesor.getProfesor(cuil);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of altaProfesor method, of class Profesor.
     */
    @Test
    public void testAltaProfesor() {
        System.out.println("altaProfesor");
        String us = "Juan10";      
        String con = "123456789";
        String nomb = "Juan Perez";
        int cuil = 252346;
        boolean expResult = false;
        boolean result = Profesor.altaProfesor(us, con, nomb, cuil);
        assertEquals(expResult, result);
        
    }
    
}
