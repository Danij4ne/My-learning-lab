
package DoWhile;

import java.util.Scanner;
public class doWhile {
//Se repite el cuerpo ede un estamento siempre y cuando la condicion de repeticion sea true, se ejecuta almenos una vez


 public void dowhileex() {
        Scanner scanner = new Scanner(System.in); // ✅ Creamos el objeto Scanner
        int numero; // ✅ Declaramos la variable antes del bucle

        // 🔹 El bloque "do" se ejecuta al menos una vez
        do {
            System.out.println("Introduce un número positivo:");
            numero = scanner.nextInt();  // 📥 El usuario introduce un número

            // Si el número es negativo, mostramos un aviso
            if (numero < 0) {
                System.out.println("❌ El número no es positivo, inténtalo otra vez.");
            }

        // 🔁 Esta condición se comprueba DESPUÉS de ejecutar el bloque
        } while (numero < 0); //mientras esto no se cumpla se sigue ejecutando el do

        // ✅ Cuando el número ya no es negativo (condición falsa), sale del bucle
        System.out.println("✔ Has introducido un número positivo: " + numero);

        scanner.close(); // ✅ Cerramos el Scanner
    }






}
