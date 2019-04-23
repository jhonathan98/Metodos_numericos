/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodonewton;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jhonathan
 */
public class MetodoNewton {


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
            double x = leer.nextDouble();
            x0 = x;
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
        //System.out.println("funcion: "+funcion(x0)+" segunda derivada "+segundaDe(x0));
        //System.out.println("la primera derivada:  "+derivada(x0));
        //System.out.println("el resultado de sen de pi * 2 es:   "+Math.sin(Math.PI*2));
        inicio = System.currentTimeMillis();
        if((funcion(x0)*segundaDe(x0))>0){
            x1=x0-(funcion(x0)/derivada(x0));            
            while(Math.abs(x1-x0)>epsilon){
                x0=x1;
                x1=x0-(funcion(x0)/derivada(x0));
                iterar++;
                System.out.println("El valor de la x es: "+x0);
                //System.out.println("El valor de la segunda x es: "+x1);
            }
            System.out.println("----------------------------");
            System.out.println("El numero de iteracion fueron: "+iterar);
            System.out.println("El valor de la X es igual: "+x1);
            
        }else{
            System.out.println("Por favor seleccione otro valor para la X");
        }
        fin = System.currentTimeMillis();
        tiempo = fin-inicio;
        System.out.println("el tiempo que demoró fue: "+tiempo+" milisegundos");
        leer.next();
    }
    
    
    public static double funcion(double x){
        double fx = 0;
        fx = ((Math.log((Math.pow(x, 2))+1))/(Math.log(Math.E)))-(Math.pow(Math.E,(x/2)))*Math.cos((Math.PI*x));
        //fx = (Math.pow(Math.E, x))-(1/x);
        return fx;
    }
    public static double derivada(double x){
        double Fx =0;
        Fx = (Math.PI)*(Math.pow(Math.E, (x/2)))*Math.sin(Math.PI*x)-((Math.pow(Math.E, x/2))*(Math.cos((Math.PI)*x))/2)+((2*x)/(Math.pow(x, 2)+1));
        //Fx = (Math.pow(Math.E, x))+(1/Math.pow(x, 2));
        return Fx;
    }
    public static double segundaDe(double x){
        double Fx =0;
        Fx = (Math.PI)*(Math.pow(Math.E, (x/2)))*Math.sin(Math.PI*x)+((Math.pow(Math.PI, 2))*(Math.pow(Math.E, (x/2)))*(Math.cos((Math.PI)*x)))-((Math.pow(Math.E, x/2))*(Math.cos((Math.PI)*x))/4)+(2/(Math.pow(x, 2)+1))-((4*(Math.pow(x, 2)))/(Math.pow(((Math.pow(x, 2))+1), 2)));
        //Fx = (Math.pow(Math.E, x))-(2/Math.pow(x, 3));
        return Fx;
    }
    
}
