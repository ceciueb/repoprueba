/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora2;

/**
 *
 * @author Patotes
 */
public class Calculadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 0;
        //double resultado = dividir(num1, num2);
       // System.out.println("Resultado: " + resultado);
    }
/*
    public static double sumar(double x, double y) {
        return (x + y);
    }

    public static double restar(double x, double y) {
        return (x - y);
    }

    public static double multiplicar(double x, double y) {
        return (x * y);
    }

    public static double dividir(double x, double y) {
        return (x / y);
    }
*/
 

    public static double calcularPrecio(double total) {
        if (total > 3000) {
            double resultado = total - (total * 0.05);
            return resultado;
        }
        return total;
    }
}
