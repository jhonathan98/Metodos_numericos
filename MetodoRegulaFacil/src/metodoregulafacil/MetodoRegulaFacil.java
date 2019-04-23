/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoregulafacil;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jhonathan
 */
public class MetodoRegulaFacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long inicio, fin, tiempo;
        
        double a = 0;
        double b = 0;
        double error = 0;
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
            error = E;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        double fa,fb,xi,x1,x2,fx;
        int iterar=0;
        inicio = System.currentTimeMillis();
        fa=funcion(a);
        fb=funcion(b);
        xi = hallarX(a, b);
        x1=xi;
        x2=0;
        fx=funcion(xi);
        if((fa*fx)>0){
            a=ubicarA(fa,fx,xi,a);
            b=ubicarB(fa, fx, xi,b);
            fa=funcion(a);
            fb=funcion(b);
            xi = hallarX(a, b);   
            x2=xi;
            fx=funcion(x2);
            while((Math.abs(x2-x1))>error){
                a=ubicarA(fa, fx, xi, a);
                b=ubicarB(fa, fx, xi, b);
                fa=funcion(a);
                fb=funcion(b);
                xi=hallarX(a, b);
                x1=x2;
                x2=xi;
                fx=funcion(x2);
                iterar++;
                System.out.println("x1 es igual a: "+x1);
                System.out.println("x2 es igual a: "+x2);
                System.out.println("pregunta es igual a: "+Math.abs(x2-x1));
                System.out.println("_________________________");
            }
            
        }else{
            if((fa*fx)<0){
            a=ubicarA(fa,fx,xi,a);
            b=ubicarB(fa, fx, xi,b);
            fa=funcion(a);
            fb=funcion(b);
            xi = hallarX(a, b);
            x2=xi;
            fx=funcion(x2);
            while((Math.abs(x2-x1))>error){
                a=ubicarA(fa, fx, xi, a);
                b=ubicarB(fa, fx, xi, b);
                fa=funcion(a);
                fb=funcion(b);
                xi=hallarX(a, b);
                x1=x2;
                x2=xi;
                fx=funcion(x2);
                iterar++;
                System.out.println("x1 es igual a: "+x1);
                System.out.println("x2 es igual a: "+x2);
                System.out.println("pregunta es igual a: "+Math.abs(x2-x1));
                System.out.println("_________________________");
            }
                
            }else{
                System.out.println(xi+" es la solución ");
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("el numero de iteraciones son: "+iterar);
        System.out.println("la solucion es: "+xi);
        fin = System.currentTimeMillis();
        tiempo = fin-inicio;
        System.out.println("el tiempo que demoró fue: "+tiempo+" milisegundos");
        leer.next();
    }
    
    
    public static double funcion(double j){
        double fx = j+(((Math.log(j)))/(Math.log(Math.E)))-6;
        //double fx = Math.cos(j)+(10*j)+5;
        //double fx = (Math.pow(Math.E, (j-1)))-(1/(1+j));
        //double fx = ((Math.log((Math.pow(j, 2))+1))/(Math.log(Math.E)))-(Math.pow(Math.E,(j/2)))*Math.cos((Math.PI*j));
        return fx;        
    }
    public static double hallarX(double a,double b){
        double xi=0;
        double fa=funcion(a);
        double fb=funcion(b);
        xi=((fa*b)-(fb*a))/(fa-fb);
        return xi;
    }
    public static double ubicarA(double fa, double fx,double xi,double a){
        
        if((fa*fx)>0){
            a=xi;
        }
        return a;
    }
    public static double ubicarB(double fa, double fx,double xi,double b){
        
        if((fa*fx)<0){
            b=xi;
        }
        return b;
    }

    
}

