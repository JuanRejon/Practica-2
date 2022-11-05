/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculdora.herencia;

/**
 *
 * @author Juan Carlos
 */
public class CalculadoraCientifica extends OperacionesBasicas implements IDisOperacionesAvanzadas{

    @Override //sobreescritura de metodo, se usa cuando se usa un Interface
    public double seno(double a) {
        return Math.sin(a);
    }

    @Override
    public double coseno(double a) {
        return Math.cos(a);
    }

    @Override
    public double tan(double a) {
        return Math.tan(a);
    }
    
}
