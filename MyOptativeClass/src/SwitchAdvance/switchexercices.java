package SwitchAdvance;

import java.util.Scanner;

public class switchexercices {

    //ex 1
    public void sistemaCalificaciones() {
    Scanner showme = new Scanner(System.in);

    System.out.print("Introduce tu calificación (0 - 10): ");
    double calificacion = showme.nextDouble();

    // 🔹 Validar rango primero
    if (calificacion < 0 || calificacion > 10) {
        System.out.println("❌ Calificación fuera del rango (0 - 10).");
    } else {
        // 🔹 Convertimos la calificación a entero para el switch
        // Ejemplo: 8.9 → 8, 9.2 → 9
        int nota = (int) Math.floor(calificacion);

        String letra;

        switch (nota) {
            case 10:
            case 9:
                letra = "A";
                System.out.println("Excelente trabajo 💯 (Calificación A)");
                break;

            case 8:
            case 7:
                letra = "B";
                System.out.println("Muy bien 👏 (Calificación B)");
                break;

            case 6:
            case 5:
                letra = "C";
                System.out.println("Aprobado 😌 (Calificación C)");
                break;

            case 4:
                letra = "D";
                System.out.println("Insuficiente 😕 (Calificación D)");
                break;

            case 3:
            case 2:
            case 1:
            case 0:
                letra = "F";
                System.out.println("Reprobado ❌ (Calificación F)");
                break;

            default:
                letra = "Inválida";
                System.out.println("❌ Calificación fuera del rango (0 - 10).");
                break;
        }
    }

    showme.close();
}


    
}


























