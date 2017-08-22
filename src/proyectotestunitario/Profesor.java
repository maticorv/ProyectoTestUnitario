
package proyectotestunitario;

import java.util.ArrayList;
import java.util.List;

public class Profesor {


public String usuario;
public String contrasenia;
public String nombre;
public int CUIL;


    public Profesor(String us, String con, String nomb, int Cuil) {
        this.usuario= us;
        this.contrasenia=con;
        this.nombre=nomb;
        this.CUIL=Cuil;
    }
   
//Metodo Alta profesor. Devuelve true si el objeto es creado, y false si no se creó.

public static boolean altaProfesor(String us, String con, String nomb, int cuil){

    boolean iscreated = true;
     
     
    if (us.length()==0) {  // valida que el usuario no sea nulo.
     iscreated = false;
     return iscreated;
     }
     if (con.length()<10){  // valida que la contraseña se mayor o igual a 10 caracteres.
     iscreated = false;
     return iscreated;
     }
   
     Profesor profesor = new Profesor(us,con,nomb,cuil);   

     
    return iscreated;
}

    public Profesor() {
    
    }


}