/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora2;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CalibradorDigitalTest {

    @Test
    public void testPrecisionMedicion() {
        // Simulamos una medición utilizando el calibrador digital
        CalibradorDigital calibrador = new CalibradorDigital();
        double medicion = calibrador.medirLongitudComponente();
        
        // Definimos los límites de tolerancia aceptables
        double limiteInferior = 10.0;
        double limiteSuperior = 20.0;
        
        // Verificamos que la medición esté dentro de los límites de tolerancia
        assertTrue("La medición está fuera de los límites de tolerancia",
                   medicion >= limiteInferior && medicion <= limiteSuperior);
    }
}