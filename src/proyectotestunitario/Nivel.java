package proyectotestunitario;

public class Nivel {

    public int numeroNivel;
    public String descripcion;
    public int rangoDesde;
    public int rangoHasta;

    public Nivel(int numeroNivel, String descripcion, int rangoDesde, int rangoHasta) {
        
        
        this.numeroNivel = numeroNivel;
        
        this.descripcion = descripcion;
        
        this.rangoDesde = rangoDesde;
        
        this.rangoHasta = rangoHasta;
    }

    Nivel() {
       
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public void setNumeroNivel(int numeroNivel) {
        
        
        this.numeroNivel = numeroNivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRangoDesde() {
        return rangoDesde;
    }

    public void setRangoDesde(int rangoDesde) {
        if(rangoDesde>=0 && this.rangoHasta>rangoDesde)  // solo setea valor dentro del rango permitido.
        this.rangoDesde = rangoDesde;
    }

    public int getRangoHasta() {
         return rangoHasta;
    }

    public void setRangoHasta(int rangoHasta) {
         if(rangoHasta>=0 && this.rangoDesde<rangoHasta)// solo setea valor dentro del rango permitido.
        this.rangoHasta = rangoHasta;
    }

    
//Metodo creaNivel. Devuelve true si el objeto es creado, y false si no se creó.
    
public static boolean crearNivel(String desc, int rDesde, int rHasta) {
 boolean iscreated = false;
    
    if(rDesde>0 || rHasta>0 && rDesde<rHasta){ 
        iscreated=true;
    return iscreated;
    }
    
    
    
    if(rDesde>=1 && rHasta<=100){
    Nivel nivel = new Nivel(1, desc, rDesde, rHasta);}
    
    else if(rDesde>=101 && rHasta<=200){
    Nivel nivel = new Nivel(2, desc, rDesde, rHasta);}
    
    else if(rDesde>=201 && rHasta<=300){
    Nivel nivel = new Nivel(3, desc, rDesde, rHasta);}
    
    else if(rDesde>=301 && rHasta<=400){
    Nivel nivel = new Nivel(4, desc, rDesde, rHasta);}
    
    else if(rDesde>=401 && rHasta<=500){
    Nivel nivel = new Nivel(5, desc, rDesde, rHasta);}
    
    else if(rDesde>=501 && rHasta<=600){
    Nivel nivel = new Nivel(6, desc, rDesde, rHasta);}
    
    else if(rDesde>=601 && rHasta<=700){
    Nivel nivel = new Nivel(7, desc, rDesde, rHasta);}
    
    else if(rDesde>=701 && rHasta<=800){
    Nivel nivel = new Nivel(8, desc, rDesde, rHasta);}
    
    else if(rDesde>=801 && rHasta<=900){
    Nivel nivel = new Nivel(9, desc, rDesde, rHasta);}
    
    else if(rDesde>=901 && rHasta<=1000){
    Nivel nivel = new Nivel(10, desc, rDesde, rHasta);}
    
    
    return iscreated;
}
}
