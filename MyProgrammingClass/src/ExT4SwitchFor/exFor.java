package ExT4SwitchFor;

import java.util.Scanner;

public class exFor {

    // 🧩 Método que muestra cómo funciona un bucle for
    public void estructuraFor() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }

    // ex6
    public void TablaMultiplicador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int myNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int newNumber = myNumber * i;
            System.out.printf("%d x %d = %d%n", myNumber, i, newNumber);
        }

        scanner.close();
    }

    // ex7
    public void NumberSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int myNumber = scanner.nextInt();

        int newNumber = 0;
        for (int i = 1; i <= myNumber; i++) {
            newNumber = newNumber + i;
        }
        System.out.println("La suma es : " + newNumber);

        scanner.close();
    }

    // ex8
    public void ContarParesImpares() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int myNumber = scanner.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= myNumber; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Numeros pares encontrados: " + pares);
        System.out.println("Numeros impares encontrados : " + impares);

        scanner.close();
    }

    //ex9
 

    public void FactorialFor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int n = sc.nextInt();

        System.out.println("Calculando " + n + "!");

        int factorial = 1; 
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
            factorial *= i; 
        }

        System.out.println();
        System.out.println("El factorial de " + n + " es: " + factorial);

        sc.close();
    }

    //ex10 exp class





    
}
