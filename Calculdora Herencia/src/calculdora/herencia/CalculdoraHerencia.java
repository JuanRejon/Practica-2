/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculdora.herencia;
import java.util.Scanner;
/**
 *
 * @author Juan Carlos
 */
public class CalculdoraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner MyObj = new Scanner(System.in);
        Calculadora casio = new Calculadora();
        CalculadoraCientifica casio2 = new CalculadoraCientifica();
        
        System.out.println("Ingresa el primer numero: ");
        double v1 = MyObj.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        double v2 = MyObj.nextDouble();
        System.out.println("Ingresa un tercer numero para las operaciones especiales:");
        double v3 = MyObj.nextDouble();
        
        double a = casio.suma(v1, v2);
        double b = casio.resta(v1, v2);
        double c = casio.multi(v1, v2);
        double d = casio.divis(v1, v2);
        
        double a2 = casio2.suma(v1, v2);
        double b2 = casio2.resta(v1, v2);
        double c2 = casio2.multi(v1, v2);
        double d2 = casio2.divis(v1, v2);
        
        double e = casio2.seno(v3);
        double f = casio2.coseno(v3);
        double g = casio2.tan(v3);
        
        System.out.println("\nCalculadora Simple");
        System.out.println("\nOPERACIONES BASICAS\n");
        
        System.out.println("La suma de " +v1 + " + " + v2 + " = " + a);
        System.out.println("La resta de " +v1 + " - " + v2 + " = " + b);
        System.out.println("La multiplicacion de " +v1 + " * " + v2 + " = " + c);
        System.out.println("La division de " +v1 + " / " + v2 + " = " + d);
        
        System.out.println("\nCalculadora Cientifica\n");
        System.out.println("\nOPERACIONES BASICAS\n");
        
        System.out.println("La suma de " +v1 + " + " + v2 + " = " + a2);
        System.out.println("La resta de " +v1 + " - " + v2 + " = " + b2);
        System.out.println("La multiplicacion de " +v1 + " * " + v2 + " = " + c2);
        System.out.println("La division de " +v1 + " / " + v2 + " = " + d2);
        
        System.out.println("\nOPERACIONES AVANZADAS\n");
        
        System.out.println("El seno de " +v3 + " = " + e);
        System.out.println("El coseno de " +v3 + " = " + f);
        System.out.println("La tangente de " +v3 + " = " + g);
    }
    
}
