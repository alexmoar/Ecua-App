/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;




/**
 *
 * @author GUILLERMO_GU
 */
public class SolucionadorDEcuacionesRI {

    double x1, x2, x3, a, b, c;
    
    public SolucionadorDEcuacionesRI(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
       
        
    }
    
    public double[] Cuadratica() throws Exception {
        double potencia = Math.pow(b, 2) - (4 * a * c);
        double l[] ;

        if (a == 0) {
            throw new Exception("La derivada de grado 2 tiene coeficiente 0");
        }
        else if (a == 1 && b == 0 && c < 0) {
            l= new double[2];
            x1 = Math.sqrt(Math.abs(c));
            x2 = x1;

            l[0] = x1;
            l[1] = x2;
            
            System.out.println(" Solucion : " + " x1 = " + x1 + ", x2 = " + x2);
        }
        else if (b * b >= 4 * a * c) {
           l= new double[2];
            x1 = ((-b - Math.sqrt(potencia)) / (2 * a));
            x2 = ((-b + Math.sqrt(potencia)) / (2 * a));

            l[0] = x1;
            l[1] = x2;
            System.out.println(" Solucion : " + " x1 = " + x1 + "x2 =" + x2);
        }
         else {
             l= new double[3];
            x1 = (Math.sqrt(potencia * -1)) / (2 * a);
            x2 = x1 * (-1);
            x3 = (-b) / (2 * a); //Alpha de la respuesta imaginaria

            x1 = Math.round(x1 * 100) / (100d);
            x2=  Math.round(x2 * 100) / (100d);
            x3 = Math.round(x3 * 100) / (100d);

            l[0] = x1;
            l[1] = x2;
            l[2] = x3;

            System.out.println(" x1 = " + x3 + ", " + x1);
            System.out.println(" x2 = " + x3 + ", " + x2 + "i");

        }

        return l;

    }
    
    
    
    
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    
}
