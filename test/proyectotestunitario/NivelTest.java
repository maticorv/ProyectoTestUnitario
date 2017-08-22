
package proyectotestunitario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NivelTest {
    
    public NivelTest() {
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

/*
    @Test
    public void testGetNumeroNivel() {
        System.out.println("getNumeroNivel");
        Nivel instance = null;
        int expResult = 0;
        int result = instance.getNumeroNivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetNumeroNivel() {
        System.out.println("setNumeroNivel");
        int numeroNivel = 0;
        Nivel instance = null;
        instance.setNumeroNivel(numeroNivel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Nivel instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Nivel instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRangoDesde() {
        System.out.println("getRangoDesde");
        Nivel instance = null;
        int expResult = 0;
        int result = instance.getRangoDesde();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetRangoDesde() {
        System.out.println("setRangoDesde");
        int rangoDesde = 0;
        Nivel instance = null;
        instance.setRangoDesde(rangoDesde);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetRangoHasta() {
        System.out.println("getRangoHasta");
        Nivel instance = null;
        int expResult = 0;
        int result = instance.getRangoHasta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRangoHasta() {
        System.out.println("setRangoHasta");
        int rangoHasta = 0;
        Nivel instance = null;
        instance.setRangoHasta(rangoHasta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

*/
    @Test
    public void testCrearNivel() {
        System.out.println("crearNivel");
        String desc = "";
        int rDesde = 10;
        int rHasta = 20;
        boolean expResult = true;
        boolean result = Nivel.crearNivel(desc, rDesde, rHasta);
        assertEquals(expResult, result);

    }
    
}
