/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_fijo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jhonathan
 */
public class Punto_Fijo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x0=0;
        double x1=0;
        double epsilon =0;
        int iterar =0;
        long inicio, fin, tiempo;
        Scanner leer = new Scanner(System.in);
        System.out.println("Señor usuario se le informa que este programa es para la aplicacion");
        System.out.println("del metodo de bisección en cual deberá ingresar algunos datos");
        System.out.println("de los cuales no podrá ingresarlos erroneamente ya que deberá");
        System.out.println("volver a empezar todo este proceso...");
        System.out.println("");
        System.out.println("");
        System.out.println("por favor señor usuario ingrese el valor de la 'X'");      
        try {
            double l = leer.nextDouble();
            x0 = l;
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
        double error =0;
        
        x1 = primerafuncion(x0);
        x0=x1;
        if(Math.abs(derivada1F(x0)) < 1 || Math.abs(derivada1F(x0)) < 1.09){
            System.out.println("ENTRO A LA PRIMERA FUNCION");
            x1 = primerafuncion(x0);
            error = Math.abs(x1-x0);
            while(error > epsilon){
                x0 = x1;
                x1 = primerafuncion(x0);
                error = Math.abs(x0-x1);
                iterar++;
                System.out.println("------------------------");
                System.out.println("error = "+error);
                System.out.println("La X es igual a "+x1);
            }
        }else{
            x1 = segundafuncion(x0);
            x0 = x1;
            if(Math.abs(derivada2F(x0)) < 1 || Math.abs(derivada2F(x0)) < 1.09){
            System.out.println("ENTRO A LA SEGUNDA FUNCION");
            x1 = segundafuncion(x0);
            error = Math.abs(x1-x0);
                while(error > epsilon){
                    x0 = x1;
                    x1 = segundafuncion(x0);
                    error = Math.abs(x0-x1);
                    iterar++;
                    System.out.println("------------------------");
                    System.out.println("error = "+error);
                    System.out.println("La X es igual a "+x1);
                }
            }
        }
        System.out.println("__________________________");
        System.out.println("El valor de la X es: "+x1);
        System.out.println("las iteraciones fueron:  "+iterar);
    }
    
    public static double primerafuncion(double x){
        double fx =0;
        fx = (Math.acos((10*x)+5));
        //fx = Math.pow((10*x)+5, 0.33333333333);
        return fx;
    }
    public static double segundafuncion(double x){
        double fx = (Math.cos(x)-5)/10;
        return fx;
    }
    public static double derivada1F(double x){
        double fx = 10 / Math.sqrt(1-(Math.pow(((10*x)+5),2)));
        //double fx = 10/(3*(Math.pow(((10*x)+5), 0.333333333333)));
        return fx;
    }
    public static double derivada2F(double x){
        double fx = -(Math.sin(x))/10;
        return fx;
    }
    
}

