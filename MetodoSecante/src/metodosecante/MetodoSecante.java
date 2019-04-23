/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosecante;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jhonathan
 */
public class MetodoSecante {

    /**
     * @param args the command line arguments
     */
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
        System.out.println("LA FUNCION ES X*SENO(X)-1");
        System.out.println("por favor señor usuario ingrese el valor de la primera 'X'");     
        try {
            double y1 = leer.nextDouble();
            a = y1;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        System.out.println("por favor señor usuario ingrese el valor de la segunda 'X'");
        try {
            double y2 = leer.nextDouble();
            b = y2;
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
        
        double x1,x2,error,x3;
        x1 = a;
        x2 = b;
        inicio = System.currentTimeMillis();
        int iterar=0;
        error = Math.abs(x2-x1);
        while(error>epsilon){
            System.out.println("la funcion en x1 es: "+funcion(x1));
            System.out.println("la funcion en x2 es: "+funcion(x2));          
            x3 = (funcionsecante(x1, x2));
            x1=x2;
            x2=x3;
            error = Math.abs(x2-x1);
            
            System.out.println("error                 "+error);
            System.out.println("Este es el x1: "+x1+" y este es el x2: "+x2);
            iterar++;    
            
        }
        System.out.println("_____________________");
        System.out.println("El valor de x = "+x2);
        System.out.println("El numero de iteraciones fueron: "+iterar);
        fin = System.currentTimeMillis();
        tiempo = fin-inicio;
        System.out.println("el tiempo que demoró fue: "+tiempo+" milisegundos");
        leer.next();
        
    }
    
    public static double funcionsecante(double x1, double x2){
        double fn = x2-((funcion(x2))*(x2-x1))/((funcion(x2))-(funcion(x1)));
        //System.out.println("resultado "+fn);
        return fn;
    }
    
    public static double radian(double x){
        double rad = (x*Math.PI)/180;
        return rad;
    }
    
    public static double funcion(double x){
        //double fx = Math.cos(x)+(10*x)+5;
        //double fx = (Math.sin(radian(x)));
        double fx = x*(Math.sin(x))-1;
        return fx;
    }
    
}
