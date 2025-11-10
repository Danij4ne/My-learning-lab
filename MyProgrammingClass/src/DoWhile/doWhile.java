
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

    //ex2

     public void ValidadorContra() {
    Scanner showme = new Scanner(System.in);
    String contrasenia = "1234";
    String introcon;

    do {
        System.out.print("Introduce la contraseña: ");
        introcon = showme.nextLine();

        if (!introcon.equals(contrasenia)) {
            System.out.println("Contraseña incorrecta. Intenta de nuevo.");
        }

    } while (!introcon.equals(contrasenia));

    System.out.println("¡Contraseña correcta! Acceso permitido.");

    showme.close();
}



 //ex3
    public void acumulative() {
        Scanner showme = new Scanner(System.in);
        int introNumber;
        int suma = 0; // acumulador de la suma

        do {
            System.out.print("Introduce un número (0 o negativo para terminar): ");
            introNumber = showme.nextInt();

            if (introNumber > 0) {
                suma += introNumber; // sumamos al total
                System.out.println("Suma actual: " + suma);
            }

        } while (introNumber > 0); // repetir mientras sea positivo

        System.out.println("Programa terminado. Suma total: " + suma);
        showme.close();
}


    //ex4 

    public void adivinarnum() {
    Scanner showme = new Scanner(System.in);

    int secretnum = 3;       // Número secreto
    int adivinum;            // Número que introduce el usuario
    int intentos = 0;        // Contador de intentos

    System.out.println("¡Adivina el número entre 1 y 10!");

    do {
        System.out.print("Introduce tu intento: ");
        adivinum = showme.nextInt();
        intentos++;  // 🔹 Cada vez que el usuario escribe un número, aumentamos en 1

        if (adivinum > secretnum) {
            System.out.println("El número es menor. Intenta de nuevo.");
        } else if (adivinum < secretnum) {
            System.out.println("El número es mayor. Intenta de nuevo.");
        }

    } while (secretnum != adivinum);  // Repite mientras no acierte

    // ✅ Cuando acierta, sale del bucle
    System.out.println("¡Correcto! Has adivinado el número en " + intentos + " intentos.");

    showme.close();
}

//ex 5
    public void menuinteractivo() {
    Scanner showme = new Scanner(System.in);
    int opciones;

    do {
        System.out.println("--- MENÚ ---");
        System.out.println("1. Saludar");
        System.out.println("2. Despedirse");
        System.out.println("3. Ver hora");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: "); 

        opciones = showme.nextInt();

        switch (opciones) {
            case 1:
                System.out.println("¡Buenos días! ¿Cómo estás?");
                break;
            case 2:
                System.out.println("¿Te vas a ir? ¡Si es así, hasta luego!");
                break;
            case 3:
                System.out.println("La hora actual es: 11:30");
                break;
            case 4:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("❌ ERROR: número no válido.");
                break;
        }

        System.out.println(); 

    } while (opciones != 4); 

    showme.close(); 
}


    //ex 8

  public void validaEdad() {
    Scanner showme = new Scanner(System.in);
    int edad;

    do {
        System.out.print("Introduce tu edad: ");
        edad = showme.nextInt();

        if (edad < 0 || edad > 120) { 
            System.out.println("Edad no válida. Debe estar entre 0 y 120.");
        } else { 
            System.out.println("Edad válida: " + edad + " años. ¡Gracias!");
        }

    } while (edad < 0 || edad > 120);

    showme.close();
}




}
