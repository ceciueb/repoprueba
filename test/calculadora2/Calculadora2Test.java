/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patotes
 */
public class Calculadora2Test {
    
    public Calculadora2Test() {
    }



    @Test
    public void testCalcularPrecio() {
        System.out.println("calcularPrecio");
        double total = 1000.0;
        double expResult = 1000.0;
        double result = Calculadora2.calcularPrecio(total);
        assertEquals(expResult, result, 0);        
   
        System.out.println("calcularPrecio2");
        total = 10000.0;
        expResult = 9500.0;
        result = Calculadora2.calcularPrecio(total);
        assertEquals(expResult, result, 0);  
    }
    

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora2.main(args);
    }
    
}
