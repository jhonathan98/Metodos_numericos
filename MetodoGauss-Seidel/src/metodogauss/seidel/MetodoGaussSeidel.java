/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodogauss.seidel;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jhonathan
 */
public class MetodoGaussSeidel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a1,b1,c1,d1,e1,cons1,a2,b2,c2,d2,e2,cons2,a3,b3,c3,d3,e3,cons3,a4,b4,c4,d4,e4,cons4,a5,b5,c5,d5,e5,cons5;
        a1=b1=c1=d1=e1=cons1=a2=b2=c2=d2=e2=cons2=a3=b3=c3=d3=e3=cons3=a4=b4=c4=d4=e4=cons4=a5=b5=c5=d5=e5=cons5=0;
        double A0,B0,C0,D0,E0,A1,B1,C1,D1,E1;
        A0=B0=C0=D0=E0=A1=B1=C1=D1=E1=0;
        double epsilon,D,iterar,inicio,fin,tiempo;
        epsilon=D=iterar=inicio=fin=tiempo=0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Señor usuario se le informa que este programa es para la aplicacion");
        System.out.println("del metodo de sistemas lineales de ecuaciones cuadradas en cual ");
        System.out.println("deberá ingresar algunos datos de los cuales no podrá ingresarlos erroneamente ");
        System.out.println(" ya que deberá volver a empezar todo este proceso...");
        System.out.println("");
        System.out.println("");
        System.out.println("por favor señor usuario ingrese los valores de los coheficientes");
        System.out.println("de la primera ecuacion:");
        System.out.println("SON 5 COHEFICIENTES + # independiente POR ECUACION Y SON 5 ECUACIONES ");
        System.out.println("OJO!!!");
        try {
            double l = leer.nextDouble();
            a1 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            b1 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            c1 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        
        try {
            double l = leer.nextDouble();
            d1 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            e1 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            cons1 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        System.out.println("---------SEGUNDA ECUACION......");
        try {
            double l = leer.nextDouble();
            a2 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            b2 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            c2 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            d2 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            e2 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            cons2 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        System.out.println("--------TERCERA ECUACION.....");
        try {
            double l = leer.nextDouble();
            a3 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            b3 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            c3 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            d3 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            e3 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            cons3 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        System.out.println("---------CUARTA ECUACION.....");
        try {
            double l = leer.nextDouble();
            a4 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            b4 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            c4 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            d4 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            e4 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            cons4 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        System.out.println("--------------QUINTA ECUACION.....");
        try {
            double l = leer.nextDouble();
            a5 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            b5 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            c5 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            d5 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            e5 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
        try {
            double l = leer.nextDouble();
            cons5 = l;
        } catch (InputMismatchException ime) {
            System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
        }
     //ESTA ES LA MATRIZ.................................................   
     //....................
     //......................
        if(matrixdiagonalmenteDominante(a1, b1, c1, d1, e1, cons1, a2, b2, c2, d2, e2, cons2, a3, b3, c3, d3, e3, cons3, a4, b4, c4, d4, e4, cons4, a5, b5, c5, d5, e5, cons5)==true){
            System.out.println("INGRESE LOS VALORES INICIALES PARA HALLAR LAS INCOGNITAS");
            try {
            double l = leer.nextDouble();
            A0 = l;
            } catch (InputMismatchException ime) {
                System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
            }
            try {
            double l = leer.nextDouble();
            B0 = l;
            } catch (InputMismatchException ime) {
                System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
            }try {
            double l = leer.nextDouble();
            C0 = l;
            } catch (InputMismatchException ime) {
                System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
            }
            try {
            double l = leer.nextDouble();
            D0 = l;
            } catch (InputMismatchException ime) {
                System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
            }
            try {
            double l = leer.nextDouble();
            E0 = l;
            } catch (InputMismatchException ime) {
                System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
            }
            System.out.println("Ingrese el valor del epsilon.........");
            try {
            double l = leer.nextDouble();
            epsilon = l;
            } catch (InputMismatchException ime) {
                System.out.println("¡Cuidado! Solo puedes insertar números. Vuelve a ejecutar el programa ");            
            }
            
            inicio = System.currentTimeMillis();
            
                A1=ecuacion1(A0, B0, C0, D0, E0, a1, b1, c1, d1, e1, cons1);
                B1=ecuacion2(A1, B0, C0, D0, E0, a2, b2, c2, d2, e2, cons2);
                C1=ecuacion3(A1, B1, C0, D0, E0, a3, b3, c3, d3, e3, cons3);
                D1=ecuacion4(A1, B1, C1, D0, E0, a4, b4, c4, d4, e4, cons4);
                E1=ecuacion1(A1, B1, C1, D1, E0, a5, b5, c5, d5, e5, cons5);
                D=error(A0, A1, B0, B1, C0, C1, D0, D1, E0, E1);
            while(D>epsilon){
                A1=ecuacion1(A0, B0, C0, D0, E0, a1, b1, c1, d1, e1, cons1);
                B1=ecuacion2(A1, B0, C0, D0, E0, a2, b2, c2, d2, e2, cons2);
                C1=ecuacion3(A1, B1, C0, D0, E0, a3, b3, c3, d3, e3, cons3);
                D1=ecuacion4(A1, B1, C1, D0, E0, a4, b4, c4, d4, e4, cons4);
                E1=ecuacion1(A1, B1, C1, D1, E0, a5, b5, c5, d5, e5, cons5);
                D=error(A0, A1, B0, B1, C0, C1, D0, D1, E0, E1);
                System.out.println("Los valores de las incognitas son:");
                System.out.println(""+A1);
                System.out.println(""+B1);
                System.out.println(""+C1);
                System.out.println(""+D1);
                System.out.println(""+E1);
                A0=A1;
                B0=B1;
                C0=C1;
                D0=D1;
                E0=E1;
                iterar++;
                System.out.println("El valor de D es: "+D);
                System.out.println("El numero de iteraciones es: "+iterar);
            }
            fin = System.currentTimeMillis();
        tiempo = fin-inicio;
        System.out.println("el tiempo que demoró fue: "+tiempo+" milisegundos");     
            
            
            
            
            
            
            
        }else{
            System.err.println("LA MATRIZ NO ES DIAGONALMENTE DOMINANTE");
        }
    }
    
    
    public static double ecuacion1(double A,double B,double C, double D,double E,double a,double b,double c,double d,double e,double cons){
        double ecuacion =0;
        //ecuacion = (cons/a)+(0*A)-(B*(b/a))-(C*(c/a))-(D*(d/a))-(E*(e/a));
        ecuacion = 1-(0*A)-(0.1*B)-(0.1*C)-(0.1*D)-(0.1*E);
        return ecuacion;
    }
    public static double ecuacion2(double A,double B,double C, double D,double E,double a,double b,double c,double d,double e,double cons){
        double ecuacion =0;
        //ecuacion = (cons/b)-((a/b)*A)+(B*0)-(C*(c/b))-(D*(d/b))-(E*(e/b));
        ecuacion = 1-(0.1*A)-(0*B)-(0.1*C)-(0.1*D)-(0.1*E);
        return ecuacion;
    }
    public static double ecuacion3(double A,double B,double C, double D,double E,double a,double b,double c,double d,double e,double cons){
        double ecuacion =0;
        //ecuacion = (cons/c)-((a/b)*A)-(B*(b/c))+(C*0)-(D*(d/c))-(E*(e/c));
        ecuacion = 1-(0.1*A)-(0.1*B)-(0*C)-(0.1*D)-(0.1*E);
        return ecuacion;
    }
    public static double ecuacion4(double A,double B,double C, double D,double E,double a,double b,double c,double d,double e,double cons){
        double ecuacion =0;
        //ecuacion = (cons/d)-((a/b)*A)-(B*(b/d))-(C*(c/d))+(D*0)-(E*(e/d));
        ecuacion = 1-(0.1*A)-(0.1*B)-(0.1*C)-(0*D)-(0.1*E);
        return ecuacion;
    }
    public static double ecuacion5(double A,double B,double C, double D,double E,double a,double b,double c,double d,double e,double cons){
        double ecuacion =0;
        //ecuacion = (cons/e)-((a/e)*A)-(B*(b/e))-(C*(c/e))-(D*(d/e))+(E*0);
        ecuacion = 1-(0.1*A)-(0.1*B)-(0.1*C)-(0.1*D)-(0*E);
        return ecuacion;
    }
    
    
    public static boolean matrixdiagonalmenteDominante(double a1,double b1,double c1,double d1,double e1,double cons1,double a2,double b2,double c2,double d2,double e2,double cons2,double a3,double b3,double c3,double d3,double e3,double cons3,double a4,double b4,double c4,double d4,double e4,double cons4,double a5,double b5,double c5,double d5,double e5,double cons5){
        boolean condicion = true;
        if((Math.abs(a1)>Math.abs(b1) && Math.abs(a1)>Math.abs(c1) && Math.abs(a1)>Math.abs(d1) && Math.abs(a1)>Math.abs(e1))&&(Math.abs(b2)>Math.abs(a2) && Math.abs(b2)>Math.abs(c2) && Math.abs(b2)>Math.abs(d2) && Math.abs(b2)>Math.abs(e2))&&(Math.abs(c3)>Math.abs(a3) && Math.abs(c3)>Math.abs(b3) && Math.abs(c3)>Math.abs(d3) && Math.abs(c3)>Math.abs(e3))&&(Math.abs(d4)>Math.abs(a4) && Math.abs(d4)>Math.abs(b4) && Math.abs(d4)>Math.abs(c4) && Math.abs(d4)>Math.abs(e4))&&(Math.abs(e5)>Math.abs(a5) && Math.abs(e5)>Math.abs(b5) && Math.abs(e5)>Math.abs(c5) && Math.abs(e5)>Math.abs(d5))){
            condicion = true;
        }else{
            condicion = false;
        }
        
        return condicion;
    }
    
    public static double error(double ini1,double fin1,double ini2,double fin2,double ini3,double fin3,double ini4,double fin4,double ini5,double fin5){
        double error = 0;
        double d1,d2,d3,d4,d5;
        d1=d2=d3=d4=d5=0;
        d1=Math.abs(ini1-fin1);
        d2=Math.abs(ini2-fin2);
        d3=Math.abs(ini3-fin3);
        d4=Math.abs(ini4-fin4);
        d5=Math.abs(ini5-fin5);
        if(d1>d2 && d1>d3 && d1>d4 && d1>d5){
            error = d1;
        }else{
            if(d2>d1 && d2>d3 && d2>d4 && d2>d5){
                error = d2;
            }else{
                if(d3>d1 && d3>d2 && d3>d4 && d3>d5){
                    error = d3;
                }else{
                    if(d4>d1 && d4>d2 && d4>d3 && d5>d4){
                        error = d4;
                    }else{
                        error = d5;
                    }
                }
            }
        }
        return error;
    }
    
}
