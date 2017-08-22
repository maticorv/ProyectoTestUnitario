
package proyectotestunitario;


public class Ejercicio {

public int codEj;
public String expresion;
public int resultado;
public Nivel nivelEj;
public int puntaje;



    public Ejercicio(int codEj, String expresion, int resultado, Nivel nivelEj, int calificacion) {
        this.codEj = codEj;
        this.expresion = expresion;
        this.resultado = resultado;
        this.nivelEj = nivelEj;
        this.puntaje = calificacion;
    }

    public Ejercicio() {
        Nivel nivel = new Nivel();
        
        this.nivelEj= nivel;
        
        
    }


}
