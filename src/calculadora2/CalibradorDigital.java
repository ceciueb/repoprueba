/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora2;

import java.util.Random;

public class CalibradorDigital {
    // Método para simular la medición de la longitud de un componente
     public double medirLongitudComponente() {
        // Simulamos una medición aleatoria dentro de un rango de valores
        Random random = new Random();
        double longitudMedida = 9.5 + (30.5 - 9.5) * random.nextDouble(); // Valor aleatorio entre 9.5 y 30.5
        return longitudMedida;
    }
}