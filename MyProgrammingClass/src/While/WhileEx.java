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

    // 🔁 Bucle while que se repite hasta llegar al número indicado
    while (contador <= cantidad) {
        System.out.print("Introduce la calificación " + contador + ": ");
        double nota = showme.nextDouble();  // 📥 leer nota
        suma += nota;                       // ➕ sumarla al total
        contador++;                         // ⏫ pasar a la siguiente calificación
    }

    // 📊 Calcular el promedio
    double promedio = suma / cantidad;

    // 🖨️ Mostrar resultados
    System.out.println("Suma total: " + suma);
    System.out.println("Promedio de calificaciones: " + promedio);

    showme.close();
}







    
}
