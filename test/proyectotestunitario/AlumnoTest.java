
package proyectotestunitario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlumnoTest {
        
    
    @Test
        public void CalcularNivel() {
        System.out.println("calcular nivel");
        int puntajeActual = 250;
        int expResult = 3;
        int result = Alumno.calcularNuevoNivel(puntajeActual);
        assertEquals(expResult, result);
        
    }
            
            
}
    
