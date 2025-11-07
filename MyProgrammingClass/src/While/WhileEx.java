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





    
}
