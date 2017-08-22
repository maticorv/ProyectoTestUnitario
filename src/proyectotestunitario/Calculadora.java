
package proyectotestunitario;


public class Calculadora {


public static int sumar(int a, int b) {
return a + b;
}


public static int restar(int a, int b) {
return a - b;
}


public static int multiplicar(int a, int b) {
return a * b;
}


public static int dividir(int a, int b) {
    if(b!=0){
        return a / b;
    }
    return 0;
}




public static int distribucion(int a, int b, int c, char o1, char o2) {

if(o1=='*' && o2=='+'){
return sumar(multiplicar(a, b), multiplicar(a,c));}
if(o1=='*' && o2=='-'){
return restar(multiplicar(a, b), multiplicar(a,c));}
if(o1=='/' && o2=='+'){
return sumar(dividir(a, b), multiplicar(a,c));}


return restar(dividir(a, b), multiplicar(a,c));
}
}


