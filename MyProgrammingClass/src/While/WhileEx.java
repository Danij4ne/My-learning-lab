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








    
}
