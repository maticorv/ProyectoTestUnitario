
package proyectotestunitario;
import Vista.Principal;

public class ProyectoTestUnitario {

    public static void main(String[] args) {
       if (args.length == 0){
            Principal actual = new Principal();
            actual.setVisible(true);
            System.out.println("Pantalla principal");
       }
    
    }
    
}
