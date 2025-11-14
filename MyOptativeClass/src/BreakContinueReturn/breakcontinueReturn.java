package BreakContinueReturn;

public class breakcontinueReturn {

    // Ejemplo de break
    public void exBreak() { // Break rompe el bucle cuando se cumple la condición

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // Si i es par, rompemos el bucle
                System.out.println("break activado, salgo del bucle en i = " + i);
                break; 
            }
            System.out.println("Ejecución dentro del for: " + i);
        }
    }

    // Ejemplo de continue
    public void exContinue() { // continue salta una iteración

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Cuando i es 5, no se imprime y saltamos a la siguiente vuelta
                continue;
            }
            System.out.println("Número (continue): " + i);
        }
    }

    // Ejemplo de return
    public int doblar(int numero) { 
        // return termina el método y devuelve el valor
        return numero * 2;
    }

    // Ejemplos del operador ternario
    public void ejemplosTernario() {

        // Ejemplo 1: mayor de edad
        int edad = 20;
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje);

        // Ejemplo 2: par o impar
        int numero = 7;
        String tipo = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es: " + tipo);

        // Ejemplo 3: evitar división por cero
        int a = 10;
        int b = 0;
        String resultadoDivision = (b != 0) ? "Resultado = " + (a / b)
                                            : "No se puede dividir entre 0";
        System.out.println(resultadoDivision);

        // Ejemplo 4: mayor de dos números
        int x = 15;
        int y = 8;
        int mayor = (x > y) ? x : y;
        System.out.println("El mayor es: " + mayor);
    }

    // Método main para probar todo
    public static void main(String[] args) {

        // Creamos un objeto de esta clase para llamar a los métodos
        breakcontinueReturn ejemplo = new breakcontinueReturn();

        ejemplo.exBreak();
        ejemplo.exContinue();

        int resultado = ejemplo.doblar(7);
        System.out.println("El doble es: " + resultado);

        ejemplo.ejemplosTernario();
    }
}
