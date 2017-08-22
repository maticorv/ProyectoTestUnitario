//prueba de comentario 

package proyectotestunitario;


public class Alumno {

public String usuario;
public String contrasenia;
public String nombre;
public Nivel nivel;
public Profesor prof;
public int puntajeAcumulado;


//constructor.   
public Alumno(String usuario, String contrasenia, String nombre, int cuilp) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.nivel.numeroNivel =1;
        this.prof.CUIL = cuilp;
    }

//metodo crear nuevo usuario Alumno.
public static boolean altaAlumno(String us, String con, int leg, String nomb, int cuilp ){

    boolean iscreated = true;
     
     
    if (us.length()==0) {  // valida que el usuario no sea nulo.
     iscreated = false;
     return iscreated;
     }
     if (con.length()<6){  // valida que la contraseña se mayor o igual a 6 caracteres.
     iscreated = false;
     return iscreated;
     }
   
     Alumno alumno = new Alumno(us,con, nomb, cuilp);   

     return iscreated;
}

    public Alumno() {
        Nivel niv = new Nivel();
      this.nivel=niv;  
    }

//metodo cambiar contraseña.

public boolean cambiarContrasenia(String us, String cont) {

 boolean iscreated = true;
     
     
     if (cont.length()<6){  // valida que la contraseña se mayor o igual a 6 caracteres.
     iscreated = false;
     return iscreated;
     }
     
     this.contrasenia = cont;
     return iscreated;    
}

public static int calcularNuevoNivel(int puntajeActual) {
    
    if(puntajeActual>=1 && puntajeActual<=100)
    return 1;
    if(puntajeActual>=101 && puntajeActual<=200)
    return 2;
    if(puntajeActual>=201 && puntajeActual<=300)
    return 3;
    if(puntajeActual>=301 && puntajeActual<=400)
    return 4;
    if(puntajeActual>=401 && puntajeActual<=500)
    return 5;
    if(puntajeActual>=501 && puntajeActual<=600)
    return 6;
    if(puntajeActual>=601 && puntajeActual<=700)
    return 7;
    if(puntajeActual>=701 && puntajeActual<=800)
    return 8;
    if(puntajeActual>=801 && puntajeActual<=900)
        return 9;
    
    
    return 10;
   
}
}

