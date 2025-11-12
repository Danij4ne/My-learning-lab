package While;

import java.util.Scanner;

public class WhileEx {

//while se ejecutara cuando se cumpla la condicion hasta que se interrumpa por un break o cambie la condicion

    

public void CodigoPin(){
Scanner scanner = new Scanner(System.in);
        int intentos = 3; // Número de intentos permitidos
        int pin = 1234;
        int pinUsuario = 0;
        boolean bloqueado = false;

        while (intentos > 0 && pinUsuario != pin) {
            System.out.println("Por favor introduce un PIN:");
            pinUsuario = scanner.nextInt();
            intentos--;

            if (pinUsuario != pin && intentos == 0) {
                bloqueado = true;
            }
        }

        if (bloqueado) {
            System.out.println("Teléfono bloqueado");
        } else {
            System.out.println("Bienvenido al teléfono");
        }

        scanner.close();
    }


    //ex1 
    public void ContadorWhile(){
        Scanner showme = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int myNumber = showme.nextInt();
        int i = 1;
        while (i <= myNumber) {
            System.out.println("" + i);
            i++;

        }
        System.out.println("Fin del conteo");
        showme.close();
    
    }


  //ex 6

  public void cuentaatras() {
    Scanner showme = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int mynumber = showme.nextInt();

    System.out.println("Cuenta atrás:");

    // 🔁 Cuenta desde N hasta 1
    while (mynumber >= 1) {
        System.out.println(mynumber);
        mynumber--;  // 👈 importante: disminuye el número en cada vuelta
    }

    System.out.println("¡Despegue!");

    showme.close();
}

//ex 7

    public void calcularPromedio() {
    Scanner showme = new Scanner(System.in);

    System.out.print("¿Cuántas calificaciones vas a introducir?: ");
    int cantidad = showme.nextInt();  // 🔹 Número total de calificaciones

    double suma = 0;                  // 🔹 Acumulador para sumar todas las notas
    int contador = 1;                 // 🔹 Contador para llevar cuántas calificaciones llevamos

    // Bucle while que se repite hasta llegar al número indicado
    while (contador <= cantidad) {
        System.out.print("Introduce la calificación " + contador + ": ");
        double nota = showme.nextDouble();  // 📥 leer nota
        suma += nota;                       // ➕ sumarla al total
        contador++;                         // ⏫ pasar a la siguiente calificación
    }

    //  Calcular el promedio
    double promedio = suma / cantidad;

    //  Mostrar resultados
    System.out.println("Suma total: " + suma);
    System.out.println("Promedio de calificaciones: " + promedio);

    showme.close();
}

    //ex9

    public void sistemanotas(){
         Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes hay?: ");
        int numEstudiantes = sc.nextInt(); // 🔹 Número total de estudiantes

        int[] notas = new int[numEstudiantes]; // 🔹 Creamos un array para guardar las notas

        int i = 0;
        // 🔹 Usamos un while para pedir las notas
        while (i < numEstudiantes) {
            System.out.print("Introduce la nota del estudiante " + (i + 1) + " (0-10): ");
            int nota = sc.nextInt();

            if (nota >= 0 && nota <= 10) {
                notas[i] = nota; // Guardamos la nota válida
                i++; // Avanzamos al siguiente estudiante
            } else {
                System.out.println("❌ Nota no válida. Debe estar entre 0 y 10.");
            }
        }

        System.out.println("\n--- REPORTE DE CALIFICACIONES ---");

        // 🔹 Usamos un for para recorrer el array de notas
        for (int j = 0; j < notas.length; j++) {
            int nota = notas[j];
            String letra;

            // 🔹 Usamos un switch para convertir la nota numérica en letra
            switch (nota) {
                case 10:
                case 9:
                    letra = "A";
                    break;
                case 8:
                case 7:
                    letra = "B";
                    break;
                case 6:
                case 5:
                    letra = "C";
                    break;
                case 4:
                case 3:
                    letra = "D";
                    break;
                default:
                    letra = "F";
                    break;
            }

            System.out.println("Estudiante " + (j + 1) + ": " + nota + " puntos = Calificación " + letra);
        }

        sc.close();
    }


    





    
}
