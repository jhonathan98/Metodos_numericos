
package metodobiseccion2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MetodoBiseccion2 {    
    
    public static void main(String[] args) {
        long inicio, fin, tiempo;
        double a = 0;
        double b = 0;
        double epsilon = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Señor usuario se le informa que este programa es para la aplicacion");
        System.out.println("del metodo de bisección en cual deberá ingresar algunos datos");
        System.out.println("de los cuales no podrá ingresarlos erroneamente ya que deberá");
        System.out.println("volver a empezar todo este proceso...");
        System.out.println("");
        System.out.println("");
        System.out.println("por favor señor usuario ingrese el valor de la primera 'X'");      
        try {
            double x1 = leer.nextDouble();
            a = x1;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        System.out.println("por favor señor usuario ingrese el valor de la segunda 'X'");
        try {
            double x2 = leer.nextDouble();
            b = x2;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        System.out.println("por favor señor usuario ingrese el valor del epsilon ");
        try {
            double E = leer.nextDouble();
            epsilon = E;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        double c=0;
        inicio = System.currentTimeMillis();
        double fa = ((Math.log((Math.pow(a, 2))+1))/(Math.log(Math.E)))-(Math.pow(Math.E,(a/2)))*Math.cos((Math.PI*a));
        double fb = ((Math.log((Math.pow(b, 2))+1))/(Math.log(Math.E)))-(Math.pow(Math.E,(b/2)))*Math.cos((Math.PI*b));
        int iterar=0;
        while(error(a, b)>epsilon){
            
            double error = error(a,b);
            if(fa*fb<0){
                c=(a+b)/2;
                if(error(a, b)>epsilon){
                    if(TeoremaBolzano(a, c)==true){
                        b=c;
                        iterar++;
                    }else{
                        if(TeoremaBolzano(c, b)==true){
                            a=c;
                            iterar++;
                        }
                    }/*
                    if((funcion(c)*funcion(a))>0){
                        a=c;
                        iterar++;
                    }else{
                        if((funcion(c)*funcion(a))>0){
                            b=c;
                            iterar++;
                        }
                    }*/
                    
                }else{
                    System.out.println("terminamos");
                }               
            
            }else{
                System.out.println("numeros incorrectos, no cumple el teorema de bolzano");
                epsilon=error;
                System.out.println("POR FAVOR VUELVA A EJECUTAR EL PROGRAMA");
            }
            System.out.println("-------------------------------------------");
            //System.out.println("las iteraciones fueron: "+iterar);
            System.out.println("el valor de error es: "+error);
            System.out.println( "el valor de a: "+a+" el valor de b: "+b);
        }
        System.out.println("________________________________________");
        System.out.println("El numero de iteraciones fueron :"+iterar);
        fin = System.currentTimeMillis();
        tiempo = fin-inicio;
        System.out.println("el tiempo que demoró fue: "+tiempo+" milisegundos");
        leer.next();
    }
     
    
    private static boolean TeoremaBolzano(double a,double b){
        //double fa = (Math.pow(Math.E,(-a))-((Math.log(a))/(Math.log(Math.E))));
        //double fb = (Math.pow(Math.E,(-b))-((Math.log(b))/(Math.log(Math.E))));
        double fa = ((Math.log((Math.pow(a, 2))+1))/(Math.log(Math.E)))-(Math.pow(Math.E,(a/2)))*Math.cos((Math.PI*a));
        double fb = ((Math.log((Math.pow(b, 2))+1))/(Math.log(Math.E)))-(Math.pow(Math.E,(b/2)))*Math.cos((Math.PI*b));
        if((fa*fb)<0){
            return true;
        }else{
            return false;
        }
    }
    public static double funcion(double j){
        double fx = ((Math.log((Math.pow(j, 2))+1))/(Math.log(Math.E)))-(Math.pow(Math.E,(j/2)))*Math.cos((Math.PI*j));
        return fx;        
    }
  
   
   private static double error(double a, double b){
       double error = 0;
       error = Math.abs(a-((a+b)/2));
       return error;
   }
   
   /*
   if(TeoremaBolzano(a, c)==true){
                        b=c;
                        iterar++;
                    }else{
                        if(TeoremaBolzano(c, b)==true){
                            a=c;
                            iterar++;
                        }
                    }
   */
    
    
}
